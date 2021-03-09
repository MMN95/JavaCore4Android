public class MainClass {

    public int[] task1(int[] arr) throws RuntimeException {
        int[] newArr = new int[0];
        for (int i = 0; i < arr.length; i++) {
            newArr = new int[i];
            if ((arr[arr.length - 1 - i]) == 4) {
                System.arraycopy(arr, arr.length - i, newArr, 0, i);
                break;
            } else if (arr.length - 1 == newArr.length)
                throw new RuntimeException("В массиве нет ни одной четвёрки!");
        }
        return newArr;
    }

    public boolean task2(int[] arr){
        int ones = 0, fours = 0;
        for (int i : arr) {
            if (i == 1) ones++;
            else if (i == 4) fours++;
            else return false;
        }
        return fours != 0 && ones != 0;
    }

}

