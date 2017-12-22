package architkl.com.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText movieName = (EditText) findViewById(R.id.movie_name)
                        , ticketno = (EditText) findViewById(R.id.ticket_no);

                Intent myIntent = new Intent(MainActivity.this
                                            , MovieDeatilsActivity.class);
                myIntent.putExtra("textbox1", movieName.getText().toString());
                myIntent.putExtra("textbox2", ticketno.getText().toString());
                startActivity(myIntent);
            }
        });
    }
}
