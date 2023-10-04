package ru.tatalia.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button but0, but1, but2, but3, but4, but5, but6, but7, but8, but9, butPercent,
            butMinus, butPlus, butMultiply, butDelete, butClear, butDivide, butSolve, butPoint;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        but0 = findViewById(R.id.button_0);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = String.valueOf(textView.getText());
                str += "0";
                textView.setText(str);
            }
        });
        but1 = findViewById(R.id.button_1);
        but2 = findViewById(R.id.button_2);
        but3 = findViewById(R.id.button_3);
        but4 = findViewById(R.id.button_4);
        but5 = findViewById(R.id.button_5);
        but6 = findViewById(R.id.button_6);
        but7 = findViewById(R.id.button_7);
        but8 = findViewById(R.id.button_8);
        but9 = findViewById(R.id.button_9);
        butPercent = findViewById(R.id.button_percent);
        butMinus = findViewById(R.id.button_minus);
        butPlus = findViewById(R.id.button_plus);
        butMultiply = findViewById(R.id.button_multiply);
        butDelete = findViewById(R.id.button_del);
        butClear = findViewById(R.id.button_clear);
        butDivide = findViewById(R.id.button_divide);
        butSolve = findViewById(R.id.button_solve);
        butPoint = findViewById(R.id.button_point);
    }

    public void onClickButton(View view){

    }
}