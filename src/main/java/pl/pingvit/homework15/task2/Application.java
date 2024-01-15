package pl.pingvit.homework15.task2;
/*Создайте класс Person, в котором хранится имя, фамилия, дата рождения и любимый день недели (используйте классы из пакета
java.time).
Представим, что вам пришли данные из другой системы и вам нужно преобразовать их в объекты типа Pesron.
В классе Application создайте строку:
"Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10" (имя, фамилия, номер любимого дня, дата рождения)
   1. Напишите метод, который распарсит (преобразует) эту строку в массив обхектов Person.
   2. Вынесите данный метод в класс PersonParser, в классе Application создавайте объект этого типа и работайте с ним.
   3. Измените входные данные на "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10"
   обработайте полученную ошибку в классе PersonParser таким образом, чтобы программа не прерывала работу
 */
public class Application {
    public static void main(String[] args) {
        String text = "Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
        String text2 = "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
        PersonParser personParser = new PersonParser();
        Person[] persons = personParser.parse(text);
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("-----------------");

        PersonParser personParser1 = new PersonParser();
        Person[] persons1 = personParser1.parse(text2);
        for (Person person1 : persons1) {
            System.out.println(person1);
        }
    }
}

