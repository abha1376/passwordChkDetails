package com.example.abhatripathi.password;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ChallangesResultsActivity extends AppCompatActivity {
    TextView name, challanges, like,part,message;
    String s="how much do you like the wednesday's session: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challange_results_activity);
        Intent i = getIntent();
        String str= i.getStringExtra("KEY1");
        name =(TextView) findViewById(R.id.outputname);
        name.setText(str);
        String st=i.getStringExtra("KEY2");
        challanges=(TextView)findViewById(R.id.outputchallanges);
        challanges.setText(st);
        int a=i.getIntExtra("KEY5", 0);
        like=(TextView)findViewById(R.id.outputlike);
        like.setText(s + a);
        String pt=i.getStringExtra("KEY3");
        part=(TextView)findViewById(R.id.outputpart);
        part.setText(pt);
        String msg=i.getStringExtra("Key4");
        message=(TextView)findViewById(R.id.outputmessage);
        message.setText(msg);
    }
}
