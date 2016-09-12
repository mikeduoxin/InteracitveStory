package mikeduoxin.com.interacitvestory.UI;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import mikeduoxin.com.interacitvestory.Model.StoPage;
import mikeduoxin.com.interacitvestory.Model.Story;
import mikeduoxin.com.interacitvestory.R;

public class StoryActivity extends AppCompatActivity {

    private ImageView storyImageView;
    private TextView storyTextView;
    private Button choiceButton2;
    private Button choiceButton1;
    private Story mStory = new Story();
    private StoPage mCurrentPage;
    private String mName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        storyImageView = (ImageView) findViewById(R.id.storyImageView);
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        choiceButton1 = (Button) findViewById(R.id.choiceButton1);
        choiceButton2 = (Button) findViewById(R.id.choiceButton2);

        Intent intent=getIntent();
        mName = intent.getStringExtra("name");
        if (mName == null){
            mName = "friend";
        }
        storyTextView.setText(mName);

        startStory(0);




    }

    private void startStory(int num) {
        mCurrentPage = mStory.getStoPages(num);
        Drawable d = getResources().getDrawable(mCurrentPage.getImageID());
        storyImageView.setImageDrawable(d);
        //把客户姓名加入故事当中，利用占位符
        storyTextView.setText(String.format(mCurrentPage.getStory(),mName));
        if(mCurrentPage.getChoice1()!=null) {
            choiceButton1.setText(mCurrentPage.getChoice1().getText());
        }
        if(mCurrentPage.getChoice2()!=null)
        {
            choiceButton2.setText(mCurrentPage.getChoice2().getText());
        }
        if(mCurrentPage.isFinal()){
            choiceButton1.setVisibility(View.INVISIBLE);
            choiceButton2.setText("再玩一次");

            choiceButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        }else{


        choiceButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextpae = mCurrentPage.getChoice1().getNextPage();
                startStory(nextpae);

            }
        });
        choiceButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nextpae = mCurrentPage.getChoice2().getNextPage();
                startStory(nextpae);
            }
        });
        }
    }
}
