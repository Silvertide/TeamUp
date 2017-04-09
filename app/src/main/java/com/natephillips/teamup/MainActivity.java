package com.natephillips.teamup;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    ArrayList<String> listItems=new ArrayList<String>();

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);
        setListAdapter(adapter);
    }

    //METHOD WHICH WILL HANDLE DYNAMIC INSERTION
    public void addItems(View v) {
        EditText nameField = (EditText) findViewById(R.id.playerField);
        if(nameField != null){
            listItems.add(nameField.getText().toString());
            nameField.setText("");
        }
        adapter.notifyDataSetChanged();
    }

    //METHOD WHICH WILL HANDLE DYNAMIC INSERTION
    public void createTeam(View v) {
        System.out.println("Running Test");
        Game game = new Game();

        game.addPlayer(new Player("Nate"));
        game.addPlayer(new Player("Ashley"));
        game.addPlayer(new Player("Brendan"));
        game.addPlayer(new Player("Riley"));
        game.addPlayer(new Player("Alex"));
        game.addPlayer(new Player("Matt"));
        game.addPlayer(new Player("Justyne"));
        game.addPlayer(new Player("Matt"));
        game.addPlayer(new Player("Cara"));
        game.addPlayer(new Player("Nick"));
        game.addPlayer(new Player("Alyssa"));
        game.addPlayer(new Player("Michelle"));


        game.createTeams(4);

    }

}
