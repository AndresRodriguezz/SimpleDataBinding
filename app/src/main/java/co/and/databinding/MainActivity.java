package co.and.databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Andres Rodriguez 29/06/2020
 */
public class MainActivity extends AppCompatActivity {
    TextView tvNombre,tvEdad,tvEmail,tvAltura,tvPeso;
    Button btChangeActivity;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNombre = findViewById(R.id.tvNombre);
        tvEdad = findViewById(R.id.tvEdad);
        tvEmail = findViewById(R.id.tvEmail);
        tvAltura = findViewById(R.id.tvAltura);
        tvPeso = findViewById(R.id.tvPeso);
        setTitle("");

        user = new User("Andres","24","LaBala24@gail.com","1.70","73");

        tvNombre.setText(user.getNombre());
        tvEdad.setText(user.getEdad());
        tvEmail.setText(user.getEmail());
        tvAltura.setText(user.getAltura());
        tvPeso.setText(user.getPeso());

        user.setNombre("El Nene Con FLow");

        btChangeActivity = findViewById(R.id.btChangeActivity);

        btChangeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this,DataBindingActivity.class);
                startActivity(mIntent);
            }
        });


    }
}