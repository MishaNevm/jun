package Ls17num7;

public class Plane {
    Wing wing;
    public Plane(int weightWing) {
        wing = new Wing(weightWing);
    }

    public class Wing {
        protected int weightWing;

        public Wing(int weightWing) {
            this.weightWing = weightWing;
        }

        public int getInfo() {
            return weightWing;
        }
    }
}

