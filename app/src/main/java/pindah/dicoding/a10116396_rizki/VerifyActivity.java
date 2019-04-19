package pindah.dicoding.a10116396_rizki;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class VerifyActivity extends AppCompatActivity {

    /*
    13 April 2019
    10116396 , Rizki Muhamad Fauzi , IF-9
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void kembali(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void verify(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}
