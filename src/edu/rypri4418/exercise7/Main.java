package edu.rypri4418.exercise7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;

public class Main extends Activity {
	
	AnimationDrawable	tripAnimation;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView imageFrame=(ImageView)findViewById(R.id.imgTrippy);
        imageFrame.setBackgroundResource(R.drawable.animation);
        tripAnimation=(AnimationDrawable) imageFrame.getBackground();
        Button btnFrame=(Button)findViewById(R.id.btnStart);
        Button btnTween=(Button)findViewById(R.id.btnStop);
        btnFrame.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tripAnimation.start();
			}
		});
        btnTween.setOnClickListener(new View.OnClickListener() {
        	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tripAnimation.stop();
				startActivity(new Intent(Main.this, Tween.class));
			}
		});
    }
}

