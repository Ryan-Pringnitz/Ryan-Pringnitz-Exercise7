package edu.rypri4418.exercise7;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Tween extends Activity {
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tween);
	ImageView imgRotation = (ImageView) findViewById(R.id.imgTween);
	imgRotation.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation));
}
}