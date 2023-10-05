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
    private String zero = "0";
    private boolean firstSymbol = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        but0 = findViewById(R.id.button_0);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "0";
                textView.setText(str);
            }
        });
        but1 = findViewById(R.id.button_1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "1";
                textView.setText(str);
            }
        });
        but2 = findViewById(R.id.button_2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "2";
                textView.setText(str);
            }
        });
        but3 = findViewById(R.id.button_3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "3";
                textView.setText(str);
            }
        });
        but4 = findViewById(R.id.button_4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "4";
                textView.setText(str);
            }
        });
        but5 = findViewById(R.id.button_5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "5";
                textView.setText(str);
            }
        });
        but6 = findViewById(R.id.button_6);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "6";
                textView.setText(str);
            }
        });
        but7 = findViewById(R.id.button_7);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "7";
                textView.setText(str);
            }
        });
        but8 = findViewById(R.id.button_8);
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "8";
                textView.setText(str);
            }
        });
        but9 = findViewById(R.id.button_9);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "9";
                textView.setText(str);
            }
        });
        butPercent = findViewById(R.id.button_percent);

        butMinus = findViewById(R.id.button_minus);
        butMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstSymbol();
                str = String.valueOf(textView.getText());
                str += "-";
                textView.setText(str);
            }
        });
        butPlus = findViewById(R.id.button_plus);
        butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = String.valueOf(textView.getText());
                str += "+";
                textView.setText(str);
            }
        });
        butMultiply = findViewById(R.id.button_multiply);
        butMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = String.valueOf(textView.getText());
                str += "*";
                textView.setText(str);
            }
        });
        butDelete = findViewById(R.id.button_del);
        butDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = String.valueOf(textView.getText());
                if (str.length() > 1){
                    str.substring(0, str.length() - 1);
                }else{
                    str = "0";
                    firstSymbol = true;
                }
                textView.setText(str);
            }
        });
        butClear = findViewById(R.id.button_clear);
        butClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = String.valueOf(textView.getText());
                str = "0";
                firstSymbol = true;
                textView.setText(str);
            }
        });
        butDivide = findViewById(R.id.button_divide);
        butDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = String.valueOf(textView.getText());
                str += "/";
                textView.setText(str);
            }
        });
        butSolve = findViewById(R.id.button_solve);
        butPoint = findViewById(R.id.button_point);
        butPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = String.valueOf(textView.getText());
                str += ".";
                textView.setText(str);
            }
        });
    }


    private void setFirstSymbol(){
        if (firstSymbol == true) {
            str = String.valueOf(textView.getText());
            if (str.length() == 1 & str.equals(zero)) {
                str = "";
                textView.setText(str);
                firstSymbol = false;
            }
        }
    }
}