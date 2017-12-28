package architkl.com.quizapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FinalPage extends AppCompatActivity {

    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        Intent mIntent = getIntent();

        final int score = mIntent.getIntExtra("Score", 0);
        TextView tV = findViewById(R.id.scoreValue);
        String str = Integer.toString(score) + "/3";
        tV.setText(str);
        relativeLayout = findViewById(R.id.relativeLayout);

        Snackbar snackbar = Snackbar
                .make(relativeLayout, getString(R.string.goodbye_msg), Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
