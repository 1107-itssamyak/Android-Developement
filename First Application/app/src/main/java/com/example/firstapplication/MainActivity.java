package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.*;

/*
This is the application in which we show the send recieve and
delete buttons and display few details using toast function.
*/

public class MainActivity extends AppCompatActivity  {
    // this is the functions which helps in the functioning of send, recieve and delete buttons.
    public void sendNow(View veiw)  {
        Toast.makeText(this, "this is sending data from your app \n You are HACKED !!", Toast.LENGTH_SHORT).show();
    }

    public void recieveNow(View veiw)   {
        Toast.makeText(this,"this is to recieve data into your phone !!",Toast.LENGTH_SHORT).show();
    }

    public void deleteNow(View veiw)   {
        Toast.makeText(this,"this is deleting data from your phone !!",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}