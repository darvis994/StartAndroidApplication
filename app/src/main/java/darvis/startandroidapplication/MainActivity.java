package darvis.startandroidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewHello;
    Button buttonHello;
    EditText editText;

    static int sum = 0;

    void sum(String number) {
        int input = Integer.parseInt(number);
        sum = sum + input;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textViewHello = (TextView) findViewById(R.id.helloTextView);
        buttonHello = (Button) findViewById(R.id.helloButton);
        editText = (EditText) findViewById(R.id.inputTextField);

        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum(editText.getText().toString().trim());
                textViewHello.setText(String.valueOf(sum));
            }
        });
    }
}
