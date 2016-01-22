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

    public MyArray random () {
        for (int i = 0; i < this.array.length ; i++) {
            this.array [i] = (int)(Math.random()*100);
        }
        return this;
    }

    public MyArray enlarge (int add) {
        MyArray newArray = new MyArray(new int [this.array.length + add]);

        for (int i = 0; i < this.array.length; i++) {
            newArray.array[i] = this.array[i];
        }
        return newArray;
    }



    public MyArray sort(){
        MyArray sorted = new MyArray(new int [this.array.length]);
        //Copy from this to sort:
        for (int i = 0; i < this.array.length; i++) {
            sorted.array[i] = this.array[i];
        }
        //Sort sorted array:
        for (int i = sorted.array.length; i>=0 ; i--) {
            for (int j = 0; j <sorted.array.length-1 ; j++) {
                int k = j+1;
                if (sorted.array[j] > sorted.array[k]) {
                    swapnumbers(j,k,sorted.array);
                }
            }
        }
        return sorted;
    }

    public static void swapnumbers (int i, int j, int [] mas) {
        int temp = mas[i];
        mas[i] = mas[j];
        mas[j]=temp;
    }

    public String compare (MyArray other) {
        if (this.array.length == other.array.length) {
            for (int i = 0; i < other.array.length; i++) {
                if (this.array[i] != other.array[i]) {
                  return "Arrays have same length but elements are not the same!";
                }
            }
            return "Arrays are the same!!!";
        }
        else {
            return "Array are not the same!";
        }
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
