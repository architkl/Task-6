package architkl.com.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page2);

        Intent mIntent = getIntent();

        final int score = mIntent.getIntExtra("Score", 0);
        Button b1 = findViewById(R.id.q2Op1);
        Button b2 = findViewById(R.id.q2Op2);
        Button b3 = findViewById(R.id.q2Op3);
        Button b4 = findViewById(R.id.q2Op4);
        Button b5 = findViewById(R.id.page2_end);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage2.this, QuizPage3.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage2.this, QuizPage3.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage2.this, QuizPage3.class);
                intent.putExtra("Score", score + 1);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage2.this, QuizPage3.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizPage2.this, FinalPage.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }
        });
    }
}
