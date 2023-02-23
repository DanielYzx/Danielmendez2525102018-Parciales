package utec.edu.sv.parcial1_etps1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pantalla4v extends AppCompatActivity {
    EditText edtPeso, edtAltura ,edtInf;
    TextView txResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4v);
        edtPeso=findViewById(R.id.txtPeso);
        edtAltura=findViewById(R.id.txtAltura);
        txResultado=findViewById(R.id.txtvResul);


    }

    public void Mostrar (View v)
    {
        double datopeso,datoaltura,resultado;
        String Mensaje;

        datopeso=Double.parseDouble(edtPeso.getText().toString());
        datoaltura=Double.parseDouble(edtAltura.getText().toString());
        resultado=((datopeso/datoaltura*datoaltura));
        if (resultado< 10.5 ) {
           Mensaje="Críticamente Bajo de Peso";
        } else if (resultado> 10.5 && resultado< 18.5) {
            Mensaje="Severamente Bajo de Peso";
            
        } else if (resultado> 18.5 && resultado< 25) {
            Mensaje="Bajo de Peso";

        } else if (resultado> 25 && resultado< 30) {
            Mensaje="Normal (peso saludable)";

        } else if (resultado> 30 && resultado< 35) {
            Mensaje="Sobrepeso";

        } else if (resultado> 35 && resultado< 40) {
            Mensaje="Obesidad Clase 1 - Moderadamente Obeso";

        } else if (resultado> 40 && resultado<=50) {
            Mensaje="Obesidad Clase 2 - Severamente Obeso";

        } else {
            Mensaje="Obesidad Clase 3 - Críticamente Obeso";
        }
        txResultado.setText("su IMC es:"+resultado+"\n"+"su estado es:"+(Mensaje));
    }
}

