package com.example.vineetvemula.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add,sub,mul,div;
        final TextView result;
        final EditText first,second;

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        result = findViewById(R.id.result);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2;
                String temp;

                temp = first.getText().toString();
                n1 = Integer.parseInt(temp);

                temp = second.getText().toString();
                n2 = Integer.parseInt(temp);

                double res;
                res = n1+n2;

                temp = String.valueOf(res);
                result.setText(temp);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2;
                String temp;

                temp = first.getText().toString();
                n1 = Integer.parseInt(temp);

                temp = second.getText().toString();
                n2 = Integer.parseInt(temp);

                double res;
                res = n1-n2;

                temp = String.valueOf(res);
                result.setText(temp);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2;
                String temp;

                temp = first.getText().toString();
                n1 = Integer.parseInt(temp);

                temp = second.getText().toString();
                n2 = Integer.parseInt(temp);

                double res;
                res = n1*n2;

                temp = String.valueOf(res);
                result.setText(temp);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2;
                String temp;

                temp = first.getText().toString();
                n1 = Integer.parseInt(temp);

                temp = second.getText().toString();
                n2 = Integer.parseInt(temp);

                double res;
                res = n1/n2;

                temp = String.valueOf(res);
                result.setText(temp);
            }
        });

    }
}
