
public class Connection {
	private Raum start;
	private Raum ziel;
	private String partOf;
	private String connComment;
	
	public Connection(Raum start, Raum ziel) {
		super();
		this.start = start;
		this.ziel = ziel;
		this.partOf = null;
		this.connComment = "";
	}

	public String getConnComment() {
		return connComment;
	}

	public void setConnComment(String connComment) {
		this.connComment = connComment;
	}

	public Raum getStart() {
		return start;
	}

	public void setStart(Raum start) {
		this.start = start;
	}

	public Raum getZiel() {
		return ziel;
	}

	public void setEnd(Raum end) {
		this.ziel = ziel;
	}

	public String getPartOf() {
		return partOf;
	}

	public void setPartOf(String partOf) {
		this.partOf = partOf;
	} 
	
	public String toString(){
		return start.getName()+" "+ ziel.getName()+" "+getPartOf()+"/ "+connComment;
	}
	
}
