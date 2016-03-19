package com.example.android.calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button clear;
    Button sign;
    Button backspace;
    Button percent;
    Button nine;
    Button eight;
    Button seven;
    Button six;
    Button five;
    Button four;
    Button three;
    Button two;
    Button one;
    Button dot;
    Button zero;
    Button equal;
    Button add;
    Button sub;
    Button mul;
    Button div;
    EditText txt;
    private double vadd,vsub,vmul,vdiv,vpercent,s1;
    private String s="",s2="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.equal);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        clear = (Button) findViewById(R.id.clear);
        sign = (Button) findViewById(R.id.sign);
        backspace = (Button) findViewById(R.id.backspace);
        percent = (Button) findViewById(R.id.percent);
        txt = (EditText) findViewById(R.id.editText);
        txt.setSelection(txt.getText().length());

    }

    public void OnClick(View v) {

        if (v == one) {
            String s = txt.getText().toString();
            s = s + "1";
            txt.setText(s);
        } else if (v == two) {
            String s = txt.getText().toString();
            s = s + "2";
            txt.setText(s);
        } else if (v == three) {
            String s = txt.getText().toString();
            s = s + "3";
            txt.setText(s);
        } else if (v == four) {
            String s = txt.getText().toString();
            s = s + "4";
            txt.setText(s);
        } else if (v == five) {
            String s = txt.getText().toString();
            s = s + "5";
            txt.setText(s);
        } else if (v == six) {
            String s = txt.getText().toString();
            s = s + "6";
            txt.setText(s);
        } else if (v == seven) {
            String s = txt.getText().toString();
            s = s + "7";
            txt.setText(s);
        } else if (v == eight) {
            String s = txt.getText().toString();
            s = s + "8";
            txt.setText(s);
        } else if (v == nine) {
            String s = txt.getText().toString();
            s = s + "9";
            txt.setText(s);
        } else if (v == zero) {
            String s = txt.getText().toString();
            s = s + "0";
            txt.setText(s);
        } else if (v == dot) {
            String s = txt.getText().toString();
            if ( s.matches(""))
            s="0.";
            else if(s.indexOf('.')!=-1)
                txt.setText(s);

            else
            s = s + ".";
            txt.setText(s);
        } else if (v == backspace) {
            String s2 = txt.getText().toString();
            if (s2.matches(""))
            Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
            else {
                String s = txt.getText().toString();
                s = s.substring(0, s.length() - 1);
                txt.setText(s);
            }
        } else if (v == sign) {
            String s2 = txt.getText().toString();
            if ( s2.matches(""))
             Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
            else
                txt.setText(Double.toString((Double.parseDouble(s2)) * (-1)));
        } else if (v == clear) {
            txt.setText("");
        }
        else if (v == add) {

            String s2 = txt.getText().toString();
            if ( s2.matches(""))
                Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
           else {
                vadd = 1;
                vsub=0;
                vmul=0;
                vdiv=0;
                vpercent=0;
                s1 = Double.parseDouble(txt.getText().toString());
                txt.setText("");

            }
        } else if (v == sub) {

            String s2 = txt.getText().toString();
            if ( s2.matches(""))
                Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
            else {
                vsub = 1;
                vadd=0;
                vmul=0;
                vdiv=0;
                vpercent=0;
                s1 = Double.parseDouble(txt.getText().toString());
                txt.setText("");
            }
        } else if (v == mul) {

            String s2 = txt.getText().toString();
            if ( s2.matches(""))
                Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
            else {
                vmul = 1;
                vadd=0;
                vsub=0;
                vdiv=0;
                vpercent=0;
                s1 = Double.parseDouble(txt.getText().toString());
                txt.setText("");
            }
        } else if (v == div) {

            String s2 = txt.getText().toString();
            if ( s2.matches(""))
                Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
            else {
                vdiv = 1;
                vadd=0;
                vsub=0;
                vmul=0;
                vpercent=0;
                s1 = Double.parseDouble(txt.getText().toString());
                txt.setText("");
            }
        } else if(v == percent){

            String s2 = txt.getText().toString();
            if ( s2.matches(""))
                Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
            else {
                vpercent = 1;
                vadd=0;
                vsub=0;
                vmul=0;
                vdiv=0;
                s1 = Double.parseDouble(txt.getText().toString());
                txt.setText("");
            }
        }
        else if (v == equal ) {
           String s2 =txt.getText().toString();
          if ( s2.matches(""))
                Toast.makeText(this, "Enter a number first", Toast.LENGTH_SHORT).show();
            else if(vadd==1||vsub==1||vmul==1||vdiv==1||vpercent==1)
            {   double s = Double.parseDouble(txt.getText().toString());
                if (vadd == 1) {
                    txt.setText(Double.toString(s1 + s));
                    vadd = 0;
                } else if (vsub == 1) {
                    txt.setText(Double.toString(s1 - s));
                    vsub = 0;
                } else if (vmul == 1) {
                    txt.setText(Double.toString(s1 * s));
                    vmul = 0;
                } else if (vdiv == 1) {
                    txt.setText(Double.toString(s1 / s));
                    vdiv = 0;
                } else if (vpercent == 1) {
                    txt.setText(Double.toString((s1 * 100) / s));
                    vpercent=0;
                }
            }else
              txt.setText(s2);

            }
        }

    }








