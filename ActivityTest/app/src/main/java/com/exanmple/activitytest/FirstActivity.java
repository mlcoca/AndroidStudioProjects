package com.exanmple.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"you clicked add",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.remove_item:
                Toast.makeText(this,"you clicked remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);//return后也可以写true，表示菜单按钮显示出来，false表示菜单按钮不显示出来
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
            default:
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FirstActivity","onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("FirstActivity",this.toString());
        setContentView(R.layout.first_layout);
        Button button1 = (Button)findViewById(R.id.Button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //startActivityForResult(intent,1);
                //String data = "Hello SecondActivity";
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //intent.putExtra("extra_data",data);
                //Intent intent = new Intent(Intent.ACTION_DIAL);
                //intent.setData(Uri.parse("tel:10010"));
                //startActivity(intent);

                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.addCategory("com.example.activitytest.MY_CATEGORY");
                //intent.setData(Uri.parse("http://.baidu.com"));
                //startActivity(intent);
                //finish();
                //Toast.makeText(FirstActivity.this,"You clicked Button 1",
                 //       Toast.LENGTH_SHORT).show();
            }
        });



    }
}


