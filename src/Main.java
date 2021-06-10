public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> listOfInt = new MyArrayList<>();
        listOfInt.addElement(10);
        listOfInt.addElement(18);
        listOfInt.addElement(5);
        listOfInt.addElement(9);
        listOfInt.addElement(24);

        listOfInt.addWithIndex(7, 15);

        listOfInt.addElement(45);

        System.out.println("Length of list is " + listOfInt.size() + ".");

        for (int i = 0; i < listOfInt.size(); i++){
            System.out.print(listOfInt.get(i) + " ");
        }
        System.out.println("");

        listOfInt.remove(0);

        System.out.println("Length of list is " + listOfInt.size() + ".");

        for (int i = 0; i < listOfInt.size(); i++){
            System.out.print(listOfInt.get(i) + " ");
        }
        System.out.println("");

        for (int i = 0; i < listOfInt.size(); i++){
            listOfInt.set(i, i + 1);
            System.out.print(listOfInt.get(i) + " ");
        }
    }
}
