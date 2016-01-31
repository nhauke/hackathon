package com.example.kamran.shahmirkam;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    private TextView motivateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int index = 0;
        int val = 30;
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        ArrayList<String> quotes = new ArrayList<String>();
        File f = new File("C:\\Users\\ShahmirTheEngineer\\Documents\\hackathon\\Motivational Quotes.txt");
        Scanner file1 = null;
        try {
            file1 = new Scanner(f);
        } catch (Exception e) {
            System.out.println("could not find file");
        }
        for (int i = 0; i < 30; i++) {
            indexes.add(i);
        }
        while (file1.hasNextLine()) {
            quotes.add(file1.nextLine() + "\n");
        }
        index = (int) (Math.random() * val);
//        System.out.println(quotes.get(index));
        motivateText = (TextView) findViewById(R.id.text_motivate);
        motivateText.setText(quotes.get(index));
        quotes.remove(index);
    }
}

