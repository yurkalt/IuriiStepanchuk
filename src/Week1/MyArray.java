package Week1;

/**
 * Created by Iurii on 21.01.2016.
 */
public class MyArray {

    private int [] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    public int min () {
        int min = this.array [0];
        for (int i = 1; i < this.array.length ; i++) {
            if (this.array[i] < min) {
                min = this.array[i];
            }
        }
        return min;
    }

    public int max () {
        int max = this.array [0];
        for (int i = 1; i < this.array.length ; i++) {
            if (this.array[i] > max) {
                max = this.array[i];
            }
        }
        return max;
    }

    public int [] random (int length) {
        int [] random = new int [length];
        for (int i = 0; i < length ; i++) {
            random [i] = (int)(Math.random()*100);
        }
        return random;
    }

    public void print () {
        System.out.print("{");
        for (int i = 0; i < this.array.length ; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println("}");
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
