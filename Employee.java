package merve_hoca_mex;

public class Employee { //'public' Bu sınıfın her yerşnden erişilebilir olduğunu belirtir.

    private String name;// 'private' bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu belirtir.
   // çalışanın adını tutan bir metin değişkenidir.

    protected double salary;// bu değişkenşn aynı pakette içerisinden veya alt sınıflarından erişilebilir.
   // Çalışanın maaşını tutan ondalık sayı değişkeni

    private int age;//'private' Bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu belirtir.
    //Çalışanın yaşını tutan tam sayı değişkeni

    public Employee(String name, double salary, int age) { // Bu sınıfın bir örneği oluşturulurken çağırılan metotdur.
        this.name = name;//"name" parametresini sınıfın 'name' değişkenine atar.
        this.salary = salary;//"salary" parameterini sınıfın 'salary' değişkenine atar.
        this.age = age;//"age" parametresini sınıfın 'age' değişkenine atar.
    }
    //Getter ve Setter metotları:
    // Bu metodlar, özel değişkenlerin değerlerini dış dünyaya(başka sınıflara yani) vermek için kullanılır.

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary() { //Çalışanın maaşını arttıran metod
        this.salary = this.salary * 1.2;//%20 arttırır.
    }
}



