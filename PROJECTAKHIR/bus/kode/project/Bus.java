package kode.project;

import java.util.ArrayList;

public class Bus{
	//instance atribut
	private ArrayList<Penumpang> penumpangBiasa;
	private ArrayList<Penumpang> penumpangPrioritas;
	private ArrayList<Penumpang> penumpangBerdiri;
	public Bus(){
		penumpangBiasa = new ArrayList<>();
		penumpangPrioritas = new ArrayList<>();
		penumpangBerdiri= new ArrayList<>();
	}
	//penumpang biasa
	public ArrayList<Penumpang> getPenumpangBiasa(){
		return penumpangBiasa;
	}
	public int getJumlahPenumpangBiasa(){
		return penumpangBiasa.size();
	}

	//penumpang prioritas
	public ArrayList<Penumpang> getPenumpangPrioritas(){
		return penumpangPrioritas;
	}
	public int getJumlahPenumpangPrioritas(){
		return penumpangPrioritas.size();
	}

	//penumpang berdiri
	public ArrayList<Penumpang> getPenumpangBerdiri(){
		return penumpangBerdiri;
	}
	public int getJumlahPenumpangBerdiri(){
		return penumpangBerdiri.size();
	}

	//naik penumpang
	public boolean naik(Penumpang penumpang){
        if(penumpang.getPrioritas() && getJumlahPenumpangPrioritas() < 4){
                penumpangPrioritas.add(penumpang);
                return true;
        }else if(getJumlahPenumpangBiasa()  < 16){
                penumpangBiasa.add(penumpang);
                return true;
        }else if(getJumlahPenumpangBerdiri() < 20){
				penumpangBerdiri.add(penumpang);
				return true;
		}
        return false;
    }

	// turun penumpang
	public boolean turun(String nama){
		for(int i=0; i < penumpangBiasa.size(); i++){
			if(penumpangBiasa.get(i).getNama().equals(nama)){
				penumpangBiasa.remove(i);
				System.out.println("\n++Berhasil Dihapus++");		
			}
		}
		for(int j=0; j < penumpangPrioritas.size(); j++){
			if(penumpangPrioritas.get(j).getNama().equals(nama)){
				penumpangPrioritas.remove(j);
				System.out.println("\n++Berhasil Dihapus++");			
			}		
		}return true;
	}

	//display
	public void display(){
		//penumpang prioritas display
		if ( getJumlahPenumpangPrioritas() == 0){
			System.out.println("\nPenumpang Prioritas Belum Ada");
		}
		else{	
			System.out.println("\n=== Penumpang Prioritas ===\n");
			for(int i=0; i < getJumlahPenumpangPrioritas(); i++){
				System.out.println(penumpangPrioritas.get(i)+"\n");
			}
		}
		System.out.println("-------------------------------");
		
		// penumpang biasa display
		if ( getJumlahPenumpangBiasa() == 0) {
			System.out.println("\nPenumpang Biasa Belum Ada");
		}
		else{
			System.out.println("\n=== Penumpang Biasa ===\n");
			for(int i=0; i < getJumlahPenumpangBiasa(); i++){
			System.out.println(penumpangBiasa.get(i)+"\n");
			}
		}
		System.out.println("-------------------------------");

		//penumpangberdiri
		if(getJumlahPenumpangBerdiri()==0){
			System.out.println("\nTidak ada penumpang yang berdiri");
		}
		else{
			System.out.println("\n=== Penumpang Berdiri ===\n");
			for(int i=0; i<getJumlahPenumpangBerdiri(); i++){
				System.out.println(penumpangBerdiri.get(i)+"\n");
			}
		}
		System.out.println("-------------------------------");

		int jmlh = getJumlahPenumpangBiasa() + getJumlahPenumpangPrioritas() + getJumlahPenumpangBerdiri();
		System.out.println("\n=== Jumlah Penumpang : "+jmlh+" ===");
		System.out.println("=== Jumlah Pendapatan : "+jmlh*2000+" ==="); // dikarenakan fungsi dari metod saldo belum berfungsi pada class , maka saya menggunakan cara ini.
	}
}	