package kourosh.changecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clear (View view){
        EditText input = (EditText) findViewById(R.id.input5);
        input.setText("");
        input = (EditText) findViewById(R.id.input10);
        input.setText("");
        input = (EditText) findViewById(R.id.input25);
        input.setText("");
        input = (EditText) findViewById(R.id.input1);
        input.setText("");
        input = (EditText) findViewById(R.id.input2);
        input.setText("");

        TextView output = (TextView) findViewById(R.id.output5);
        output.setText("0.00");
        output = (TextView) findViewById(R.id.output10);
        output.setText("0.00");
        output = (TextView) findViewById(R.id.output25);
        output.setText("0.00");
        output = (TextView) findViewById(R.id.output1);
        output.setText("0.00");
        output = (TextView) findViewById(R.id.output2);
        output.setText("0.00");
        output = (TextView) findViewById(R.id.total);
        output.setText("0.00");

    }

    public void  calculate (View view){

        double total = 0 ;
        EditText input;
        TextView output;
        double value;

        input = (EditText) findViewById(R.id.input5);
        if (input.getText().toString().equals("")){
            value = 0;
        }else {
            value = Double.parseDouble(input.getText().toString());
        }

        value = value * 0.05;
        total += value;
        output = (TextView) findViewById(R.id.output5);
        output.setText(String.format("%.2f",value));

        input = (EditText) findViewById(R.id.input10);
        if (input.getText().toString().equals("")){
            value = 0;
        }else {
            value = Double.parseDouble(input.getText().toString());
        }
        value = value * 0.10;
        total += value;
        output = (TextView) findViewById(R.id.output10);
        output.setText(String.format("%.2f",value));

        input = (EditText) findViewById(R.id.input25);
        if (input.getText().toString().equals("")){
            value = 0;
        }else {
            value = Double.parseDouble(input.getText().toString());
        }
        value = value * 0.25;
        total += value;
        output = (TextView) findViewById(R.id.output25);
        output.setText(String.format("%.2f",value));

        input = (EditText) findViewById(R.id.input1);
        if (input.getText().toString().equals("")){
            value = 0;
        }else {
            value = Double.parseDouble(input.getText().toString());
        }
        total += value;
        output = (TextView) findViewById(R.id.output1);
        output.setText(String.format("%.2f",value));

        input = (EditText) findViewById(R.id.input2);
        if (input.getText().toString().equals("")){
            value = 0;
        }else {
            value = Double.parseDouble(input.getText().toString());
        }
        value = value * 2;
        total += value;
        output = (TextView) findViewById(R.id.output2);
        output.setText(String.format("%.2f",value));


        output = (TextView) findViewById(R.id.total);
        output.setText(String.format("%.2f",total));

    }
}
