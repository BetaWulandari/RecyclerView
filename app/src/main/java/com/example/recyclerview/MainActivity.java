package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] s1;
            String[] s2;
    int[] images = {R.drawable.bika_ambon,R.drawable.gudeg,R.drawable.jawada_ntt,
            R.drawable.karedok,R.drawable.kerak_telor,R.drawable.mie_aceh,
            R.drawable.rawon_surabaya,R.drawable.rendang,R.drawable.sate_pusut_ntb,R.drawable.tili_aya};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.indonesia_foods);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}