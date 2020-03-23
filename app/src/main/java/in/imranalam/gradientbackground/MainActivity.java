package in.imranalam.gradientbackground;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mLinearLayout = findViewById(R.id.eLinearLayout);
        AnimationDrawable mAnimationDrawable = (AnimationDrawable) mLinearLayout.getBackground();
        mAnimationDrawable.setEnterFadeDuration(2500);
        mAnimationDrawable.setExitFadeDuration(5000);
        mAnimationDrawable.start();
    }
}
