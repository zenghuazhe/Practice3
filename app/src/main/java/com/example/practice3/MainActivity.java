package com.example.practice3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView);

        // Check which checkbox was clicked
        switch(view.getId()){
            case R.id.checkBoxC:
                if(checked){
                    Toast.makeText(this,"选择C语言", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择C语言",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBoxJava:
                if(checked){
                    Toast.makeText(this,"选择Java语言",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择Java语言",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBoxPython:
                if(checked){
                    Toast.makeText(this,"选择Python语言",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"取消选择Python语言",Toast.LENGTH_LONG).show();
                }

        }
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.text_View);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonMale:
                if (checked)
                    textView.setText("您的性别为男");
                break;
            case R.id.radioButtonFemale:
                if (checked)
                    textView.setText("您的性别为女");
                break;
        }
    }


}
