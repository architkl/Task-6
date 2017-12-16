package architkl.com.taskthree;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class SecondActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        Snackbar snackbar = Snackbar
                .make(relativeLayout, getString(R.string.snackbar_second), Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
