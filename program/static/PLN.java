package static;
public class PLN {
	private int tdListrik; //tarif dasar listrik (Rp)
	
	public PLN() {}

	public PLN(int tdl) {
		this.tdListrik = tdl;
	}

	public int getTdl() {
		return this.tdListrik;
	}

	public void setTdl(int tdl) {
		this.tdListrik = tdl;
	}

	public String info() {
		return "Tarif dasar listrik = Rp" + this.tdListrik;
	}
}