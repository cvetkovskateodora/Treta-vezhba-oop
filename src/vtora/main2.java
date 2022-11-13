package vtora;

public class main2 {

public static void main(String[] args) {
		
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "FIKT";
		f1.brojNaSmerovi = 5;
		f1.brojNaStudenti = 150;
		f1.dekan = "Teodora Cvetkovska";
		f1.sediste = "Bitola";
		
		f1.prvMetod();
		System.out.println("Namalen broj na studenti: " + f1.vtorMetod(21));
		f1.tretMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "PMF";
		f2.brojNaSmerovi = 8;
		f2.brojNaStudenti = 220;
		f2.dekan = "Eleonora Ivanovska";
		f2.sediste = "Skopje";
		
		f2.prvMetod();
		System.out.println("Namalen broj na studenti: " + f1.vtorMetod(18));
		f2.tretMetod();
		
	}
	
}
