package id.ac.poliban5bmi.aisyah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    private int mcount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.showCount);
//        if (savedInstanceState != null) {
//            mcount =savedInstanceState.getInt("result");
//            mShowCount.setText(Integer.toString(mcount));
//        }
    }

//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        outState.putInt("result",mcount);
//        super.onSaveInstanceState(outState);
//    }

    public void ShowCount(View view) {
        mcount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mcount));
        }
    }
}