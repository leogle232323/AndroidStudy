package com.example.application;


import com.example.application.R;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button button_one;
	private Button button_two;
	private Button button_three;
	private Button button_four;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button_one = (Button) findViewById(R.id.button_one);
		button_two = (Button) findViewById(R.id.button_two);
		button_three = (Button) findViewById(R.id.button_three);
		button_four =  (Button) findViewById(R.id.button_four);
		button_one.setOnClickListener(this);
		button_two.setOnClickListener(this);
		button_three.setOnClickListener(this);
		button_four.setOnClickListener(this);
		}
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button_one:
			Intent intent = new Intent();
			intent.setClass(this,SecondActivity.class);
			startActivity(intent);
			break;
		case R.id.button_two:
			Intent intent2 = new Intent();
			intent2.setClassName(this,"com.example.application.SecondActivity");
			startActivity(intent2);
			break;
		case R.id.button_three:
			Intent intent3 = new Intent();
			intent3.setClassName("com.example.application","com.example.application.SecondActivity");
			startActivity(intent3);
			break;
		case R.id.button_four:
			Intent intent4 = new Intent();
			intent4.setComponent(new ComponentName(this, SecondActivity.class));
			startActivity(intent4);
			break;
		}
		
	}
}
