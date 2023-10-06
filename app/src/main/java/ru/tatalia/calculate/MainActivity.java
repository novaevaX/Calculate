package ru.tatalia.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.xml.xpath.XPathExpression;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button but0, but1, but2, but3, but4, but5, but6, but7, but8, but9, butPercent,
            butMinus, butPlus, butMultiply, butDelete, butClear, butDivide, butSolve, butPoint;
    private String str;
    private String zero = "0";
    private String findStr = "0123456789";
    private boolean firstSymbol = true;
    private boolean notNumber = false;

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
                checkLastSymbol();
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
                checkLastSymbol();
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
                checkLastSymbol();
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
                checkLastSymbol();
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
                checkLastSymbol();
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
                checkLastSymbol();
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
                checkLastSymbol();
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
                checkLastSymbol();
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
                checkLastSymbol();
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
                checkLastSymbol();
            }
        });
        butPercent = findViewById(R.id.button_percent);

        butMinus = findViewById(R.id.button_minus);
        butMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (notNumber == false) {
                    setFirstSymbol();
                    str = String.valueOf(textView.getText());
                    str += "-";
                    textView.setText(str);
                    checkLastSymbol();
                }else{
                    str = String.valueOf(textView.getText());
                    str = str.substring(0, str.length() - 1);
                    str += "-";
                    textView.setText(str);
                    checkLastSymbol();
                }
            }
        });
        butPlus = findViewById(R.id.button_plus);
        butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (notNumber == false) {
                    str = String.valueOf(textView.getText());
                    str += "+";
                    textView.setText(str);
                    checkLastSymbol();
                }else{
                    str = String.valueOf(textView.getText());
                    str = str.substring(0, str.length() - 1);
                    str += "+";
                    textView.setText(str);
                    checkLastSymbol();
                }
            }
        });
        butMultiply = findViewById(R.id.button_multiply);
        butMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notNumber == false) {
                    str = String.valueOf(textView.getText());
                    str += "*";
                    textView.setText(str);
                    checkLastSymbol();
                }else{
                    str = String.valueOf(textView.getText());
                    str = str.substring(0, str.length() - 1);
                    str += "*";
                    textView.setText(str);
                    checkLastSymbol();
                }
            }
        });
        butDivide = findViewById(R.id.button_divide);
        butDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (notNumber == false) {
                    str = String.valueOf(textView.getText());
                    str += "/";
                    textView.setText(str);
                    checkLastSymbol();
                } else{
                    str = String.valueOf(textView.getText());
                    str = str.substring(0, str.length() - 1);
                    str += "/";
                    textView.setText(str);
                    checkLastSymbol();
                }
            }
        });
        butPoint = findViewById(R.id.button_point);
        butPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (notNumber == true){
                    str = String.valueOf(textView.getText());
                    str += "0.";
                    textView.setText(str);
                    checkLastSymbol();
                } else {
                    str = String.valueOf(textView.getText());
                    str += ".";
                    textView.setText(str);
                    checkLastSymbol();
                }
            }
        });
        butDelete = findViewById(R.id.button_del);
        butDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = String.valueOf(textView.getText());
                if (str.length() > 1){
                    str = str.substring(0, str.length() - 1);
                }else{
                    str = "0";
                    firstSymbol = true;
                }
                textView.setText(str);
                checkLastSymbol();
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
                checkLastSymbol();
            }
        });
        butSolve = findViewById(R.id.button_solve);
        butSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
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

    private void checkLastSymbol(){
        String oneSymb;
        oneSymb = str.substring(str.length() - 1, str.length());
        notNumber = findStr.indexOf(oneSymb) < 0 ? true : false;
    }


}