package com.example.adibf.adibfakhrimuhtadi_1202154192_m2;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by adibf on 2/18/2018.
 */

public class adapterListMenu extends RecyclerView.Adapter<adapterListMenu.ListViewHolder> {

    private List<MakananMethod> bMenu;
    private Context aContext;

    public adapterListMenu(Context aContext, List<MakananMethod> bMenu) {
        this.aContext = aContext;
        this.bMenu = bMenu;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inf = LayoutInflater.from(aContext);
        View view = inf.inflate(R.layout.item_list_menu, null);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        final MakananMethod current = bMenu.get(position); //membuat variable current dengan class MakananMethod
        holder.cNama.setText(current.getNama());
        holder.cHarga.setText(current.getHarga());
        holder.cGambar.setImageDrawable(aContext.getResources().getDrawable(current.getGambar()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(aContext, DetailMenu.class); //Mengambil data makanan dengan method yang ada pada class MakananMethod
                intent.putExtra("nama", current.getNama());
                intent.putExtra("harga", current.getHarga());
                intent.putExtra("gambar", current.getGambar());
                intent.putExtra("komposisi", current.getKomposisi());
                aContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return bMenu.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView cNama, cHarga;
        ImageView cGambar;


        public ListViewHolder(View itemView) {
            super(itemView);
            cNama = (TextView) itemView.findViewById(R.id.namaMakanan); //menampilkan data makanan
            cHarga = (TextView) itemView.findViewById(R.id.hargaMakanan);
            cGambar = (ImageView) itemView.findViewById(R.id.gambarMakanan);


        }

    }
}
