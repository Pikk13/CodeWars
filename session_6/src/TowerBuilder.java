public class TowerBuilder {

    public static String[] towerBuilder(int nFloors)
    {

        String [] towerBuilder = new String[nFloors];
        StringBuilder tower = new StringBuilder();
        String nextFloor = null;

        String space = " ";
        String star = "*";
        int firstFloorStars = 1;
        for (int i = 1; i <= nFloors - 1; i++) {
            firstFloorStars += 2;
        }

        for (int i = 0; i < firstFloorStars; i++) {
            tower.append(star);

        }


        nextFloor = tower.toString();


            char replacement1 = nextFloor.charAt(0);
            nextFloor = nextFloor.replace(Character.toString(replacement1), space);// lecserélem az első csillagot

        System.out.println(nextFloor);

            char replacement2 = nextFloor.charAt(firstFloorStars-1);
            nextFloor = nextFloor.replace(Character.toString(replacement2), space); // lecseréli az utolsó csillagot
           ;


//        System.out.println(tower.toString());


//        if (nFloors == 1){tower.append("*");}
//        if (nFloors == 2){tower.append("***");}

//        for (int i = 1; i <= nFloors ; i++) {
//            if (nFloors == 1){tower.append("*");}
//            if (nFloors == 2){tower.append("***");}
//
//
////            tower.append("*").append("fdsfafd",i, nFloors);
//            towerBuilder[nFloors-1] = tower.toString();
////            String floor = towerBuilder[nFloors-1];



        return new String[0];
    }
}

