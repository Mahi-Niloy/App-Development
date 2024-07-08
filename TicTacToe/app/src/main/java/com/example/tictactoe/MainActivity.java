package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_reset;
    TextView txt_result;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn_reset = findViewById(R.id.btn_reset);
        txt_result = findViewById(R.id.txt_result);

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetGame();
            }
        });
    }

    public void check(View view) {
        Button btnCurrent = (Button) view;
        count++;

        if (btnCurrent.getText().toString().equals("")) {
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                // Check conditions
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    displayWinner(b1, btn1, btn2, btn3);
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    displayWinner(b4, btn4, btn5, btn6);
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    displayWinner(b7, btn7, btn8, btn9);
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    displayWinner(b1, btn1, btn4, btn7);
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    displayWinner(b2, btn2, btn5, btn8);
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    displayWinner(b3, btn3, btn6, btn9);
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    displayWinner(b1, btn1, btn5, btn9);
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    displayWinner(b3, btn3, btn5, btn7);
                } else if (count == 9) {
                    txt_result.setText("It's a Draw!");
                }
            }
        }
    }

    private void displayWinner(String winner, Button... winningButtons) {
        txt_result.setText("Winner is " + winner);
        for (Button button : winningButtons) {
            button.setBackgroundColor(ContextCompat.getColor(this, R.color.winner_color)); // Replace with your desired color
        }
    }

    private void resetGame() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple)); // Default button color
        btn2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple)); // Default button color
        btn3.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple)); // Default button color
        btn4.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple)); // Default button color
        btn5.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple)); // Default button color
        btn6.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple)); // Default button color
        btn7.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple)); // Default button color
        btn8.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple)); // Default button color
        btn9.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple)); // Default button color
        txt_result.setText("");
        flag = 0;
        count = 0;
    }
}
