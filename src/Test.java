public class Test {
    private int[] array;
    private boolean[] arrayB;

    public void test(int... v) {
        array = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            array[i] = v[i];
        }
    }

    public void test(boolean... v) {
        arrayB = new boolean[v.length];
        for (int i = 0; i < v.length; i++) {
            arrayB[i] = v[i];
        }
    }
    public void test (){
        System.out.println("Pysto");
    }

    public int[] getArray() {
        return array;
    }
    public boolean[] getArrayB (){
        return arrayB;
    }
}
