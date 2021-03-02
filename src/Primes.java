public class Primes {

    public static void main(String[] args) { // Нахождение простых чисел в пределах от 2 до 100
        int i,j;

        for (i=2;i<100;i++)
        {int k=0;

            for (j=2;j<=i;j++)  // проверить, делится ли число без остатка
            {
                if ((i%j) == 0) // если число делится без остатка, значит, оно не простое
                    k++;
            }
            if (k<2)
                System.out.println(i+ " - простое число.");
        }
    }

}
