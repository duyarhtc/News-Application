package com.example.hatice.ders231;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hatice on 13.06.2017.
 */

public class Adaptor extends BaseAdapter{
    private LayoutInflater Inflater;
    private List<Site> liste = new ArrayList<Site>();


    public Adaptor(Activity activity, List<Site> liste) {

        Inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.liste = liste;
    }

    @Override
    public int getCount() {
        return liste.size();
    }

    @Override
    public Object getItem(int position) {
        return liste.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView = Inflater.inflate(R.layout.icerik_layout, null);
        TextView textView = (TextView) satirView.findViewById(R.id.text_id);
        ImageView imageView = (ImageView) satirView.findViewById(R.id.simge);

        Site site = liste.get(position);
        textView.setText(site.getSite_ad());

        if (site.getSite_ad().equals("Oda Tv")) {
            imageView.setImageResource(R.mipmap.ic_odatv);
        }
        else if (site.getSite_ad().equals("Sözcü")) {
            imageView.setImageResource(R.mipmap.ic_sozcu);
        }
        else if(site.getSite_ad().equals("NTV")){
            imageView.setImageResource(R.mipmap.ic_ntv);

        }
        else if(site.getSite_ad().equals("CNN Türk")){
            imageView.setImageResource(R.mipmap.ic_cnn);

        }
        else if(site.getSite_ad().equals("BBC Türkçe")){
            imageView.setImageResource(R.mipmap.ic_bbc);

        }
        else if(site.getSite_ad().equals("Akşam")){
            imageView.setImageResource(R.mipmap.aksam);

            }
        else if(site.getSite_ad().equals("Sabah")){
            imageView.setImageResource(R.mipmap.sabah);

        }
        else if(site.getSite_ad().equals("Cumhuriyet")){
            imageView.setImageResource(R.mipmap.cumhuriyet);

        }
        else if(site.getSite_ad().equals("Milliyet")){
            imageView.setImageResource(R.mipmap.milliyet);

        }
        else if(site.getSite_ad().equals("Posta")){
            imageView.setImageResource(R.mipmap.posta);

        }
        return satirView;


    }
}
