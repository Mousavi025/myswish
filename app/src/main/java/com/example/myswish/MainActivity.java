package com.example.myswish;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myswish.Fragments.CardFragment;
import com.example.myswish.Fragments.ListFragment;

public class MainActivity extends AppCompatActivity {

    boolean isCard = true;
    Button btnSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwitch = findViewById(R.id.btnSwitch);

        // نمایش پیش‌فرض
        replaceFragment(new CardFragment());

        // دکمه برای جابجایی
        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCard) {
                    replaceFragment(new ListFragment());
                    btnSwitch.setText("نمایش CardView");
                    isCard = false;
                } else {
                    replaceFragment(new CardFragment());
                    btnSwitch.setText("نمایش RecyclerView");
                    isCard = true;
                }
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
