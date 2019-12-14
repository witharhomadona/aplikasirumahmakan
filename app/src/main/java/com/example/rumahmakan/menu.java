package com.example.rumahmakan;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class menu<context> extends AppCompatActivity {

    ListView lst;


    String nama_makanan[] = {"Bakso", "Gado-Gado", "Gorengan", "Gudeg", "Opor-Ayam", "Pempek",
            "Rawon", "Rendang", "Soto", "Nasi Kuning", "Otak-otak", "Sate", "Pecel Lele", "Ketoprak"};

    String harga_makanan[] = {"Rp. 15.000", "Rp. 10.000", "Rp. 2.000", "Rp. 30.000", "Rp. 55.000", "Rp. 2.000",
            "Rp. 20.000", "Rp. 65.000", "Rp. 18.000", "Rp. 8.000", "Rp. 2.000", "Rp. 25.000", "Rp. 15.000", "Rp. 12.000"};

    int gambar_makanan[] = {R.drawable.bakso, R.drawable.gadogado, R.drawable.gorengan, R.drawable.gudeg,
            R.drawable.oporyam, R.drawable.pempek, R.drawable.rawon, R.drawable.rendang, R.drawable.soto, R.drawable.nasikuning,
            R.drawable.otakotak, R.drawable.sate, R.drawable.pecellele, R.drawable.ketoprak};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lst = (ListView) findViewById(R.id.listmakanan);

        CustomListview customListview=new CustomListview(this,nama_makanan,harga_makanan,gambar_makanan);
        lst.setAdapter(customListview);

    }
}
//        MyAdapter adapter = new MyAdapter(this, nama_makanan, harga_makanan, gambar_makanan);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                if (position == 0) {
//                    Toast.makeText(menu.this, "bakso description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, " gado-gado description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "gorengan description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, " gudeg description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "ketoprak description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "bakso description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "nasi kuning description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "opor ayam description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "otak-otak description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "pecel lele description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "pempek description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "rawon description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "rendang description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(menu.this, "sate description", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//    }
//
//    class MyAdapter extends ArrayAdapter<String> {
//
//        Context context;
//        String rnama_makanan[];
//        String rharga_makanan[];
//        int rgambar_makanan[];
//
//        MyAdapter(context c, String nama_makanan[], String harga_makanan[], int gambar_makanan[]) {
//            super((Context) c, R.layout.row, R.id.txtmakanan, nama_makanan);
//            this.context = (Context) c;
//            this.rnama_makanan = nama_makanan;
//            this.rharga_makanan = harga_makanan;
//            this.rgambar_makanan = gambar_makanan;
//
//        }
//
//        @SuppressLint("ViewHolder")
//        @NonNull
//        @Override
//        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//
//            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            @SuppressLint("ViewHolder") View row;
//            row = LayoutInflater.inflate(R.layout.row, parent, false);
//            ImageView images = row.findViewById(R.id.image);
//            TextView mynama_makanan = row.findViewById(R.id.txtmakanan);
//            TextView myharga_makanan = row.findViewById(R.id.txtharga);
//
//
//            images.setImageResource(rgambar_makanan[position]);
//            mynama_makanan.setText(rnama_makanan[position]);
//            myharga_makanan.setText(rharga_makanan[position]);
//
//
//            return row;
//        }
//    }
//}
   // }