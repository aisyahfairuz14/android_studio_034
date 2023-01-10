package id.ac.poliban.e020320034.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button btFinish = findViewById(R.id.bt_finish);
        btFinish.setOnClickListener(v-> {
            finish();
        });
    }
}