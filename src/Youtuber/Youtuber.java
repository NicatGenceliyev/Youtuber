package Youtuber;

public abstract class Youtuber {
	// degiskenlerin tam ismi:  abone sayisi, toplam izlenme, video sayisi, kanal ismi, ad, soyad.
	private int vSayi; 
	private String kIsim, ad, soyad;
	private double abone, tIzlenme;
	
	Youtuber(double abone, double tIzlenme, int vSayi, String kIsim, String ad, String soyad) {
		this.abone = abone;
		this.tIzlenme = tIzlenme;
		this.vSayi = vSayi;
		this.kIsim = kIsim;
		this.ad = ad;
		this.soyad = soyad;
	}
	
	void Yazdir() {
		System.out.println("Abone: " + abone);
		System.out.println("Toplam Izlenme: " + tIzlenme);
		System.out.println("Video Sayisi: " + vSayi);
		System.out.println("Kanal Ismi: " + kIsim);
		System.out.println("Ad: " + ad);
		System.out.println("Soyad: " + soyad);
	}
	
	public static void main(String[] args) {
		EnesBatur eb = new EnesBatur();
		eb.Yazdir();
		System.out.println();
		eb.Hakkinda();
		
	}
	
	public abstract void Hakkinda();
}

class EnesBatur extends Youtuber {

	
	EnesBatur() {
		super(15.4, 8.7, 654, "Enes Batur", "Enes Batur", "Sungurtekin");
	}
	@Override
	public void Hakkinda() {
		System.out.println("Enes Batur Hakkinda: Ben Enes Batur , 23 Yaşındayım 5 Yıldır Youtube'a içerik çıkartıyorum. Hemen hemen her türde içerik"
				+ "\nyapabiliyorum ve istediğimi yapmakta sonuna kadar özgürüm. Beni takip eden insanlara ailem"
				+ "\ndiyorum. Bu arada , Youtube Türkiye'nin en büyük Youtube Kanalıyım.");
		
	}
	
}
