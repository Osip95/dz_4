public class Main {
    public static void main(String[] args) {
        //task 1
        int i = 0;
        while (true) {
            i++;
            System.out.print(i + " ");
            if (i == 10) {
                System.out.println("");
                break;
            }
        }
        for (; i > 0; i--) {
            System.out.print(i + " ");
            if (i == 1) System.out.println("");
        }

        //task 2
        int friday = 1;
        while (true) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
            if (friday > 31) break;
        }

        //task 3
        int thisYear = 2017;
        int start = thisYear - 200;
        int stop = thisYear + 100;

        for (int count = start + 79; count < stop; count = count + 79) {
            System.out.println(count);
        }

        //task 4
        for (int l = 1; l <= 30; l++) {
            if ((l % 3 == 0) && (l % 5 == 0)) System.out.println(l + ": ping pong");
            else if (l % 3 == 0) System.out.println(l + ": ping");
            else if (l % 5 == 0) System.out.println(l + ": pong");
            else System.out.println(l + ":");
        }

        //task 5
        int x = 0;
        int y = 1;
        System.out.print(x + " " + y + " ");
        for (int k = 0; k < 8; k++) {
            int z = x + y;
            x = y;
            y = z;
            System.out.print(z + " ");
        }

    }
}