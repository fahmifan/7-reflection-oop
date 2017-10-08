package static;

public class User{
	private String nama;
	private String alamat;
	private int jmlDevice;

	

	public User(int tdl, String namaDevice, int kwhDevice, double durasi, String nama, String alamat){
		this.tdl=tdl;
		this.namaDevice=namaDevice;
		this.kwhDevice=kwhDevice;
		this.durasi=durasi;
		this.nama=nama;
		this.alamat=alamat;
	}

	public inputDevice(int jmlDevice, Device device){
		this.jmlDevice=jmlDevice;
		this.device=device;
	}

	public String getNama(){
		return nama;
	}

	public String getAlamat(){
		return alamat;
	}

	public String info(){
		return info;
	}
	
}