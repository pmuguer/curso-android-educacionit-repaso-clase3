package com.example.pablo.repasoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
//import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private ListView listView;
    //private List<com.example.pablo.repasoandroid.Producto> productoList;
    private com.example.pablo.repasoandroid.ProductoAdapter myAdapter;
    private ArrayList listaProductos;
    private Integer celularId;
    private Integer tabletId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listView = (ListView)findViewById(R.id.list_view_producto);
        celularId = this.getResources().getIdentifier("phone", "drawable", this.getPackageName());
        tabletId = this.getResources().getIdentifier("tablet", "drawable", this.getPackageName());

        listaProductos = new ArrayList<>();
        listaProductos.add(new com.example.pablo.repasoandroid.Producto("Celular",
                1500, celularId));
        listaProductos.add(new com.example.pablo.repasoandroid.Producto("Tablet",
                2500, tabletId));

        myAdapter = new com.example.pablo.repasoandroid.ProductoAdapter(listaProductos);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                com.example.pablo.repasoandroid.Producto producto =
                        (com.example.pablo.repasoandroid.Producto)listView.getItemAtPosition(position);

                Toast.makeText(Main3Activity.this, "Producto:" + producto.getNombre(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
