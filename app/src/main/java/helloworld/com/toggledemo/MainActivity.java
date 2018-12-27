package helloworld.com.toggledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleGender;
    TextView textViewOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleGender = findViewById(R.id.toggleButton);
        textViewOut = findViewById(R.id.textView);
        toggleGender.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textViewOut.setText("Male");
                }else {
                    textViewOut.setText("Female");
                }
            }
        });
    }
}
