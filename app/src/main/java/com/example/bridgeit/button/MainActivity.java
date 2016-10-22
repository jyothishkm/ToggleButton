package com.example.bridgeit.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton mToggle1,mToggle2;
    Button mOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOk = (Button)findViewById(R.id.button);
        mToggle1 = (ToggleButton)findViewById(R.id.toggleButton1);
        mToggle2 = (ToggleButton)findViewById(R.id.toggleButton2);
        mOk = (Button)findViewById(R.id.button);


    }
    //performing the button action
    public void onClick(View view) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mToggle1.getText()+"  Toggle Buton1"+"\n");
        stringBuffer.append(mToggle2.getText()+"  Toggle Buton2");
        Toast.makeText(MainActivity.this,stringBuffer.toString(),Toast.LENGTH_SHORT).show();
    }
}
