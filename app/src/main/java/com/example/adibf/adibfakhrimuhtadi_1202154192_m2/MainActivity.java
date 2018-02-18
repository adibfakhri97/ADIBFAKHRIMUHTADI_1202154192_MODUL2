package com.example.adibf.adibfakhrimuhtadi_1202154192_m2;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pesanMakan(View view) {
        boolean checked = ((RadioButton) view).isChecked(); //boolean untuk radio button apabila di klik

        switch (view.getId()){
            case R.id.dine_in: //kondisi untuk Dine In bila di klik
                if (checked)
                    toastMuncul(getString(R.string.dine_in));
                break;

            case R.id.take_away: //kondisi untuk Take Away bila di klik
                if (checked)
                    toastMuncul(getString(R.string.take_away));
                break;

            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing)); //kondisi jika tidak ada yang diklik
                break;

        }
    }

    public void toastMuncul(String pesan){
        Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_SHORT).show();

    }

    public void metodePesan(View view) {
        RadioButton dine_in = (RadioButton) findViewById(R.id.dine_in);
        RadioButton take_away = (RadioButton) findViewById(R.id.take_away);

        if (dine_in.isChecked()){
            Intent dineIn = new Intent(MainActivity.this, DineIn.class); //Memindahkan activity sesuai dengan namanya
            startActivity(dineIn);

        } else if (take_away.isChecked()){
            Intent takeAway = new Intent(MainActivity.this, TakeAway.class);
            startActivity(takeAway);
        } else {
            Toast.makeText(MainActivity.this, "Silakan Pilih", Toast.LENGTH_SHORT).show(); // toast jika tidak memilih apapun
        }
    }
}
