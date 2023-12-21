package Airplans;

public class AirplaneFourth {
    //змінні класу оголошені модифікатором static
    static double length;
    static double width;
// Статичний блок ініціалізації класу
    static {
        length = 45.4;
        width = 8.2;
    }
    // Перший статичний метод: визначення площі літака
     static double square() {
        return length * width;
    }
    // Другий статичний метод: використання результатів роботи першого методу
    static void SquareAirplane() {
        // Виклик першого статичного методу для визначення площі
        double area = square();
      }
    }
