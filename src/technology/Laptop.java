package technology;

    public class Laptop extends Computer{
        private double weight;
        public Laptop(String brand, int storage, boolean powerOn, double weight) {
            super(brand, storage, powerOn);
            this.weight = weight;
        }

        public boolean isClunky(){
            if (weight > 5.0){
                return true;
            }
            else{
                return false;
            }
        }
}
