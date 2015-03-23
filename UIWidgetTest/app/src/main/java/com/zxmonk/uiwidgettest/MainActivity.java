package com.zxmonk.uiwidgettest;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends ActionBarActivity {

    private Button button;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    private Timer timer = new Timer();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        imageView = (ImageView) findViewById(R.id.imageView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);



        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button:
                        String inputText = editText.getText().toString();
                        if(!inputText.isEmpty()){
                            Toast.makeText(MainActivity.this, inputText,
                                    Toast.LENGTH_SHORT).show();
                            Log.d("MainActivity",inputText);
                        }else{
                            Log.d("MainActivity",inputText);
                        }



                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("This is Dialog");
                        dialog.setMessage("Something important.");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                ProgressDialog progressDialog = new ProgressDialog
                                        (MainActivity.this);
                                progressDialog.setTitle("This is ProgressDialog");
                                progressDialog.setMessage("Loading...");
                                progressDialog.setCancelable(false);
                                progressDialog.show();




                                if (progressBar.getVisibility() == View.GONE) {
                                    progressBar.setVisibility(View.VISIBLE);
                                } else {
                                    progressBar.setVisibility(View.GONE);
                                }

                                imageView.setImageResource(R.drawable.zxm2);

                                progressDialog.dismiss();
                            }
                        });
                        dialog.setNegativeButton("Cancel", new DialogInterface.
                                OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.show();






                        break;
                    default:

                        break;
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
