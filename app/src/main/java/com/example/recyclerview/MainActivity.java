package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinkedList<String> mWordList = new LinkedList<String>();
        String meme = "[Guitar Intro]\n" +
                "\n" +
                "[Verse]\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "We're rowdy\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "We're rowdy\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "We're rowdy\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "\n" +
                "[Chorus]\n" +
                "Bangarang! (Bass!)\n" +
                "Bangarang!\n" +
                "You feel the...?\n" +
                "Bangarang!\n" +
                "You feel (Bass!)\n" +
                "Bangarang!\n" +
                "You feel the...?\n" +
                "Bangarang!\n" +
                "You feel the (Bass!)\n" +
                "\n" +
                "[Verse]\n" +
                "My lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "We're rowdy\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "Bangarang!\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "We're rowdy\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout\n" +
                "\n" +
                "[Chorus]\n" +
                "Bangarang! (Bass!)\n" +
                "You feel the...?\n" +
                "You feel the...?\n" +
                "You feel the...?\n" +
                "Bangarang! (Bass!)\n" +
                "\n" +
                "[Verse]\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "We...\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "We're rowdy\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "Bangarang!\n" +
                "\n" +
                "[Verse]\n" +
                "Shout to all my lost boys\n" +
                "We're rowdy\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "We're rowdy\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "We're rowdy\n" +
                "Shout to all my lost boys\n" +
                "Sh-sh-sh-sh-sh-shout to all my lost boys\n" +
                "\n" +
                "[Chorus]\n" +
                "Bangarang! (Bass!)\n" +
                "You feel the...?\n" +
                "You feel the...?\n" +
                "Bangarang!\n" +
                "You feel the...?\n" +
                "Bangarang!\n" +
                "You feel the...?\n" +
                "\n" +
                "[Outro: Sirah]\n" +
                "\"Hey, still ain't got my marbles, but I got these beats banging out the back of my toy car.\"\n" +
                "\"Aye, yo! I'm eating fun-dip right now, not giving a fuck.\"";
        String[] meme2 = meme.split("\n");
        for (int i = 0; i < meme2.length; i++) {
            mWordList.add(meme2[i]);
        }
        WordListAdapter mAdapter = new WordListAdapter(this, mWordList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
