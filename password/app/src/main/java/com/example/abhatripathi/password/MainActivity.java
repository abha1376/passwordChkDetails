package com.example.abhatripathi.password;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton btn;
    EditText edpass,user,msg;
    Switch chk;
    CheckBox box,box1,box2,box3,box4,box5;
    String str="Challanges Completed:",name,part="what part do you like:",message,fmessage="Message for Harshit Bhaiya:";
    RadioButton btn1,btn2,btn3;
    SeekBar seekBar;
    int progress=0;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edpass=(EditText)findViewById(R.id.password);
        seekBar=(SeekBar)findViewById(R.id.seekBar);
        seekBar.setMax(10);
        seekBar.setProgress(progress);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress=i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        user=(EditText)findViewById(R.id.user);
        msg=(EditText) findViewById(R.id.message);
        chk=(Switch)findViewById(R.id.switch1);
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                 edpass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                 edpass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 name= (user.getText().toString());
            }
        });
        box=(CheckBox)findViewById(R.id.checkBox1);
        box1=(CheckBox)findViewById(R.id.checkBox2);
        box2=(CheckBox)findViewById(R.id.checkBox3);
        box3=(CheckBox)findViewById(R.id.checkBox4);
        box4=(CheckBox)findViewById(R.id.checkBox5);
        box5=(CheckBox)findViewById(R.id.checkBox6);
        box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    str = str + ",Change password challange";
                }
            }
        });
        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean c) {
                if(c) {
                    str = str + ",Background Drawable challange";
                }
            }
        });
        box2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean d) {
                if(d) {
                    str = str + ",Right Checkboxes challange";
                }
            }
        });
        box3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean e) {
                if(e) {
                    str = str + ",Show menu challange";
                }
            }
        });
        box4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean f) {
              if(f){
                  str=str+",Multiple Menus Challange";
              }
            }
        });
        box5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean g) {
             if(g){
                 str=str+",Menu with icons challange";
             }
            }
        });
        btn1=(RadioButton)findViewById(R.id.radioButton);
        btn2=(RadioButton)findViewById(R.id.radioButton1);
        btn3=(RadioButton)findViewById(R.id.radioButton2);
        btn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean h) {
                if (h) {
                    part=part+"Presentation/Explaination";
                }
            }
        });
        btn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean k) {
                if(k) {
                    part=part+"Demo/Hands On Experience";
                }
            }
        });
        btn3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean l) {
                if(l){
                    part=part+"I hated them all";
                }
            }
        });
         msg.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 message= (msg.getText().toString());
                 fmessage=fmessage+message;
             }
         });
        btn=(FloatingActionButton)findViewById(R.id.tab);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ChallangesResultsActivity.class);
                i.putExtra("KEY1", name);
                i.putExtra("KEY2", str);
                i.putExtra("KEY3",part);
                i.putExtra("KEY4",fmessage);
                i.putExtra("KEY5", progress);
                startActivity(i);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return true;
    }

    public Boolean onCreateOptionsMenu(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.profile){
            return true;
        }
        if(id==R.id.Settings){
            return true;
        }
        return true;
    }


}
