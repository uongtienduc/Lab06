package com.example.tiki_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvShoes;
    ShoesAdapter adt;
    ArrayList<Shoes> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvShoes = findViewById(R.id.list_item);

        arrayList = new ArrayList<>();
        arrayList.add(new Shoes(R.drawable.shoes_rm_preview_b,"Nike shoes-discount 50%","Pls touch to see detail"));
        arrayList.add(new Shoes(R.drawable.shoes_rm_preview_a,"Nike shoes-discount 50%","Pls touch to see detail"));
        arrayList.add(new Shoes(R.drawable.shoes_rm_preview,"Nike shoes-discount 50%","Pls touch to see detail"));
        arrayList.add(new Shoes(R.drawable.shoes_rm_yellow,"Nike shoes-discount 50%","Pls touch to see detail"));
        arrayList.add(new Shoes(R.drawable.shoes_rm_purple,"Nike shoes-discount 50%","Pls touch to see detail"));
        arrayList.add(new Shoes(R.drawable.shoes_white_removebg_preview,"Nike shoes-discount 50%","Pls touch to see detail"));
        arrayList.add(new Shoes(R.drawable.color_removebg_preview,"Nike shoes-discount 50%","Pls touch to see detail"));

        adt = new ShoesAdapter(this, R.layout.list_customshoes, arrayList);

        lvShoes.setAdapter(adt);
    }
}