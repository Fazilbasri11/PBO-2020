public abstract class Barisan {
        protected int nilaiBerikutnya;
        public Barisan(){
            nilaiBerikutnya=0;
        }
    
        public Barisan(int nilaiAwal) {
            nilaiBerikutnya = nilaiAwal;
        }
    
        public int berikutnya(){
            naik();
            return nilaiBerikutnya; 
        }
        public abstract void naik();
}