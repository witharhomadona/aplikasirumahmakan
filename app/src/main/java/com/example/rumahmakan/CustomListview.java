package com.example.rumahmakan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListview extends ArrayAdapter<String> {

private String[] nama_makanan;
private String[] harga_makanan;
private int[] gambar_makanan;
private Activity context;
    public CustomListview(Activity context,String[] nama_makanan, String[] harga_makanan,int[] gambar_makanan) {
        super(context, R.layout.row, nama_makanan );


        this.context = context;
        this.nama_makanan = nama_makanan;
        this.harga_makanan = harga_makanan;
        this.gambar_makanan = gambar_makanan;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r=convertView;
        ViewHolder viewHolder= null;
        if(r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.row,null, true);
            viewHolder= new ViewHolder(r);
            r.setTag(viewHolder);
        }

        else{
            viewHolder= (ViewHolder) r.getTag();

        }
        viewHolder.ivw.setImageResource(gambar_makanan[position]);

        viewHolder.tvw1.setText(nama_makanan [position]);
        viewHolder.tvw2.setText(harga_makanan [position]);


        return r;



    }
    class ViewHolder
    {
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;
        ViewHolder(View v)
        {
            tvw1 = (TextView) v.findViewById(R.id.txtmakanan);
            tvw2 = (TextView) v.findViewById(R.id.txtharga);
            ivw = (ImageView) v.findViewById(R.id.image);
        }

    }
}
