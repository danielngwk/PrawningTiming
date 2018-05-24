package sg.edu.rp.c346.pd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    EditText num3;
    EditText num4;
    private Button btn;
    String total = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.editText5);
        num2 = (EditText) findViewById(R.id.editText8);
        num3 = (EditText) findViewById(R.id.editText7);
        num4 = (EditText) findViewById(R.id.num1);
        btn = (Button) findViewById(R.id.btn);
        num1.requestFocus();


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value1 = num1.getText().toString();
                String value2 = num2.getText().toString();
                String value3 = num3.getText().toString();
                String value4 = num4.getText().toString();
                total = value1 + value2 + value3 + value4;

                if (total.equalsIgnoreCase("3334")) {
                    Intent intent = new Intent(getBaseContext(), Countdown.class);
                    startActivity(intent);

                } else if (total.equalsIgnoreCase("3556")) {
                    Intent intent = new Intent(getBaseContext(), Countdown1.class);
                    startActivity(intent);

                }
            }
        });


        num1.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
                num2.requestFocus();

            }


            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

            }
        });

        num2.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
                num3.requestFocus();

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

            }
        });
        num3.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
                num4.requestFocus();

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

            }
        });
    }
}
