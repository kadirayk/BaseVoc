package sesa.chemnitz.basevoc;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Menude extends ListActivity{
	
	int dil=0;
	
	String classes[] = new String[18]; 
	
	String orgMenu[]= {"Animals", "Transport", "City", "Clothes", 
			"Colors", "People", "FoodsDrinks", "Home", "Body", "Nature", 
			"Jobs", "Math", "Numbers", "Months", "Times",
			"Verbs", "AdjectivesAdverbs", "Misc"};
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        int i;
        for(i=0;i<18;i++){
        	classes[i]=getString(R.string.animals+i);
        	}
    	
        
        setListAdapter(new ArrayAdapter<String>(Menude.this, R.layout.listen, classes));
    }
	

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
				
		
		
		super.onListItemClick(l, v, position, id);
		String convert = orgMenu[position];
		
		
		
		
		try{
			Class<?> aClass = Class.forName("sesa.chemnitz.basevoc." + convert);
			Intent anIntent = new Intent(Menude.this, aClass);
			anIntent.putExtra("callerde", true);
			startActivity(anIntent);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		};
	}	
   
}
