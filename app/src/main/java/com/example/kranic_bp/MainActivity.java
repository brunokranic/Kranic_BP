package com.example.kranic_bp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;import
        android.content.SharedPreferences;import android.graphics.Color;import
        android.os.Bundle;import android.provider.MediaStore;import
        android.view.View;import android.widget.RadioButton;import
        android.widget.RadioGroup;public class MainActivity extends
        AppCompatActivity { RadioGroup radioGroup; RadioButton rb1;
    RadioButton rb2; RadioButton rb3; RadioButton rb4; ConstraintLayout layout;
    SharedPreferences pref; SharedPreferences.Editor editor; public void
    onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) { case
                R.id.radioButton: if (checked)
            layout.setBackgroundColor(Color.BLUE);
            editor.putInt("bkc",Color.BLUE); break; case
                R.id.radioButton2: if (checked)
            layout.setBackgroundColor(Color.MAGENTA);
            editor.putInt("bkc",Color.MAGENTA); break;
            case R.id.radioButton3: if (checked)
                layout.setBackgroundColor(Color.YELLOW);
                editor.putInt("bkc",Color.YELLOW); break;
            case R.id.reset: if (checked)
                layout.setBackgroundColor(Color.WHITE);
                editor.putInt("bkc",Color.WHITE); break;
        } editor.commit(); } @Override protected void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        rb1= (RadioButton)findViewById(R.id.radioButton);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);
        rb4 = (RadioButton)findViewById(R.id.reset);
        layout = (ConstraintLayout)findViewById(R.id.layout); pref =
                getApplicationContext().getSharedPreferences("MyPref", 0);
        editor = pref.edit(); int bkc;
        bkc = pref.getInt("bkc",Color.WHITE);
        layout.setBackgroundColor(bkc);
    }}
