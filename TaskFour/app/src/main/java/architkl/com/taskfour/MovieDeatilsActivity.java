package architkl.com.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MovieDeatilsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_deatils);

        Intent myIntent = getIntent();

        String text1 = myIntent.getStringExtra("textbox1")
                , text2 = myIntent.getStringExtra("textbox2");

        CharSequence details= getString(R.string.detail_1) + " " + text2 + " "
                + getString(R.string.detail_2) + " " + text1 + " " + getString(R.string.detail_3);

        TextView textView = (TextView) findViewById(R.id.details);
        textView.setText(details);
    }
}
