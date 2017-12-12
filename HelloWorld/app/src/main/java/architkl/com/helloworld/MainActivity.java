package architkl.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView text = (TextView)findViewById(R.id.textView);

                String str = text.getText().toString();

                if (str == getResources().getString(R.string.message_one)) {
                    text.setText(getString(R.string.message_two));
                }
                else {
                    text.setText(getString(R.string.message_one));
                }
            }
        });
    }
}
