package com.example.calculatorbasic;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;

public class MainLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_layout);
	}

	public void navigator(View view) {
		switch(view.getId()) {
		case R.id.btnGoToSimpleCalculator:
			Intent intentA = new Intent(getBaseContext(), CalculatorActivity.class);
			intentA.putExtra("newsType", "Apple");
			startActivity(intentA);
			break;
		case R.id.btnGoToGreetUser:
			Intent intentB = new Intent(getBaseContext(), GreetUserActivity.class);
			intentB.putExtra("newsType", "Google");
			startActivity(intentB);
			break;
		case R.id.btnPhotoShop:
			Intent intentc = new Intent(getBaseContext(), PhotoShopActivity.class);
			startActivity(intentc);
			break;
		}
	}
}
