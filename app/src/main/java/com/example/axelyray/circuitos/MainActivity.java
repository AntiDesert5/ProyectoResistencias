package com.example.axelyray.circuitos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TableLayout tabla1;
    Button B1,B2;
    TableRow TR1;
    TextView b;
    EditText a ,resul;

    int n= 0;
    int p=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1 = (Button) findViewById(R.id.B1_0);
        tabla1 = (TableLayout) findViewById(R.id.Tabla1_0);
        resul=(EditText) findViewById(R.id.Res);
        B2=(Button) findViewById(R.id.elim);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
    }

    public void onClick(View control_pulsado) {
        n=1;

        switch (control_pulsado.getId()){
            case R.id.B1_0:
            if(n==1) {
                p++;
                String cadena = Integer.toString(p);
                TR1 = new TableRow(this);
                a = new EditText(this);

                b = new TextView(this);
                a.setHint("ingrese datos");
                b.setText(cadena);
                TR1.addView(a);
                TR1.addView(b);
                tabla1.addView(TR1);
                resul.setText(a.getText());
            }
            break;
            case R.id.elim:
                p=1;
                int childCount = tabla1.getChildCount();
                if (childCount > 1) {
                    tabla1.removeViews(1, childCount - 1);
                }
                break;
        }
    }
}
