package com.jorge.pm_ej2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import model.Producto;

public class AdaptadorProducto extends RecyclerView.Adapter<AdaptadorProducto.HolderProducto> {

    Context context;
    private final ArrayList<Producto> productos;

    public AdaptadorProducto(ArrayList<Producto> productos, Context context) {
        this.context = context;
        this.productos = productos;
    }

    @NonNull
    @Override
    public HolderProducto onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto, parent, false);
        return new HolderProducto(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderProducto holder, final int position) {

        holder.txtNombreProducto.setText(productos.get(position).getNombre());
        holder.txtPrecioProducto.setText("" + productos.get(position).getPrecio());
        holder.rtPuntuacion.setRating((float) productos.get(position).getPuntuacion());
        Uri img = null;

        if (MainActivity.listProductos.get(position).isFragil()) {
            img = Uri.parse("android.resource://com.jorge.pm_ej2/" + R.drawable.rojo);
        } else {
            img = Uri.parse("android.resource://com.jorge.pm_ej2/" + R.drawable.verde);
        }

        holder.imgFragil.setImageURI(null);
        holder.imgFragil.setImageURI(img);

        holder.cardProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, editarProducto.class);
                Data.setPosicion(position);
                context.startActivity(intent);
            }
        });

    }

    public static void setImage () {


    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public void refrescar() {
        notifyDataSetChanged();
    }

    public static class HolderProducto extends RecyclerView.ViewHolder {

        CardView cardProducto;
        TextView txtNombreProducto;
        TextView txtPrecioProducto;
        RatingBar rtPuntuacion;
        ImageView imgFragil;

        public HolderProducto(@NonNull View itemView) {
            super(itemView);
            cardProducto = itemView.findViewById(R.id.cardProducto);
            txtNombreProducto = itemView.findViewById(R.id.txtNombreProducto);
            txtPrecioProducto = itemView.findViewById(R.id.txtPrecioProducto);
            rtPuntuacion = itemView.findViewById(R.id.rtBarPuntuacion);
            imgFragil = itemView.findViewById(R.id.imgFragil);
        }
    }
}
