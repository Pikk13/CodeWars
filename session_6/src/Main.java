public class Main {
    public static void main(String[] args) {

        int[] n = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(SquareSum.squareSum(n));
        System.out.println("*************************************");
        Dns dns = new Dns();
        System.out.println(dns.dnaToRna("TURRTA"));
        System.out.println("*************************************");
        System.out.println(Meeting.meeting("Fred:Corwill;Wilfred:Corwill;" +
                "Barney:Tornbull;Betty:Tornbull;" +
                "Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"));
        System.out.println("*************************************");
        System.out.println(CatsAndShelves.solution(1, 10));

        System.out.println("*************************************");
        System.out.println(TriangleTester.isTriangle(7, 2, 2));
        System.out.println("*************************************");
        TowerBuilder.towerBuilder(6); // NEM JÓÓ
        System.out.println(PigLatin.pigIt("Pig latin is cool"));
    }
}