import java.io.Serializable;

// obsolete
public class Raum implements Serializable {
	private String Name;
	private String ziel;
	private String kommentar;

	
	public Raum(String Name, String ziel, String kommentar) {
		super();
		this.Name = Name;
		this.ziel = ziel;
		this.kommentar = kommentar;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getZiel() {
		return ziel;
	}
	
	public void setZiel(String ziel) {
		this.ziel = ziel;
	}
	
	public String getKommentar() {
		return kommentar;
	}
	
	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}
	
	public String toString(){
		return Name+" "+ziel+" "+kommentar;
	}
	
}