package misha;

public class SingletoneExample {
    /**
     * <p>
     * Дополнительный материал к 7 уроку в курсе про Spring Framework
     * <p>
     * Пример класса, реализующего паттерн Singleton (англ. Одиночка)
     * Можно будет использовать только один объект класса Lesson7Singleton
     */
    // В этой статической(!) переменной будет хранится единственный объект класса SingletoneExample
    private static SingletoneExample instance;

    // Скажем, что у нашего единственного объекта должно быть поле value
    private String value;

    // Метод getter для поля value
    public String getValue() {
        return value;
    }

    // ВАЖНО: Конструктор должен быть приватным
    // Мы не хотим, чтобы пользователь мог создавать новые объекты класса SingletoneExample
    private SingletoneExample(String value) {
        this.value = value;
    }

    // Вот этот статический метод будет вызывать пользователь, чтобы получить объект класса Lesson7Singleton
    public static SingletoneExample getInstance(String value) {
        // если ранее не был создан единственный объект
        if (instance == null) {
            // код здесь выполняется только в момент первого вызова метода getInstance()

            // создаем объект один раз
            instance = new SingletoneExample(value);
        }

        // все остальные вызовы метода getInstance() пользователю возвращается тот же самый объект
        return instance;
    }
}

// Тестируем
class SingletonTest {
    public static void main(String[] args) {
        SingletoneExample first = SingletoneExample.getInstance("Hello!");
        SingletoneExample second = SingletoneExample.getInstance("Goodbye!");

        // true
        System.out.println(first == second);

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());
    }
}

