package com.exanmple.activitytest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ThirdActivity","Task id is " + getTaskId());
        setContentView(R.layout.third_layout);
        Button button3 = (Button)findViewById(R.id.Button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();

            }
        });
        //android.os.Process.killProcess(android.os.Process.myPid());
        //setContentView(R.layout.third_layout);
        //Button button3 = (Button)findViewById(R.id.Button_3);
        //button3.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
              //  Intent intent = new Intent(Intent.ACTION_DIAL);
              //  intent.setData(Uri.parse("tel:10086"));
               // startActivity(intent);
            }
        //});
    }
//}
