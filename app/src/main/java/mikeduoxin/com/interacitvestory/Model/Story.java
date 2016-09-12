package mikeduoxin.com.interacitvestory.Model;

import mikeduoxin.com.interacitvestory.R;

/**
 * Created by Administrator on 2016/9/11.
 */

public class Story {
    private StoPage[] mStoPages;

    public StoPage getStoPages(int num) {
        return mStoPages[num];
    }

    public void setStoPages(StoPage[] stoPages) {
        mStoPages = stoPages;
    }

    public Story(){
        mStoPages = new StoPage[8];
        mStoPages[0]= new StoPage(
                R.drawable.page0,
                "On  it's calling you by name: \"Help me, %1$s, you're my only hope.\"",
                new Choice("Stop and investigate", 1),
                new Choice("Continue home to Earth", 2),
                false);

        mStoPages[1]=new StoPage(
                R.drawable.page1,
                "You deftly land your ship near where the distress signal originated. You didn't notice anything strange on your fly-by, but there is a cave in front of you. Behind you is an abandoned rover from the early 21st century.",
                new Choice("Explore the cave", 3),
                new Choice("Explore the rover", 4),
                false);
        mStoPages[2] = new StoPage(
                R.drawable.page2,
                "You continue your course to Earth.  are low.",
                new Choice("Head back to Mars to investigate", 4),
                new Choice("Continue home to Earth", 6),
                false
                );

        mStoPages[3] = new StoPage(
                R.drawable.page3,
                "Your EVA suit is equipped with a headlamp, light up ahead.",
                new Choice("Refill at ship and explore the rover", 4),
                new Choice("Continue towards the faint light", 5),
                false);

        mStoPages[4] = new StoPage(
                R.drawable.page4,
                "The rover is  In fact, there is a message on the screen: \"%1$s, come to 28.543436, -81.369031.\" Those coordinates aren't far, but you don't know if your oxygen will last there and back.",
                new Choice("Explore the coordinates", 5),
                new Choice("Return to Earth", 6),
                false);

        mStoPages[5] = new StoPage(
                R.drawable.page5,
                "After a long walk slightly uphill,  %1$s-S1124. It had been lost on a previous mission to Mars! You take it back to your ship and fly back to Earth.",
                null,
                null,
                true);

        mStoPages[6] = new StoPage(
                R.drawable.page6,
                "You arrive home on Earth. While your mission was a success, you forever wonder what was sending that signal. Perhaps a future mission will be able to investigate...",
                new Choice("新的页面",7),
                new Choice("返回上一个页面",4),
                false);
        mStoPages[7]=new StoPage(
                R.drawable.page6,
                "谢谢您的访问",
                null,
                null,
                true
        );
    }
}
