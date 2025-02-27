package com.appmovil.appmovil1260061;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btncancelar = findViewById(R.id.btnCancelarRegister);
        Button btnregistrar = findViewById(R.id.btnRegistrarRegister);
        Button btnlimpiar = findViewById(R.id.btnLimpiarRegister);

        EditText txtnombre = findViewById(R.id.txtApellidoNombre);
        EditText txttelefono = findViewById(R.id.txtTelefonoRegister);
        EditText txtemail = findViewById(R.id.txtCorreoRegister);
        EditText txtpass = findViewById(R.id.txtPassRegister);

        btncancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conec = new Intent(Register.this,MainActivity.class);
                startActivity(conec);
            }
        });
    }
}