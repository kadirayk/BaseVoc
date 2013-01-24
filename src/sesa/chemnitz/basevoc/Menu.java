package sesa.chemnitz.basevoc;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Menu extends ListActivity{
	
	
	String classes[] = new String[18]; /*= {"Animals", "Transport", "City", "Clothes", 
			"Colors", "People", "Foods-Drinks", "Home", "Body", "Nature", 
			"Jobs", "Math", "Numbers", "Months", "times",
			"Verbs", "Adjectives-Adverbs", "Misc"};*/
	
	//int lg;
	//TextView dil;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //BaseVoc lang = new BaseVoc();
        //lg = lang.sLanguage;
        
        //lg= getString(R.string.language);
        //classes[0] = lg;
        
        //dil.setText(lg);
        
        int i;
        for(i=0;i<18;i++){
        	classes[i]=getString(R.string.animals+i);
        }
    	
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
    }

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
				
		
		
		super.onListItemClick(l, v, position, id);
		String convert = classes[position];
		
		try{
			Class<?> aClass = Class.forName("sesa.chemnitz.basevoc." + convert);
			Intent anIntent = new Intent(Menu.this, aClass);
			startActivity(anIntent);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		};
	}
	
	
   
}
