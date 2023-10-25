class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        boolean isTriangle = false;
        if (a > 0 && b > 0 && c > 0) {
            if (((a + b) > c) && ((a + c) > b) && ((c + b) > a)) {
                isTriangle = true;
            }
        }
        return isTriangle;
    }
}

