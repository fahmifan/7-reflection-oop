public class Device extends PLN{
	private int tdl;
	private String namaDevice;
	private int kwhDevice;
	private double durasi;

	public Device(int tdl, String namaDevice, int kwhDevice, double durasi){
		this.tdl=tdl;
		this.namaDevice=namaDevice;
		this.kwhDevice=kwhDevice;
		this.durasi=durasi;
	}

	public String getNamaDevice(){
		return this.namaDevice;
	}

	public int getKwhDevice(){
		return this.kwhDevice;
	}

	public double getDurasi(){
		return this.durasi;
	}

	public void setNamaDevice(String nama){
		this.namaDevice=nama;
	}

	public void setKwh(int kwh){
		this.kwhDevice=kwh;
	}

	public void setDurasi(double durasi){
		this.durasi=durasi;
	}

	public String info(){
		return "Nama Device\t: " + getNamaDevice() + "\nKwh Device\t: " + getKwhDevice() + "\nTdl\t: " + this.tdl + "\nDurasi\t: " + getDurasi();
	}
}