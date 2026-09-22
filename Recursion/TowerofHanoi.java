public class TowerofHanoi {
    static void hanoi(int n, char src, char aux, char dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from" + src + " to" + dest);
            return;
        }
        hanoi(n - 1, src, dest, aux); // Move n - 1 disk
        System.out.println("Move disk" + n + " from" + src + "to" + dest);
        hanoi(n - 1, aux, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }
}
