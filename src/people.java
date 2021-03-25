import java.util.Scanner;
class Sotrudniki{
    String fam, im, otch;
    int vozrast, razmer;
}
public class people {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");

        System.out.println("Введите количество сотрудников => ");
        int kol = sc.nextInt();
        sc.nextLine(); // очистка буфера после ввода числа
        Sotrudniki[] sotr = new Sotrudniki[kol]; // получена ссылка на массив сотрудников
        System.out.println("Введите информацию о каждом сотруднике: ");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Sotrudniki(); // получена ссылка на i-тый элемент
            // Присвоение значений полям
            System.out.print("Введите фамилию " + (i + 1) + " сотрудника => ");
            sotr[i].fam = sc.nextLine();

            System.out.print("Введите его имя => ");
            sotr[i].im = sc.nextLine();

            System.out.print("Введите его отчество => ");
            sotr[i].otch = sc.nextLine();

            System.out.print("Введите его возраст => ");
            sotr[i].vozrast = sc.nextInt();

            System.out.print("Введите его размер одежды => ");
            sotr[i].razmer = sc.nextInt();
            sc.nextLine(); //очистка буфера
        } // end for
        // Вывод информации о сотрудниках
        System.out.println("\n Сотрудники фирмы: \n фам \t имя \t отч \t возраст \t размер одежды");
        for (Sotrudniki s : sotr) {
            System.out.print(s.fam + "\t" + s.im + "\t" + s.otch + "\t " + s.vozrast + "\t\t" + s.razmer + "\n");
        }
// человек с самым большим размером одежды
        int nommax = 0;
        double max = sotr[nommax].razmer;
        for (Sotrudniki str : sotr)
            System.out.println("" + str.fam + "\t" + str.im + "\t" + str.otch + "\t" + str.razmer + " лет");
        for (int i = 0; i < sotr.length; i++)
            if (sotr[i].razmer > max) {
                max = sotr[i].razmer;
                nommax = i;
            }
        System.out.println("\nЧеловек с самым большим размером одежды :");
        System.out.println("" + sotr[nommax].fam + "\t" + sotr[nommax].im + "\t" + sotr[nommax].otch + "\t" + sotr[nommax].razmer + "лет");
    }
}

