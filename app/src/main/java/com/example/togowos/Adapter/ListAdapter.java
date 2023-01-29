package com.example.togowos.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.togowos.MainActivity;
import com.example.togowos.R;
import com.example.togowos.model.Departure;

import java.util.ArrayList;
import java.util.Optional;

public class ListAdapter extends ArrayAdapter<Departure> {

    public ListAdapter(Context context, ArrayList<Departure> departureArrayList) {

        super(context, R.layout.activity_list_view, R.id.buss, departureArrayList);

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ArrayList<ArrayList<Departure>> departure = MainActivity.departureboard;

        ArrayList<Departure> soloboard = new ArrayList<>();
        Optional<ArrayList<Departure>> soloboards =  departure.stream().findFirst();
        if(soloboards.isPresent()){
            soloboard = soloboards.get();
        }

        ArrayList<ArrayList<String>> soloboardstrings = new ArrayList<>();
        for(Departure item: soloboard) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(item.getBgColor());
            temp.add(item.getFgColor());
            temp.add(item.getName());
            temp.add(item.getDirection());
            temp.add(item.getTime());
            temp.add(item.getSname());
            soloboardstrings.add(temp);
        }

        Departure departmodify = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_view,parent,false);
        }
        View mainPage = LayoutInflater.from(getContext()).inflate(R.layout.activity_main,parent,false);

        // all the data we going to change
        TextView buss = convertView.findViewById(R.id.buss);
        TextView nameOfBuss = convertView.findViewById(R.id.nameOfBus);
        TextView direction = convertView.findViewById(R.id.direction);
        TextView time = convertView.findViewById(R.id.time);
        TextView title = mainPage.findViewById(R.id.TitleOfStation);
        RelativeLayout relativeLayout = convertView.findViewById(R.id.relativeLayout);

        if(position%2 == 0){
            relativeLayout.setBackgroundColor (android.graphics.Color.parseColor("#808080"));
        }else{
            relativeLayout.setBackgroundColor (android.graphics.Color.parseColor("#AEAEAE"));
        }
        buss.setBackgroundColor(android.graphics.Color.parseColor(departmodify.getBgColor()));
        buss.setTextColor(android.graphics.Color.parseColor(departmodify.getFgColor()));
        buss.setText(departmodify.getSname());
        nameOfBuss.setText(departmodify.getName());
        direction.setText(departmodify.getDirection());
        time.setText(departmodify.getTime());
        title.setText(departmodify.getStop());

        return super.getView(position, convertView, parent);
    }
}
