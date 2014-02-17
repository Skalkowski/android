package com.example.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//polaczenie przycisku przycisk_autor
		View przyciskAutor = findViewById(R.id.przycisk_autor);
		przyciskAutor.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClick(View v) {
        switch (v.getId()) {
        case R.id.przycisk_autor:
            Intent i = new Intent(this, Autor.class);
            startActivity(i);
            break;
        }
    }

}
