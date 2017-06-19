package com.example.hatice.ders231;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Site> list=new ArrayList<Site>();
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.liste);

        list.add(new Site("Oda Tv"));
        list.add(new Site("Sözcü"));
        list.add(new Site("NTV"));
        list.add(new Site("CNN Türk"));
        list.add(new Site("BBC Türkçe"));
        list.add(new Site("Akşam"));
        list.add(new Site("Sabah"));
        list.add(new Site("Cumhuriyet"));
        list.add(new Site("Milliyet"));
        list.add(new Site("Posta"));

        Adaptor adp=new Adaptor(this,list);
        lv.setAdapter(adp);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(getApplicationContext(),list.get(position).getSite_ad(), Toast.LENGTH_SHORT).show();

                Intent in=new Intent(getApplicationContext(),Main2Activity.class);//normalde this yazmamız lazım ilk yere ama yeniden açtığımız için bunu yazdık.
                in.putExtra("site",list.get(position).getSite_ad());
                startActivity(in);



            }
        });



    }
}
