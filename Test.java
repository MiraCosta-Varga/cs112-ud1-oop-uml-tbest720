public class Test {
    public static void main(String[] args) {
    //TESTING FULL CONSTRUCTOR
        try{
            Hat testHat = new Hat("N55555", 2020, "Trucker", "1118", "1086", "1147", "2163", "1142", "1790", true, true,
                    true, true);
            System.out.println(testHat + "\n");
        } catch (InvalidSkuException | InvalidThreadCodeException | InvalidYearException e) {
            System.out.println(e.getMessage());
        }
    //TESTING DEFAULT CONSTRUCTOR
        Hat defaultHat = new Hat();
        System.out.println(defaultHat);

    //TESTING SETTERS
        
        try{
            defaultHat.setSku("N12345");
            defaultHat.setYear(2022);
            defaultHat.setModelDescription("Snapback");
            defaultHat.setColor1("2222");
            defaultHat.setColor2("3333");
            defaultHat.setColor3("4444");
            defaultHat.setColor4("5555");
            defaultHat.setProductColor("6666");
            defaultHat.setTonalColor("7777");
    
            defaultHat.setFront(false);
            defaultHat.setRightSide(false);
            defaultHat.setLeftSide(false);
            defaultHat.setBackArch(false);
            System.out.println(defaultHat + "\n");
        } catch (InvalidSkuException | InvalidThreadCodeException | InvalidYearException e) {
            System.out.println(e.getMessage());
        }
        
        //TESTING EXCEPTION HANDLING
            //SKU EXCEPTION
        try{
            Hat testHat = new Hat("N55555511", 2020, "Trucker", "1118", "1086", "1147", "2163", "1142", "1790", true, true,
                    true, true);
            System.out.println(testHat + "\n");
        } catch (InvalidSkuException | InvalidThreadCodeException | InvalidYearException e) {
            System.out.println(e.getMessage());
        }
        
        //YEAR EXCEPTION
        try{
            Hat testHat = new Hat("N55555", 1000 , "Trucker", "1118", "1086", "1147", "2163", "1142", "1790", true, true,
                    true, true);
            System.out.println(testHat + "\n");
        } catch (InvalidSkuException | InvalidThreadCodeException | InvalidYearException e) {
            System.out.println(e.getMessage());
        }

        //THREAD CODE EXCEPTION
        try{
            Hat testHat = new Hat("N55555", 2020 , "Trucker", "1118", "1086643", "1147", "2163", "1142", "1790", true, true,
                    true, true);
            System.out.println(testHat + "\n");
        } catch (InvalidSkuException | InvalidThreadCodeException | InvalidYearException e) {
            System.out.println(e.getMessage());
        }
    }
}
