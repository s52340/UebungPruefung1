package FolienLV3OOP;

public class DemoBruch {
    public static void main(String[] args) {
        Bruch bruchOne = new Bruch(5,3);
        bruchOne.print();
        System.out.println(bruchOne.toDecimal());

        System.out.println();

        Bruch bruchtwo = new Bruch(2,3);
        bruchtwo.print();
        System.out.println(bruchtwo.toDecimal());

        System.out.println("bruchOne multiplicate bruchTwo: " +
                bruchOne.multiplicate(bruchtwo).getZaehler() + " / " +
                bruchOne.multiplicate(bruchtwo).getNenner());

        System.out.println();

        Bruch bruchthree = new Bruch(6, 4);
        bruchthree.print();
        System.out.println("bruchthree.toDecimal() = " + bruchthree.toDecimal());

        System.out.println();
        System.out.println("bruchOne multiplicate bruchTwo multiplicated bruchThree: " +
                bruchOne.multiplicate(bruchtwo,bruchthree).getZaehler() + " / " +
                bruchOne.multiplicate(bruchtwo,bruchthree).getNenner());

        System.out.println();

        //andere Möglichkeit:
        Bruch bruchMulitplicateB2 = bruchOne.multiplicate(bruchtwo);
        bruchMulitplicateB2.print();
        Bruch bruchMultiplicateB2B3 = bruchOne.multiplicate(bruchtwo,bruchthree);
        bruchMultiplicateB2B3.print();


        System.out.println();
        bruchthree.printCounter();
        bruchMultiplicateB2B3.printCounter();
    }
}
