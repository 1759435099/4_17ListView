package com.example.a4_17listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceID;
    public FruitAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceID = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        if (convertView != null){
            view = LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
        }else {
            view = convertView;
        }
//        Fruit fruit = getItem(position);//获取当前项的Fruit实例
//        View view = LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
        ImageView fruitImage = view.findViewById(R.id.fruit_image);
        TextView fruitName = view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageID());
        fruitName.setText(fruit.getName());
        return view;
    }
}
