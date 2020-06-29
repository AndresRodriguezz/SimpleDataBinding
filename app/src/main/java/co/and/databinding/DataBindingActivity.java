package co.and.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import co.and.databinding.databinding.ActivityDataBindingBinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataBindingActivity extends AppCompatActivity {
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_binding);

        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding);

        user = new User("Mari","26", "Mari@hotmail.com","170","60");
        binding.setUserTest(user);

        user.setNombre("El Nene Con FLow");

        Button btnChangeActivity = findViewById(R.id.btChangeActivityToNormal);
        btnChangeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(DataBindingActivity.this,MainActivity.class);
                startActivity(mIntent);
            }
        });
    }

}