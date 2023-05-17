package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {


    RadioGroup radioGroup;


    CheckBox java, php, c;

    Button submit, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.clearCheck();




        java = findViewById(R.id.checkBoxJava);
        php = findViewById(R.id.checkBoxPhp);
        c = findViewById(R.id.checkBoxC);
        submit = (Button)findViewById(R.id.buttonSignUp);





        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String radioText = "";
                String CheckBoxText = "";





                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(SignUpActivity.this,
                                    "No answer has been selected-(" + selectedId,
                                    Toast.LENGTH_SHORT)
                            .show();
                }
                else {

                    RadioButton radioButton = radioGroup.findViewById(selectedId);

                    // Now display the value of selected item
                    // by the Toast message
                    radioText = radioButton.getText().toString();
                }




                if(java.isChecked()){
                    CheckBoxText +=" " + "Java";
                }
                if(php.isChecked()){
                    CheckBoxText +=" " + "PHP";
                }
                if(c.isChecked()){
                    CheckBoxText +=" " + "C++";
                }
                            Toast.makeText(SignUpActivity.this,radioText+ "--" +CheckBoxText, Toast.LENGTH_SHORT).show();
            }
        });
        // Add the Listener to the RadioGroup
//        radioGroup.setOnCheckedChangeListener(
//                new RadioGroup
//                        .OnCheckedChangeListener() {
//                    @Override
//                    public void onCheckedChanged(RadioGroup group,
//                                                 int checkedId)
//                    {
//                        // Get the selected Radio Button
//                        RadioButton
//                                radioButton
//                                = (RadioButton)group
//                                .findViewById(checkedId);
//                    }
//                });
    }

}