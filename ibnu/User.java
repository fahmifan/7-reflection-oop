package hitungListrik;
import java.util.Scanner;

public class User extends Device{
	private String nama;
	private String alamat;
	private int jmlDevice;
	private int pulsa;
	Device[] devArr;

	public User(String nama, String alamat, int jmlDevice) {
		this.nama = nama;
		this.alamat = alamat;
		this.jmlDevice = jmlDevice;
	}

	public void inputDevice() {
		devArr = new Device[this.jmlDevice];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < this.jmlDevice; i++) {
			devArr[i] = new Device();
			
			System.out.print("Input nama device : ");
			String inDevice = sc.next();
			devArr[i].namaDevice = inDevice;

			System.out.print("Input kwh : ");
			int inKwh = sc.nextInt();
			devArr[i].kwhDevice = inKwh;

			System.out.print("Input durasi penggunaan (jam) : ");
			int inDurasi = sc.nextInt();
			devArr[i].durasi = inDurasi;
			System.out.println(" ");
		}
	}

	public void setPulsa(int pulsa) {
		this.pulsa = pulsa;
	}

	public String getNama(){
		return nama;
	}

	public String getAlamat(){
		return alamat;
	}

	public void cetakDevice() {
		for(int i = 0; i < this.jmlDevice; i++) {
			System.out.println(devArr[i].info() + "\n");
		}
	}

	public String info() {
		return "Username : " + getNama() + 
				"\nAlamat : " + getAlamat();
	}
	public int estimasiHari()
		{
			int totalKwh = 0;
			for(int i = 0; i < this.jmlDevice; i++) {
				totalKwh+=(devArr[i].getKwhDevice() * devArr[i].getDurasi());
			}
			return this.pulsa/totalKwh/24;
		}
}

// package hitungListrik;
// import java.util.Scanner;
// public class User extends Device{
// 	private String nama;
// 	private String alamat;
// 	private int pulsa;
// 	private int jmlDevice;
// 	private double totalKwh;
// 	private Device[] dev;

// 	public User(){
// 		super();
// 		this.nama="";
// 		this.alamat="";
// 		this.pulsa=0;
// 		this.jmlDevice=0;
// 		this.dev = new Device[this.jmlDevice];
// 	}

// 	public void inputJmlh(int jmlDevice)
// 		{
// 			this.jmlDevice = jmlDevice;
// 		}
// 	public int outputJmlh()
// 		{
// 			return this.jmlDevice;
// 		}

// 	public void inputDevice(int jmlDevice){
// 		Scanner in = new Scanner(System.in);
// 		for (int i=0; i<=jmlDevice; i++) {
// 			dev[i] = new Device();
// 			System.out.print("Input Nama Device : ");
// 			String namaDev = in.next();
// 			dev[i].setNamaDevice(namaDev);
// 			System.out.print("Input KwH Device : ");
// 			int kwhDev = in.nextInt();
// 			dev[i].setKwh(kwhDev);
// 			System.out.print("Input Durasi Penggunaan : ");
// 			double durasiDev = in.nextDouble();
// 			dev[i].setDurasi(durasiDev);
// 		}
// 	}

// 	public void setNama(String nama)
// 		{
// 			this.nama = nama;
// 		}
// 	public void setAlamat(String alamat)
// 		{
// 			this.alamat = alamat;
// 		}

// 	public String getNama(){
// 		return nama;
// 	}

// 	public String getAlamat(){
// 		return alamat;
// 	}

// 	public String getNamaDev(int i)
// 		{
// 			return this.dev[i].getNamaDevice();
// 		}

// 	public int currentPulsa()
// 		{
// 			return this.pulsa;
// 		}
// 	public void setPulsa(int pulas)
// 		{
// 			this.pulsa = pulsa;
// 		}
// }
