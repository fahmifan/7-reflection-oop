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
		this.namaDevice = nama;
	}

	public void setKwh(int kwh){
		this.kwhDevice=kwh;
	}

	public void setDurasi(double durasi){
		this.durasi=durasi;
	}

	public String info(){
		return "Nama Device\t: " + getNamaDevice() + "\nKwh Device\t: " + getKwhDevice() + "\nDurasi\t\t: " + getDurasi();
	}
}