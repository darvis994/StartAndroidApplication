package darvis.startandroidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewHello;
    Button buttonHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textViewHello = (TextView) findViewById(R.id.helloTextView);
        buttonHello = (Button) findViewById(R.id.helloButton);

        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewHello.setText("Hello Genymotion!");
            }
        });
    }
}
