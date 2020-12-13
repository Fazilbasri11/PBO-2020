public abstract class Barisan { //class abstc untuk memberikan parameter ke sub class, dan mengambalikannya untuk class main
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