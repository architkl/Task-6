package architkl.com.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizPage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page3);

        Intent mIntent = getIntent();

        final int score = mIntent.getIntExtra("Score", 0);
        Button b1 = findViewById(R.id.q3Op1);
        Button b2 = findViewById(R.id.q3Op2);
        Button b3 = findViewById(R.id.q3Op3);
        Button b4 = findViewById(R.id.q3Op4);
        Button b5 = findViewById(R.id.page3_end);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage3.this, FinalPage.class);
                intent.putExtra("Score", score + 1);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage3.this, FinalPage.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage3.this, FinalPage.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage3.this, FinalPage.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage3.this, FinalPage.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });
    }
}
