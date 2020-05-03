package com.example.sepatulokal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.sepatulokal.R;


import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAMA= "extra_Nama";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    public static final String EXTRA_FOTO= "extra_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvNama = findViewById(R.id.nama);
        TextView tvDeskripsi= findViewById(R.id.deskripsi);
        ImageView detailImageView= findViewById(R.id.img_detail_photo);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        Integer photo = getIntent().getIntExtra(EXTRA_FOTO, R.drawable.shoes);

        tvNama.setText(nama);
        tvDeskripsi.setText(deskripsi);
        Glide.with(this).load(photo).into(detailImageView);
    }
}
