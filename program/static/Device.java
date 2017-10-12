<<<<<<< HEAD
// package static;
public class Device {
	protected String namaDevice;
	protected int kwhDevice;
	protected double durasi;

	public Device() {
		this.namaDevice = "";
		this.kwhDevice = 0;
		this.durasi = 0.0;
	}

	public Device(String namaDevice, int kwhDevice, double durasi){
	
=======
public class Device extends PLN{
	private int tdl;
	private String namaDevice;
	private int kwhDevice;
	private double durasi;

	public Device(int tdl, String namaDevice, int kwhDevice, double durasi){
		this.tdl=tdl;
>>>>>>> 62a4914ac9f655d79266e0ee4b3b8918f7e3dcff
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
<<<<<<< HEAD
		this.namaDevice = nama;
=======
		this.namaDevice=nama;
>>>>>>> 62a4914ac9f655d79266e0ee4b3b8918f7e3dcff
	}

	public void setKwh(int kwh){
		this.kwhDevice=kwh;
	}

	public void setDurasi(double durasi){
		this.durasi=durasi;
	}

	public String info(){
<<<<<<< HEAD
		return "Nama Device\t: " + getNamaDevice() + "\nKwh Device\t: " + getKwhDevice() + "\nDurasi\t\t: " + getDurasi();
=======
		return "Nama Device\t: " + getNamaDevice() + "\nKwh Device\t: " + getKwhDevice() + "\nTdl\t: " + this.tdl + "\nDurasi\t: " + getDurasi();
>>>>>>> 62a4914ac9f655d79266e0ee4b3b8918f7e3dcff
	}
}