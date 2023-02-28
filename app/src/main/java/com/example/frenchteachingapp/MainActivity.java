/**
 Section 16
 video no 129-133

 Make changes in res->values->colours
                 res->raw folder
                 XML
                 Java
  */


/**

 xml -- creating button
          with tag attribute-- make raw and tag as same variable
          one click method also that will contain a method which will run
in color -- define different colours
 in raw --save some colours sound

 java-- here we no need to create one click listener
        in order to reduce our code we use one click method inside xml file
        so  when we click on that it will perform the certain fn
  */
package com.example.frenchteachingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayColor(View view)
    {
        // we are creation a single button
        Button btn=(Button) view;
        // this fn will take 2 parameter first this and the second package name
        MediaPlayer mp=MediaPlayer.create(this,getResources().getIdentifier(btn.getTag().toString(),
                "raw",
                getPackageName()));
        mp.start();
    }
}