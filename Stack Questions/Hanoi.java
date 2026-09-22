import java.util.Stack;

public class Hanoi {
    static class Move {
        int disk;
        char from;
        char to;

        Move(int disk, char from, char to) {
            this.disk = disk;
            this.to = to;
            this.from = from;
            this.from = from;
        }

        void print() {
            System.out.println("Move disk" + disk + " from " + from + "to " + to);
        }
    }

    static void moveDisk(Stack<Integer> fromRod, Stack<Integer> toRod, char fromLabel, char toLabel) {
        if (fromRod.isEmpty()) {
            int disk = toRod.pop();
            fromRod.push(disk);
            System.out.println("Move Disk" + disk + "from" + toLabel + "to" + fromLabel);
        } else if (toRod.isEmpty()) {
            int disk = fromRod.pop();
            toRod.push(disk);
            System.out.println("Move disk" + disk + "from" + fromLabel + "to" + toLabel);
        } else {
            int topFrom = fromRod.peek();
            int topTo = toRod.peek();

            if (topFrom < topTo) {
                int disk = fromRod.pop();
                toRod.push(disk);
                System.out.println("Move disk " + disk + " from " + fromLabel + " to " + toLabel);
            } else {
                int disk = toRod.pop();
                fromRod.push(disk);
                System.out.println("Move disk " + disk + " from " + toLabel + " to " + fromLabel);
            }
        }
    }

    static void towerOfHanoi(int n, char src, char aux, char dest) {
        Stack<Integer> source = new Stack<>();
        Stack<Integer> auxiliary = new Stack<>();
        Stack<Integer> destination = new Stack<>();

        if (n % 2 == 0) {
            char temp = dest;
            dest = aux;
            aux = temp;
        }
        // Initialize source
        for (int i = n; i >= 1; i--) {
            source.push(i);
        }
        int totalMoves = (int) Math.pow(2, n) - 1;
        for (int i = 1; i <= totalMoves; i++) {
            if (i % 3 == 1)
                moveDisk(source, destination, src, dest);
            else if (i % 3 == 2)
                moveDisk(source, auxiliary, src, aux);
            else
                moveDisk(auxiliary, destination, aux, dest);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
