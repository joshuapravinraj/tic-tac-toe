package com.example.jpr.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declare all the buttons
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize each button by id
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);

        turn = 1;

        //Button event handling
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1){
                        turn = 2;
                        b1.setText("X");
                    }
                    else if (turn == 2){
                        turn = 1;
                        b1.setText("O");
                    }
                }
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1){
                        turn = 2;
                        b2.setText("X");
                    }
                    else if (turn == 2){
                        turn = 1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1){
                        turn = 2;
                        b3.setText("X");
                    }
                    else if (turn == 2){
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1){
                        turn = 2;
                        b4.setText("X");
                    }
                    else if (turn == 2){
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1){
                        turn = 2;
                        b5.setText("X");
                    }
                    else if (turn == 2){
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1){
                        turn = 2;
                        b6.setText("X");
                    }
                    else if (turn == 2){
                        turn = 1;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1){
                        turn = 2;
                        b7.setText("X");
                    }
                    else if (turn == 2){
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1){
                        turn = 2;
                        b8.setText("X");
                    }
                    else if (turn == 2){
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1){
                        turn = 2;
                        b9.setText("X");
                    }
                    else if (turn == 2){
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });
    }

    public void endGame(){
        String a, b, c, d, e, f, g, h, i;

        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        //Displaying winner for X
        if (a.equals("X") && b.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this, "X Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this, "X Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "X Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")){
            Toast.makeText(MainActivity.this, "X Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "X Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("X") && e.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this, "X Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")){
            Toast.makeText(MainActivity.this, "X Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "X Wins", Toast.LENGTH_LONG).show();
            end = true;
        }

        //Displaying Winner for O
        if (a.equals("O") && b.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this, "O Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this, "O Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "O Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")){
            Toast.makeText(MainActivity.this, "O Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "O Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("O") && e.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this, "O Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")){
            Toast.makeText(MainActivity.this, "O Wins", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "O Wins", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (end){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }

    }
}
