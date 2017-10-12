public class EstWktPulsaHbs
	{
		private int pulsa;
		public EstWktPulsaHbs(int tdl, String namaDevice, int kwhDevice, double durasi, int pulsa)
			{
				super(tdl, namaDevice, kwhDevice, durasi);
				this.pulsa = pulsa;
			}
		public int currentPulsa()
			{
				return this.pulsa;
			}
		public void setPulsa(int pulas)
			{
				this.pulsa = pulsa;
			}
		public int hitungEst(double durasi, int kwhDevice, int pulsa)
			{

			}
	}