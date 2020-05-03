package com.example.sepatulokal.adapter;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.sepatulokal.DetailActivity;
import com.example.sepatulokal.R;
import com.example.sepatulokal.model.Sepatu;

public class ListSepatuAdapter extends RecyclerView.Adapter<ListSepatuAdapter.ListViewHolder> {
    private ArrayList<Sepatu> listSepatu;

    public ListSepatuAdapter(ArrayList<Sepatu> list) {
        this.listSepatu = list;
    }

    @NonNull
    @Override
    public ListSepatuAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_sepatu, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Sepatu sepatu = listSepatu.get(position);

        Glide.with(holder.itemView.getContext())
                .load(sepatu.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvNama.setText(sepatu.getNama());
        holder.tvDeskripsi.setText(sepatu.getDeskripsi());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sepatu selectedSepatu = listSepatu.get(holder.getAdapterPosition());
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_NAMA, selectedSepatu.getNama());
                intent.putExtra(DetailActivity.EXTRA_DESKRIPSI, selectedSepatu.getDeskripsi());
                intent.putExtra(DetailActivity.EXTRA_FOTO, selectedSepatu.getPhoto());
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listSepatu.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDeskripsi;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_item_Nama);
            tvDeskripsi = itemView.findViewById(R.id.tv_item_Deskripsi);
        }
    }
}