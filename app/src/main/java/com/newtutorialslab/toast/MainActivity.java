package com.newtutorialslab.toast;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
     private Button btn;
    private Button btn1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button) findViewById(R.id.button);
        btn1 =(Button)findViewById(R.id.btn_change);
        tv1 =(TextView)findViewById(R.id.textView);
        btn.setOnClickListener(this);//this runs onclick method when button is clicked
        btn1.setOnClickListener(this);
    }


    public void onClick(View view) {

        switch (view.getId()){
            case R.id.button:
                Toast.makeText(getApplicationContext(),"This is toast",Toast.LENGTH_SHORT).show();
                   break;
            case R.id.btn_change:
                tv1.setText(" text above will be changed");
                   break;
        }

    }
}
