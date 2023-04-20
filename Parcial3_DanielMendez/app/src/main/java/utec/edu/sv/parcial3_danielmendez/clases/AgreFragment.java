package utec.edu.sv.parcial3_danielmendez.clases;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import utec.edu.sv.parcial3_danielmendez.R;

public class AgreFragment extends Fragment {
    EditText txtNombre,txtApellido,txtTelefono,txtCorreo;
    Button btnAgregar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragmento_agregar,container,false);



    }

    /*return inflater.inflate(R.layout.fragmento_agregar,container,false);*/
}
