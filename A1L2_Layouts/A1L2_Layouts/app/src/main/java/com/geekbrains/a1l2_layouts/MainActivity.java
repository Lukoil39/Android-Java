package com.geekbrains.a1l2_layouts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, buttonEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        checkSomething();
    }

    private void initViews() {
        /*button1 = findViewById(R.id.button41);
        button2 = findViewById(R.id.button42);
        button3 = findViewById(R.id.button43);*/
    }

    private void checkSomething() {
        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }

       /* boolean rootOfSquareLessThan10 = a + b - c * 2 < 10;
        boolean stringContainsText = string.contains("text");
        boolean stringContainsSomething = string.contains(0anotherText);

        if(rootOfSquareLessThan10 && stringContainsText || stringContainsSomething) {
            //еще какой-то код
        }
        */
    }
}
