
import java.io.Serializable;
import java.util.ArrayList;

public class dataBase implements Serializable{
	public ArrayList<Raum> raumDB;

	public dataBase() {
		super();
		raumDB = new ArrayList<Raum>();
	}

	
	// Räume
	public void addRaum(Raum temp){
		raumDB.add(temp);
	}
	
	public Raum getRaum(int x){
		return raumDB.get(x);
	}
	
	public int getAnzahlRaeume(){
		return raumDB.size();
	}
}
