package utec.edu.sv.parcial4_danielmendez;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ClienteFragment extends Fragment {

    EditText txtCodCliente,txtNomCliente,txtAplellidoCliente,txtCiudadCliente;
    TextView tvMensajes;
    Button btnGuardar;
    Context context;
    public ClienteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatActivity appCompatActivity =new AppCompatActivity();



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inflater.inflate(R.layout.fragment_cliente, container, false);

        View view=inflater.inflate(R.layout.fragment_cliente, container, false);
        txtCodCliente=view.findViewById(R.id.edtID_Cliente);
        txtNomCliente=view.findViewById(R.id.edtNombreCliente);
        txtAplellidoCliente=view.findViewById(R.id.edtApellidoCliente);
        txtCiudadCliente=view.findViewById(R.id.edtCiudadCliente);
        btnGuardar=view.findViewById(R.id.btnGuardar);
        tvMensajes=view.findViewById(R.id.tvMensaje);

        btnGuardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Clientes baseVehi = new Clientes(context);

                long codiSave=baseProv.insertProvedor(txtNomProv.getText().toString(),txtTelProv.getText().toString(),txtCorrProv.getText().toString());
                if(codiSave>0){
                    tvMensajes.append("Registro insertado");
                }
                else{
                    tvMensajes.append("Error en insertar");
                }
            }
        });

        txtNomProv.setText("Prueba");
        // Inflate the layout for this fragment
        return view;
    }
}