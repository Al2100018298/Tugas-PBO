#include<iostream>
using namespace std;

int main() {
  	int i, j, baris, kolom;
  	int nilai1[15][15], nilai2[15][15], jumlah[15][15];
  	char ulang;
	do{
  		cout << "----- PROGRAM MATRIX C++ ------ \n";
  		cout << "Jumlah baris matrix yang diinginkan : "; cin >> baris;
  		cout << "Jumlah kolom matrix yang diinginkan : "; cin >> kolom;
  
 	 	//Nilai matrix 1
  		cout << "--Matrix 1-- \n";
  		cout << "Elemen pertama : ";
  		cout << endl;
  		for(i=0; i<baris; i++){
    		for(j=0; j<kolom; j++){
      			cin >> nilai1[i][j];
    		}
    		cout << endl;
  		}
  
  		//Nilai matrix 2
  		cout << "--Matrix 2-- \n";
  		cout << "Elemen kedua : ";
  		cout << endl;
  		for(i=0; i<baris; i++){
    		for(j=0; j<kolom; j++){
      			cin >> nilai2[i][j];
    		}
    		cout << endl;
  		}
  
  		//Penjumlahan 2 buah matrix
  		for(i=0; i<baris; i++){
    		for(j=0; j<kolom; j++){
      			jumlah[i][j] = nilai1[i][j] + nilai2[i][j];
    		}
  		}
  
  		//Hasilnya
  		cout << "Hasil penjumlahan matrix : \n";
  		for(i=0; i<baris; i++){
    		for(j=0; j<kolom; j++){
      			cout << jumlah[i][j] << "\t";
    		}
    		cout << endl;
  		}
  
 	 	//Pengulangan program
  		cout <<"\n\nApakah ingin mencoba perhitungan lagi? (y/t) : ";
  		cin >> ulang;
  		cout << endl;
  
 	 	if (ulang == 't'){
  			cout << "Terima Kasih Sudah Mencoba";
  		}
  		cout <<endl;
	}
	while(ulang == 'y');
	return 0;
}
