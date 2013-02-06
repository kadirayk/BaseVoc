package sesa.chemnitz.basevoc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Verbs extends Activity{

	
	
	
	int holder=-1;

	
	String englishWords[]={"to work", "to play", "to go", "to walk", "to run", "to drive", "to follow",
			"to think", "to speak", "to eat", "to drink", "to kill", "to die", "to smile", "to laugh", 
			"to cry", "to buy", "to jump", "to smell", "to see", "to taste", "to touch", "to hear", 
			"to kiss", "to burn", "to melt", "to dig", "to explode", "to sit", "to stand", "to love", 
			"to pass", "to cut", "to fight", "to dance", "to sleep", "to wake up", "to sing", 
			"to count", "to marry", "to pray", "to win", "to lose", "to mix", "to bend", "to wash", 
			"to cook", "to open", "to close"};
	
	String turkishWords[]={"�al��mak", "oynamak", "gitmek", "y�r�mek", "ko�mak", "s�rmek", "takip etmek",
			"d���nmek", "konu�mak", "yemek", "i�mek", "�ld�rmek", "�lmek", "g�l�msemek", "g�lmek", 
			"a�lamak", "sat�n almak", "z�plamak", "koklamak", "g�rmek", "koklamak", "dokunmak", "duymak", 
			"�pmek", "yanmak", "erimek", "kazmak", "patlamak", "oturmak", "durmak", "sevmek", 
			"ge�mek", "kesmek", "kavga etmek", "dans etmek", "uyumak", "uyanmak", "�ark� s�ylemek", 
			"saymak", "evlenmek", "dua etmek", "kazanmak", "kaybetmek", "kar��t�rmak", "b�kmek", "y�kamak", 
			"pi�irmek", "a�mak", "kapatmak"};
	
	String germanWords[]={"zu arbeiten", "zu spielen", "zu gehen", "zu fu�", "laufen", "zu fahren", "zu folgen",
			"zu denken", "zu sprechen", "zu essen", "zu trinken", "zu t�ten", "zu sterben", "zu l�cheln", "zu lachen", 
			"zu weinen", "kaufen", "zu springen", "zu riechen", "zu sehen", "zu schmechen", "zu ber�hren", "zu h�ren", 
			"zu k�ssen", "zu brennen", "zu schmelzen", "zu graben", "zu explodieren", "zu sitzen", "zu stehen", "zu lieben", 
			"zu passieren", "zu schneiden", "zu k�mpfen", "zu tanzen", "schlafen", "zu wecken", "zu singen", 
			"zu z�hlen", "zu heiraten", "zu beten", "zu gewinnen", "zu verlieren", "zu mischen", "zu biegen", "zu waschen", 
			"zu kochen", "zu �ffnen", "zu schlie�en"};
	
	int n = englishWords.length-1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.card);
	
		final boolean calleren = getIntent().getBooleanExtra("calleren", false);
		final boolean callertr = getIntent().getBooleanExtra("callertr", false);
		final boolean callerde = getIntent().getBooleanExtra("callerde", false);
		
		
		Button PrevButton = (Button) findViewById(R.id.prevButton);
		Button NextButton = (Button) findViewById(R.id.nextButton);
		Button studyButton = (Button) findViewById(R.id.studyButton);
		final TextView word = (TextView) findViewById(R.id.word);
		
		word.setText(R.string.verbs);
		
		PrevButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				holder--;
				
				if(holder<0){
					holder=0;
				}
				if(callertr){
					word.setText(turkishWords[holder]);
					}
				else if(calleren){
					word.setText(englishWords[holder]);
				}
				else if(callerde){
					word.setText(germanWords[holder]);
				}
				
			}
			
			
		});
		
		NextButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				holder++;
				if(holder>n){
					holder=n;
				}
				if(callertr){
					word.setText(turkishWords[holder]);
					}
				else if(calleren){
					word.setText(englishWords[holder]);
				}
				else if(callerde){
					word.setText(germanWords[holder]);
				}
			}
		});
		
		studyButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(holder!=-1){
					
					word.setText(R.string.s_towork+holder);
				}
				
				
			}
		});
		
	}
	
}
