/* 
*@author Lss.Yang
*Game2048 v0.1
*/
package com.example.game2048;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	public MainActivity(){
		mainActivity = this;
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tvScore = (TextView) findViewById(R.id.tvScore);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}
	
	public void clearScore(){
		score = 0;
		showScore();
	}
	
	public void addScore(int s){
		score += s;
		showScore();
	}
	
	public void showScore(){
		tvScore.setText(score+"");
	}
	private TextView tvScore;
	private int score = 0;
	private TextView tvScoreTextView;
	private static MainActivity mainActivity =null;
	
	public static MainActivity getMainActivity(){
		return mainActivity;
	}
}
