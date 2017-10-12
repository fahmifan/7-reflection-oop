<<<<<<< HEAD
// package static;
import java.util.Scanner;

public class User extends PLN{
	private String nama;
	private String alamat;
	private int jmlDevice;
	private Device[] devArr;

	public User() {
		this.nama = "";
		this.alamat = "";
		this.jmlDevice = 0;
		this.pulsa = 0;
	}

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
=======
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
>>>>>>> 62a4914ac9f655d79266e0ee4b3b8918f7e3dcff
	}

	public String getNama(){
		return nama;
	}

	public String getAlamat(){
		return alamat;
	}

<<<<<<< HEAD
	public void cetakDevice() {
		for(int i = 0; i < this.jmlDevice; i++) {
			System.out.println(devArr[i].info() + "\n");
		}
	}

	public String info() {
		return "Username : " + getNama() + 
				"\nAlamat : " + getAlamat();
	}
}

=======
	public String info(){
		return info;
	}
	
}
>>>>>>> 62a4914ac9f655d79266e0ee4b3b8918f7e3dcff
