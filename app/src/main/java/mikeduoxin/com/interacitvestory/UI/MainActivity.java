package mikeduoxin.com.interacitvestory.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import mikeduoxin.com.interacitvestory.R;


public class MainActivity extends AppCompatActivity {
    private EditText mNameField;
    private Button mStartButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameField = (EditText) findViewById(R.id.editTextName);
        mStartButton= (Button) findViewById(R.id.buttonConfirm);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField.getText().toString();
                startStory(name);
            }
        });

    }

    private void startStory(String name) {
        Intent intent=new Intent(MainActivity.this,StoryActivity.class);

        intent.putExtra("name",name);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNameField.setText("");
    }
}
