package com.example.cjpc.bbwmoneycounter;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    EditText ones;
    EditText fives;
    EditText tens;
    EditText twentys;
    EditText fiftys;
    EditText hundreds;

    TextView totalView;

    Button submitButton;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bind the EditText Views
        ones = (EditText)findViewById(R.id.ones);
        fives = (EditText)findViewById(R.id.fives);
        tens = (EditText)findViewById(R.id.tens);
        twentys = (EditText)findViewById(R.id.twentys);
        fiftys = (EditText)findViewById(R.id.fiftys);
        hundreds = (EditText)findViewById(R.id.hundreds);

        totalView = (TextView)findViewById(R.id.totalView);
        submitButton = (Button)findViewById(R.id.submitButton);

//        submitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                calculate();
//            }
//        });


    }

    public void calculate(View view){
        //get entered numbers from the fields and convert to integers
        Double onesV = Double.parseDouble(ones.getText().toString());
        Double fivesV = Double.parseDouble(fives.getText().toString());
        Double tensV = Double.parseDouble(tens.getText().toString());
        Double twentysV = Double.parseDouble(twentys.getText().toString());
        Double fiftysV = Double.parseDouble(fiftys.getText().toString());
        Double hundredsV = Double.parseDouble(hundreds.getText().toString());

        Double calcones = onesV * 1;
        Double calcfives = fivesV * 5;
        Double calctens =  tensV * 10;
        Double calctwentys = twentysV * 20;
        Double calcfiftys = fiftysV * 50;
        Double calchundreds = hundredsV * 100;


        Double claculatedValue =  calcones + calcfives + calctens + calctwentys + calcfiftys + calchundreds;

        DecimalFormat decimalFormat = new DecimalFormat("0");


//        totalView.setText(claculatedValue.toString());

        totalView.setText(decimalFormat.format(claculatedValue));
    }
}
