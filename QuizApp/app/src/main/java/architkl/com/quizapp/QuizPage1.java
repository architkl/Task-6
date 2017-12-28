package architkl.com.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizPage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page1);

        final int score = 0;
        Button b1 = findViewById(R.id.q1Op1);
        Button b2 = findViewById(R.id.q1Op2);
        Button b3 = findViewById(R.id.q1Op3);
        Button b4 = findViewById(R.id.q1Op4);
        Button b5 = findViewById(R.id.page1_end);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage1.this, QuizPage2.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage1.this, QuizPage2.class);
                intent.putExtra("Score", score + 1);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage1.this, QuizPage2.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage1.this, QuizPage2.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage1.this, FinalPage.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });
    }
}
