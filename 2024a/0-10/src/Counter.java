public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int countSheeps = 0;
        if (arrayOfSheeps.length != 0) {
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i] != null) {
                    if (arrayOfSheeps[i] == true) {
                        countSheeps++;
                    }
                }
                else {
                    System.out.println("There is null value in the array");
                }
            }
        } else {
            System.out.println("This is an empty array");
        }
        return countSheeps;
    }
}