public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.length() > 20) {
            throw new IllegalNameException("Ошибка. Длина имени человека не может быть " +
                    "больше 20 символов. Вы ввели " + name);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0 || age >= 100) {
            throw new IllegalAgeException("Ошибка. Возраст человка не может быть " +
                    "больше 100 или меньше 0. Вы ввели " + age);
        }
        this.age = age;
    }
}
