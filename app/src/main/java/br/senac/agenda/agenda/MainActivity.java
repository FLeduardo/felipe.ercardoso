package br.senac.agenda.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = findViewById( R.id.listacontatos);

        String[] contatos = {"Andre", "Ari", "Roberto", "Luzia" };

        ArrayAdapter< String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contatos);
        lista.setAdapter(adapter);


    }
}
