package com.example.a4_17listview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    private String[] data = {"Apple","banana","Orange","WaterMelon","Pear","Grape","Cherry",
//            "Apple","banana","Orange","WaterMelon","Pear","Grape","Cherry"};
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list_view);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this,android.R.layout.simple_expandable_list_item_1,data
//        );
//        listView.setAdapter(adapter);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(this,R.layout.fruit_item,fruitList);
        listView.setAdapter(adapter);
    }
    public void initFruits(){
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple",R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit apple1 = new Fruit("Banana",R.drawable.ic_launcher_background);
            fruitList.add(apple1);
            Fruit apple2 = new Fruit("WaterMalon",R.drawable.ic_launcher_background);
            fruitList.add(apple2);
            Fruit apple3 = new Fruit("Graps",R.drawable.ic_launcher_background);
            fruitList.add(apple3);
            Fruit apple4 = new Fruit("Mango",R.drawable.ic_launcher_background);
            fruitList.add(apple4);
        }
    }
}