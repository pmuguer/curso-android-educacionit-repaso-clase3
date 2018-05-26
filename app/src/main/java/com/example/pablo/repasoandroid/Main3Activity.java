package com.example.pablo.repasoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private ListView listView;
    private List<com.example.pablo.repasoandroid.Producto> productoList;
    private com.example.pablo.repasoandroid.ProductoAdapter myAdapter;
    private ArrayList listaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listView = (ListView)findViewById(R.id.list_view_producto);

        listaProductos = new ArrayList<>();
        listaProductos.add(new com.example.pablo.repasoandroid.Producto("Celular"));
        listaProductos.add(new com.example.pablo.repasoandroid.Producto("Tablet"));

        myAdapter = new com.example.pablo.repasoandroid.ProductoAdapter(listaProductos);
        listView.setAdapter(myAdapter);

    }
}
