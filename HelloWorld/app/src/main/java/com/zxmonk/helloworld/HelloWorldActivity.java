package com.zxmonk.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class HelloWorldActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //requestWindowFeature(Window.FEATURE_NO_TITLE)
        Log.d("HelloWorldActivity","onCreate execute");
        setContentView(R.layout.activity_hello_world);

        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(HelloWorldActivity.this,"You clicked Button 1",
                //        Toast.LENGTH_SHORT).show();
                //finish();
                //Intent intent = new Intent(HelloWorldActivity.this,SecondActivity.class);
                //Intent intent = new Intent("com.zxmonk.HelloWorld.ACTION_START");
                //intent.addCategory("com.zxmonk.HelloWorld.MY_CATEGORY");

                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://www.baidu.com"));

                //Intent intent = new Intent(Intent.ACTION_DIAL);
                //intent.setData(Uri.parse("tel:10086"));

                /*String data = "Hello SecondActivity";
                Intent intent = new Intent(HelloWorldActivity.this, SecondActivity.class);
                intent.putExtra("extra_data", data);
                startActivity(intent);*/

                Intent intent = new Intent(HelloWorldActivity.this, SecondActivity.class);
                startActivityForResult(intent, 1);


            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_world, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        /*int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);*/

        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked "+getString(R.string.menu_1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked "+getString(R.string.menu_2), Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:

        }
        return true;


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity", returnedData);
                }
                break;
            default:
        }
    }

}
