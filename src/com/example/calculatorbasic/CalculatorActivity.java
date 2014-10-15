package com.example.calculatorbasic;

//import example.calculator.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.ContextMenu;
//import android.view.Menu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends Activity {

	EditText etFirstNumber;
	EditText etSecondNumber;
	TextView tvResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator_layout);
		etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
		etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);
		tvResult = (TextView) findViewById(R.id.tvResult);
		Intent intent = getIntent();
		String newsType = intent.getStringExtra("newsType");
		if(newsType.equals("Apple")) {
			tvResult.setText("I Will Display Only Apple News");
		}
	}

	public void compute(View view) {
		try{
		String fNum = etFirstNumber.getText().toString();
		String sNum = etSecondNumber.getText().toString();
		double Result1 = Double.parseDouble(fNum);
		double Result2 = Double.parseDouble(sNum);
		switch (view.getId()) {
		case R.id.btnAdd:
			tvResult.setTextColor(Color.RED);
			tvResult.setText(Calculator.sum(Result1, Result2) + " ");
			break;
		case R.id.btnSub:
			tvResult.setTextColor(Color.RED);
			tvResult.setText(Calculator.sub(Result1, Result2) + " ");
			break;
		case R.id.btnMultiply:
			tvResult.setTextColor(Color.RED);
			tvResult.setText(Calculator.mul(Result1, Result2) + " ");
			break;
		case R.id.btnModulous:
			tvResult.setTextColor(Color.RED);
			tvResult.setText(Calculator.modulous(Result1, Result2) + " ");
			break;
			}
		}
		catch(Exception e){
			tvResult.setTextColor(Color.RED);
			tvResult.setText("Please enter a valid number ");
			//etFirstNumber.setText("Please enter second number");
			}
		}
	}
