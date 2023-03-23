package utec.edu.sv.parcial1_etps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btLogin;
    EditText txNombre, txContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btLogin=findViewById(R.id.btnLogin);
        txNombre=findViewById(R.id.txtNombre);
        txContra=findViewById(R.id.txtContra);

    }

    public void pantalla (View v){

        String nombre=txNombre.getText().toString();
        String contra=txContra.getText().toString();

        if(nombre.equals("parcialETps1")&& contra.equals("p4rC14l#tp$")){
        //con esto se llama a la pantalla 3
        Intent intento=new Intent(this,Pantalla4v.class);
        startActivity(intento);
        }else {
            //Intent intento=new Intent(this,Pantalla_Error.class);
          //  startActivity(intento);
            Toast toastP = new Toast(getApplicationContext());
            LayoutInflater inflater= getLayoutInflater();
            View layout=inflater.inflate(R.layout.activity_pantalla_error,(ViewGroup) findViewById(R.id.lytMensaje));

            TextView txtMensaje=(TextView) layout.findViewById(R.id.txtvMensajeError);
            txtMensaje.setText("contraseña y usuario no son correctos");
            toastP.setDuration(Toast.LENGTH_LONG);
            toastP.setView(layout);
            toastP.show();
        }

    }
}