package com.example.android.simplemetalcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalNumberException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.MathParseException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;


public class IntegrateVol extends AppCompatActivity {

	EditText liminf;
	EditText limsup;
	EditText grado;
	EditText coeficientes;
	TextView resultadoPeso;
	Button calculate;
	//Spinner metalType;
	Metals metal;
	String limiteinf;
	String limitesup;
	String  gradomay;
	String coef;
	double result = 0;
	//int spinnerSelectedItem = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_integrate_vol);

		setTitle("Halla el volumen de un sólido de revolución");

		liminf = (EditText) findViewById(R.id.liminf);
		limsup = (EditText) findViewById(R.id.limsup);
		grado = (EditText) findViewById(R.id.grado);
		coeficientes = (EditText) findViewById(R.id.coeficientes);
		resultadoPeso = (TextView) findViewById(R.id.Peso) ;
		calculate = (Button) findViewById(R.id.button_calcular);

		calculate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				try {
					limiteinf = liminf.getText().toString();
					limitesup = limsup.getText().toString();
					gradomay = grado.getText().toString();
					coef= coeficientes.getText().toString();

					CalculusDefiniteIntegration integrate = new CalculusDefiniteIntegration();
					result = integrate.solve(limitesup, limiteinf, coef, gradomay);
					resultadoPeso.setText(result+ "gr");
				}
				catch (MathInternalError m1)
				{Toast.makeText(IntegrateVol.this,"Imposible bruh",Toast.LENGTH_SHORT).show();}
				catch (MathArithmeticException m2)
				{Toast.makeText(IntegrateVol.this,"Imposible bruh",Toast.LENGTH_SHORT).show(); }
				catch (MathIllegalArgumentException m3)
				{Toast.makeText(IntegrateVol.this,"Imposible bruh",Toast.LENGTH_SHORT).show(); }
				catch (MathIllegalStateException m4)
				{Toast.makeText(IntegrateVol.this,"Imposible bruh",Toast.LENGTH_SHORT).show(); }
				catch (MathUnsupportedOperationException m5)
				{Toast.makeText(IntegrateVol.this,"Imposible bruh",Toast.LENGTH_SHORT).show(); }
					}
			});

			}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	}




