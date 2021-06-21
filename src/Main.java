public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> integers = new MyArrayList<>(5);

        integers.add(1);

        integers.add(1, 2);
        integers.add(2, 3);
        integers.add(3, 4);

        integers.add(5);
        integers.add(6);
        integers.add(6);

        integers.add(6, 7);
        integers.add(7, 8);
        integers.add(8, 9);
        integers.add(9, 10);
        integers.add(0, 0);

        integers.remove(11);
        integers.remove(0);

        integers.add(5, 5);

        integers.remove(5);

        integers.add(0, 10);
        integers.add(11, 15);

        integers.insert(0, 0);
        integers.insert(11, 11);

        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
            System.out.println(integers.size());
        }
    }
}
