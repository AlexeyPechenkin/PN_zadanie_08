public class Main {
    public static void main(String[] args) {
        int[] arrMy1 = {1, 4, 7, 11, 14, 16, 21, 23, 26, 31, 101, 66};
        int[] arrRes;
        Separator sep1 = new Separator(arrMy1);
        arrRes = sep1.even();
        for (int i = 0; i < arrRes.length; i++) {
            System.out.println("even "+arrRes[i]);
        }
        arrRes= sep1.odd();
        for (int i = 0; i < arrRes.length; i++) {
            System.out.println("odd "+ arrRes[i]);
        }
    }
}
