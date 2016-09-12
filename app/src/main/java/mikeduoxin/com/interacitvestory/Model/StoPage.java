package mikeduoxin.com.interacitvestory.Model;

/**
 * Created by Administrator on 2016/9/11.
 */

public class StoPage {
    private int imageID;
    private String story;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean isFinal;

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public StoPage(int imageID, String story, Choice choice1, Choice choice2, boolean f) {
        this.imageID = imageID;
        this.story = story;
        mChoice1 = choice1;
        mChoice2 = choice2;
        isFinal = f;

    }


    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

}
