package com.example.kamran.shahmirkam;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
        //ArrayList<Integer> indexes = new ArrayList<Integer>();
        //ArrayList<String> quotes1 = new ArrayList<String>();
        /*
        //File f = new File("C:\\Users\\Kamran\\Documents\\Android App\\hackathon\\hackathon\\Motivational Quotes.txt");
        File f = new File("com/example/kamran/shahmirkam/Motivational Quotes.txt");
        x
        String file = "raw/motivational_quotes.txt"; // res/raw/test.txt also work.
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(file);
        Scanner file1 = null;
        try {
            file1 = new Scanner(in);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("could not find file");
            Log.e("Tag", "could not find file");
        }
        /*for (int i = 0; i < 30; i++) {
            indexes.add(i);
        }
        while (file1.hasNextLine()) {
            quotes1.add(file1.nextLine());
        }
        //File f = new File(getResources().getAssets();
        */
        index = (int) (Math.random() * val);
        String[] text_quotes = {
        "\"Go for it now. The future is promised to no one\"",
        "\"The more weird you are is a reflection of how committed you are to focusing on your goal\"",
        "\"Live each day as if it is your last\"",
        "\"Fear kills dreams, Fear kills hope, Fear put people in the hospital, Fear prevents you from accomplishing your goal\"",
        "\"It ain't about how hard you hit, it's about how hard you can get hit and keep moving forward\"",
        "\"Without the dark, we will never be able to see the stars\"",
        "\"Skill is only developed by hours and hours of beating on your craft\"",
        "\"I got the most motivation when I heard people tell me I couldn't do something\"",
        "\"The one who says I can and the one who says I can't is usually right\"",
        "\"I have not failed, I've just found 10,000 ways that won't work\"",
        "\"Life is not about finding yourself, life is about creating yourself\"",
        "\"Success is the sum of small efforts, repeated day-in and day-out\"",
        "\"People are rewarded in public for what they practiced in private for years\"",
        "\"People often say that motivation doesn't last, well, neither does bathing--that's why we recommend it daily\"",
        "\"In order to succeed, we must first believe that we can\"",
        "\"What you do today can improve all your tomorrows\"",
        "\"Don't watch the clock; do what it does, keep going\"",
        "\"A creative man is motivated by the desire to achieve, not by the desire to beat others\"",
        "\"It does not matter how slowly you go as long as you do not stop\"",
        "\"Always do your best, what you plant now, you will harvest\"",
        "\"There is no traffic jam along the extra mile\"",
        "\"If you don't design your own life plan, chances are you'll fall into someone else's plan, and guess what they have planned for you, not much\"",
        "\"If you genuinely want something, don't wait for it--teach yourself to be impatient\"",
        "\"Motivation is what gets you started. Habit is what keeps you going\"",
        "\"People rarely succeed unless they have fun in what they are doing\"",
        "\"Our greatest fear should not be of failure but of succeeding at things in life that don't\"",
        "\"You've got to get up every morning with determination if you're going to go to bed with satisfaction\"",
        "\"Failure is the condiment that gives success its flavor\"",
        "\"There is only one corner of the universe you can be certain of improving, and that's your own self\"",
        "\"They always say time changes things, but you actually have to change them yourself\""
        };

        ArrayList<String> quotes = new ArrayList<>(Arrays.asList(text_quotes));
        //        System.out.println(quotes.get(index));
        motivateText = (TextView) findViewById(R.id.text_motivate);
        motivateText.setText(quotes.get(index));
        quotes.remove(index);
    }
}

