public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> integers = new MyArrayList<>(5);

        integers.add(0);
        integers.add(1);

        integers.add(2, 2);
        integers.add(3, 3);
        integers.add(4, 4);

        integers.add(3);
        integers.add(4);




        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
            System.out.println(integers.size());
        }
    }
}
