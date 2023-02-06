public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int arrEvenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrEvenCounter++;
            }
        }
        int[] arrEven = new int[arrEvenCounter];
        arrEvenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrEven[arrEvenCounter] = array[i];
                arrEvenCounter++;
            }

        }
        return arrEven;
    }

    public int[] odd() {
        int arrOddCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrOddCounter++;
            }
        }
        int[] arrOdd = new int[arrOddCounter];
        arrOddCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrOdd[arrOddCounter] = array[i];
                arrOddCounter++;
            }

        }
        return arrOdd;
    }
}