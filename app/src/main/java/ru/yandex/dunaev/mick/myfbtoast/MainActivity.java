package ru.yandex.dunaev.mick.myfbtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tfb.fbtoast.FBToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnNativeToast(View view) {
        FBToast.nativeToast(MainActivity.this,"This is Native Toast",FBToast.LENGTH_SHORT);
    }

    public void OnSuccessToast(View view) {
        FBToast.successToast(MainActivity.this,"This is Success Toast",FBToast.LENGTH_SHORT);
    }

    public void OnWarningToast(View view) {
        FBToast.warningToast(MainActivity.this,"This is Warning Toast",FBToast.LENGTH_SHORT);
    }

    public void OnErrorToast(View view) {
        FBToast.errorToast(MainActivity.this,"This is Error Toast",FBToast.LENGTH_SHORT);
    }

    public void OnInfoToast(View view) {
        FBToast.infoToast(MainActivity.this,"This is Info Toast",FBToast.LENGTH_SHORT);
    }
}
