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
        /* ArrayList<String> quotes = new ArrayList<String>();
        //File f = new File("C:\\Users\\Kamran\\Documents\\Android App\\hackathon\\hackathon\\Motivational Quotes.txt");
        File f = new File("com/example/kamran/shahmirkam/Motivational Quotes.txt");
        Scanner file1 = null;
        try {
            file1 = new Scanner(f);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("could not find file");
        }
        for (int i = 0; i < 30; i++) {
            indexes.add(i);
        }
        while (file1.hasNextLine()) {
            quotes.add(file1.nextLine() + "\n");
        }*/
        String[] text_quotes = {
                "1.  Go for it now. The future is promised to no one.",
                "2.  The more weird you are is a reflection of how committed you are to focusing on your goal",
                "3.  Live each day as if it is your last",
        "4.  Fear kills dreams, Fear kills hope, Fear put people in the hospital, Fear prevents you from accomplishing your goal",
        "5.  It ain't about how hard you hit, it's about how hard you can get hit and keep moving forward",
        "6.  Without the dark, we will never be able to see the stars",
        "7.  Skill is only developed by hours and hours of beating on your craft",
        "8.  I got the most motivation when I heard people tell me I couldn't do something",
        "9.  The one who says I can and the one who says I can't is usually right",
        "10. I have not failed. I've just found 10,000 ways that won't work.",
        "11. Life is not about finding yourself. Life is about creating yourself",
        "12. Success is the sum of small efforts, repeated day-in and day-out",
        "13. People are rewarded in public for what they practiced in private for years",
        "14. People often say that motivation doesn't last. Well, neither does bathing--that's why we recommend it daily.",
        "15. In order to succeed, we must first believe that we can.",
        "16. What you do today can improve all your tomorrows",
        "17. Don't watch the clock; do what it does. Keep going.",
        "18. A creative man is motivated by the desire to achieve, not by the desire to beat others.",
        "19. It does not matter how slowly you go as long as you do not stop.",
        "20. Always do your best. What you plant now, you will harvest.",
        "21. There is no traffic jam along the extra mile",
        "22. If you don't design your own life plan, chances are you'll fall into someone else's plan. And guess what they have planned for you? Not much.",
        "23. If you genuinely want something, don't wait for it--teach yourself to be impatient.",
        "24. Motivation is what gets you started. Habit is what keeps you going.",
        "25. People rarely succeed unless they have fun in what they are doing",
        "26. Our greatest fear should not be of failure but of succeeding at things in life that don't",
        "27. You've got to get up every morning with determination if you're going to go to bed with satisfaction",
        "28. Failure is the condiment that gives success its flavor"
        };
        ArrayList<String> quotes = new ArrayList<>(Arrays.asList(text_quotes));
//        System.out.println(quotes.get(index));
        motivateText = (TextView) findViewById(R.id.text_motivate);
        motivateText.setText(quotes.get(index));
        quotes.remove(index);

    }
}

