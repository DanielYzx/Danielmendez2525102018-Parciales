package utec.edu.sv.parcial2_danielmendez;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {
     Context contexto;
     int layout;
     List <String> nombre;
     List <String> cargo;
    List <String> compania;
     int[]imagenes;

    public Adaptador(Context contexto, int layout, List<String> nombre,List<String> cargo, List<String> compania, int[] img) {
        this.contexto = contexto;
        this.layout = layout;
        this.nombre = nombre;
        this.cargo = cargo;
        this.compania = compania;
        this.imagenes = img;
    }

    @Override
    public int getCount() {
        return nombre.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= convertView;
        LayoutInflater layoutInflater=LayoutInflater.from(contexto);
        v=layoutInflater.inflate(R.layout.listado,null);

        TextView txtNombre=v.findViewById(R.id.xtxNombre);
        txtNombre.setText(nombre.get(position));

        TextView txtDescrip=v.findViewById(R.id.txtCargo);
        txtDescrip.setText(cargo.get(position));

        TextView txtCompania=v.findViewById(R.id.txtCompania);
        txtCompania.setText(compania.get(position));

        ImageView img=v.findViewById(R.id.imageView);
        img.setImageResource(imagenes[position]);

       return v;

    }
}
