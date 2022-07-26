package kr.hs.emirim.s2102.mirim_project_0726_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editAngle;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAngle = findViewById(R.id.edit_angle);
        img = findViewById(R.id.img);   // 버튼 누르면 이미지 나옴

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.item_rotate:  // 그림 회전
                img.setRotation(Float.parseFloat(editAngle.getText().toString()));
                return true;

            case R.id.item1:
                img.setImageResource(R.drawable.soondoll1);
                item.setChecked(true);
                return true;

            case R.id.item2:
                img.setImageResource(R.drawable.soondoll2);
                item.setChecked(true);
                return true;

            case R.id.item3:
                img.setImageResource(R.drawable.soondoll3);
                item.setChecked(true);
                return true;
        }
        return false;
    }
}