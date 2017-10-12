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
}

