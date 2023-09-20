package pl.pingvit.homework4;

/*Нарисуйте оставшиеся 2 треугольника.
        Опционально: можете нарисовать все 4 фигуры, чтобы у вас получился ромб
        *  (1)
        **
        ***
        ****

        ****  (2)
        ***
        **
        *
*/
public class Triangles {
    public static void main(String[] args) {
        int size = 4;
        for (int i = 0; i <= size; i += 1) {
            for (int j = 0; j < size - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < size - i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

