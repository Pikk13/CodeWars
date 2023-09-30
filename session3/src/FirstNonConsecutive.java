class FirstNonConsecutive {

    static Integer find(final int[] array) {
        Integer find = null;
        if (array.length >= 2) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1] && array[i] != array[i + 1] - 1) {
                    find = array[i + 1];
                    break;
                }
            }
        }
        return find;
    }
}
