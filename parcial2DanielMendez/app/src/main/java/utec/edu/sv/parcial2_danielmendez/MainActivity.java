package utec.edu.sv.parcial2_danielmendez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 ListView lista;


 int []img;
 List<String>nombre;
 List<String>cargo;
 List<String>compania;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.lsvPersonas);

        nombre= new ArrayList<String>();
        nombre.add("Daniel Méndez");
        nombre.add("Alexander Pierrot");
        nombre.add("Carlos Lopez");
        nombre.add("Sara Bonz");
        nombre.add("Liliana Clarence");
        nombre.add("Benito Peralta");
        nombre.add("Juan Jaramillo");
        nombre.add("Christian Steps");
        nombre.add("Alexa Giraldo");
        nombre.add("Linda Murillo");
        nombre.add("Lizeth Astrada");

        cargo= new ArrayList<String>();
        cargo.add("Programador");
        cargo.add("CEO");
        cargo.add("Asistente");
        cargo.add("Directora de Marketing");
        cargo.add("Diseñadora de Producto");
        cargo.add("Supervisor de Ventas");
        cargo.add("CEO");
        cargo.add("CTO");
        cargo.add("Lead Programmer");
        cargo.add("Directora de Marketing");
        cargo.add("Ceo");

        compania= new ArrayList<String>();
        compania.add("Utec");
        compania.add("Insures S.O");
        compania.add("Hospital Blue");
        compania.add("Electrical Part Itd");
        compania.add("Creative App");
        compania.add("Neumáticos Press");
        compania.add("Banco Nacional");
        compania.add("Cooperativa Verde");
        compania.add("Frutispfy");
        compania.add("Seguros Boliver");
        compania.add("Concesionario Motolox");

        int [] pictures={
                R.drawable.perfil,
                R.drawable.imag1,
                R.drawable.imag2,
                R.drawable.imag3,
                R.drawable.imag4,
                R.drawable.imag5,
                R.drawable.imag6,
                R.drawable.imag7,
                R.drawable.imag8,
                R.drawable.imag9,
                R.drawable.imag10
        };



       // ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        Adaptador adaptador=new Adaptador(this,R.layout.listado,nombre,cargo,compania,pictures);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "selecciono"+nombre.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}