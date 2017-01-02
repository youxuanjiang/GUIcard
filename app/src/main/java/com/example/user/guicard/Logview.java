package com.example.user.guicard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.graphics.Typeface;
import android.widget.TextView;
import android.widget.Button;

import android.content.Intent;

public class Logview extends AppCompatActivity implements View.OnClickListener{

    private Button B1;
    private Button B2;
    private Button B3;
    private Button B4;
    private Button B5;
    private Button B6;
    private Button B7;
    private Button B8;
    private Button B9;
    private Button Next;
    private Button Back;
    UserInfo user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_view);

        TextView IG = (TextView) findViewById(R.id.instrument);
        TextView next = (TextView) findViewById(R.id.next1);
        TextView back = (TextView) findViewById(R.id.back1);

        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        B4 = (Button) findViewById(R.id.B4);
        B5 = (Button) findViewById(R.id.B5);
        B6 = (Button) findViewById(R.id.B6);
        B7 = (Button) findViewById(R.id.B7);
        B8 = (Button) findViewById(R.id.B8);
        B9 = (Button) findViewById(R.id.B9);
        Back = (Button) findViewById(R.id.back);
        Next = (Button) findViewById(R.id.nextB1);
        user = new UserInfo(getIntent().getExtras().getString("ACCOUNT"), getIntent().getExtras().getString("PASSWORD"),
                             getIntent().getExtras().getString("NAME"),0);

        //設定字體
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Sushi.ttf");
        Typeface font1 = Typeface.createFromAsset(getAssets(), "fonts/surf.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/Shine.ttf");
        IG.setTypeface(font);
        next.setTypeface(font1);
        back.setTypeface(font1);
        B1.setTypeface(font2);
        B2.setTypeface(font2);
        B3.setTypeface(font2);
        B4.setTypeface(font2);
        B5.setTypeface(font2);
        B6.setTypeface(font2);
        B7.setTypeface(font2);
        B8.setTypeface(font2);
        B9.setTypeface(font2);

        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);
        B7.setOnClickListener(this);
        B8.setOnClickListener(this);
        B9.setOnClickListener(this);
        Back.setOnClickListener(this);
        Next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       if(view==B1){
           if(!B1.isSelected()) {
               B1.setSelected(true);
               Toast.makeText(view.getContext(), "你選擇木吉他", Toast.LENGTH_SHORT).show();
               user.interes+=1;
           }
           else{
               B1.setSelected(false);
               Toast.makeText(view.getContext(), "你取消木吉他", Toast.LENGTH_SHORT).show();
               user.interes-=1;
           }
       }if(view==B2){
            if(!B2.isSelected()) {
                B2.setSelected(true);
                Toast.makeText(view.getContext(), "你選擇演奏", Toast.LENGTH_SHORT).show();
                user.interes+=2;
            }
            else{
                B2.setSelected(false);
                Toast.makeText(view.getContext(), "你取消演奏", Toast.LENGTH_SHORT).show();
                user.interes-=2;
            }
        }if(view==B3){
            if(!B3.isSelected()) {
                B3.setSelected(true);
                Toast.makeText(view.getContext(), "你選擇貝斯", Toast.LENGTH_SHORT).show();
                user.interes+=4;
            }
            else{
                B3.setSelected(false);
                Toast.makeText(view.getContext(), "你取消貝斯", Toast.LENGTH_SHORT).show();
                user.interes-=4;
            }
        }if(view==B4){
            if(!B4.isSelected()) {
                B4.setSelected(true);
                Toast.makeText(view.getContext(), "你選擇電吉他", Toast.LENGTH_SHORT).show();
                user.interes+=8;
            }
            else{
                B4.setSelected(false);
                Toast.makeText(view.getContext(), "你取消電吉他", Toast.LENGTH_SHORT).show();
                user.interes-=8;
            }
        }if(view==B5){
            if(!B5.isSelected()) {
                B5.setSelected(true);
                Toast.makeText(view.getContext(), "你選擇演唱", Toast.LENGTH_SHORT).show();
                user.interes+=16;
            }
            else{
                B5.setSelected(false);
                Toast.makeText(view.getContext(), "你取消演唱", Toast.LENGTH_SHORT).show();
                user.interes-=16;
            }
        }if(view==B6){
            if(!B6.isSelected()) {
                B6.setSelected(true);
                Toast.makeText(view.getContext(), "你選擇鼓組", Toast.LENGTH_SHORT).show();
                user.interes+=32;
            }
            else{
                B6.setSelected(false);
                Toast.makeText(view.getContext(), "你取消鼓組", Toast.LENGTH_SHORT).show();
                user.interes-=32;
            }
        }if(view==B7){
            if(!B7.isSelected()) {
                B7.setSelected(true);
                Toast.makeText(view.getContext(), "你選擇鍵盤", Toast.LENGTH_SHORT).show();
                user.interes+=64;
            }
            else{
                B7.setSelected(false);
                Toast.makeText(view.getContext(), "你取消鍵盤", Toast.LENGTH_SHORT).show();
                user.interes-=64;
            }
        }if(view==B8){
            if(!B8.isSelected()) {
                B8.setSelected(true);
                Toast.makeText(view.getContext(), "你選擇創作", Toast.LENGTH_SHORT).show();
                user.interes+=128;
            }
            else{
                B8.setSelected(false);
                Toast.makeText(view.getContext(), "你取消創作", Toast.LENGTH_SHORT).show();
                user.interes-=128;
            }
        }if(view==B9){
            if(!B9.isSelected()) {
                B9.setSelected(true);
                Toast.makeText(view.getContext(), "你選擇其它", Toast.LENGTH_SHORT).show();
            }
            else{
                B9.setSelected(false);
                Toast.makeText(view.getContext(), "你取消其它", Toast.LENGTH_SHORT).show();
            }
        }if(view==Back){
            Intent intent = new Intent(Logview.this, Log.class);
            intent.putExtra("ACCOUNT",user.account);
            intent.putExtra("PASSWORD",user.password);
            intent.putExtra("NAME",user.name);
            startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
        }if(view==Next){
            Intent intent = new Intent(Logview.this,LogPic.class);
            intent.putExtra("ACCOUNT", user.account);
            intent.putExtra("PASSWORD", user.password);
            intent.putExtra("NAME", user.name);
            intent.putExtra("INTEREST", user.interes);
            startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
        }

    }
}