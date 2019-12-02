package com.geekbrains.a1l2_layouts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, buttonEqual;
    private CheckBox mOblakoCheck, mVlasCheck;
    private TextView mUpdate;
    private ArrayList<String> selection = new ArrayList<String>();

    Button update;
    TextView display;
    String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        str = display.getText().toString();

        update = findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer stringBuffer = new StringBuffer();
                if (((CheckBox)findViewById(R.id.mOblako)).isChecked()) {
                  stringBuffer.append("Облачно");

                }
                if (((CheckBox)findViewById(R.id.mVlas)).isChecked()) {
                    stringBuffer.append("    89%");
                }
                display.setText(str + stringBuffer);
            }
        });




    }



    public void selectItem(View view)
    {
  boolean checked = ((CheckBox) view).isChecked();
  switch (view.getId())
  {
      case R.id.mOblako:

          if (checked)
          {selection.add("89%");}
          else {
              selection.remove("89%");
          }
          break;

      case R.id.mVlas:

          if (checked)
          {selection.add("Облачно");}
          else {
              selection.remove("Облачно");
          }
          break;
  }

 }

}




