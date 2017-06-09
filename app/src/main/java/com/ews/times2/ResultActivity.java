package com.ews.times2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        this.result = (TextView) findViewById(R.id.tvResult);

        //Caso venha de uma outra tela que nao tenha setado os parametros, a Intent podera vir nula.
        if (getIntent() != null) {
            String nome = getIntent().getStringExtra("nome");
            String idade = getIntent().getStringExtra("idade");
            String time = getIntent().getStringExtra("time");
            this.result.setText(getString(R.string.text_result, nome, time));
        }
    }
}
