package com.example.pablo.repasoandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductoAdapter extends BaseAdapter {
    private List<com.example.pablo.repasoandroid.Producto> listaDeProductos;

    public ProductoAdapter(List<com.example.pablo.repasoandroid.Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    @Override
    public int getCount() {
        return listaDeProductos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaDeProductos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.celda_producto, parent, false);

        com.example.pablo.repasoandroid.Producto producto = (com.example.pablo.repasoandroid.Producto)getItem(position);

        TextView nombre_producto = (TextView)view.findViewById(R.id.textViewNombreProducto);
        //TextView id_imagen = (TextView)view.findViewById(R.id.textViewIdImagen);
        TextView precio_producto = (TextView)view.findViewById(R.id.textViewPrecioProducto);
        ImageView imagen = (ImageView)view.findViewById(R.id.imagen_producto);

        nombre_producto.setText(producto.getNombre());
        //id_imagen.setText(producto.getImagen().toString());
        precio_producto.setText(producto.getPrecio().toString());
        imagen.setImageResource(producto.getImagen());

        return view;
    }
}
