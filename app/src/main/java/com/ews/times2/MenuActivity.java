package com.ews.times2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MenuActivity extends AppCompatActivity {

    private TextInputLayout nome;
    private TextInputLayout idade;
    private Spinner times;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.times = (Spinner) findViewById(R.id.spTimes);
        this.nome = (TextInputLayout) findViewById(R.id.tilNome);
        this.idade = (TextInputLayout) findViewById(R.id.tilIdade);

    }

    public void cadastrar(View view) {
        System.out.println("MenuActivity.cadastrar");
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nome", this.nome.getEditText().getText().toString());
        intent.putExtra("idade", this.idade.getEditText().getText().toString());
        intent.putExtra("time", this.times.getSelectedItem().toString());
        startActivity(intent);
    }
}
