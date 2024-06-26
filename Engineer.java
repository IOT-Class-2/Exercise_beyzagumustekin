package merve_hoca_mex;

public class Engineer extends Employee {
    //'public' Bu sınıfın her yerşnden erişilebilir olduğunu belirtir.
    // 'extends' Employee, Engineer classını Employee sınıfından miras aldığını belirtir.
    //'Employee' sınıfından miras aldığını belirtir yanı 'Engineer' sınıfının
    // tüm özelliklerine ve methodlarına sahiptir.

    public Engineer(String name, double salary, int age) { // Bu sınıfın örneğini oluşturulurken çağırılan bir metodudur.
        super(name, salary, age);//'Employe' sınıfının yapıcı metodunu çağırır"name,","age",parametrlerini
        //Employee sınıfına iletir


    }


    //Constracture---> Yapıcı metot
    public double getAnnualBonus() {//Engineer in yıllık bnusunu hesaplayan metottur ve bu metotu döndürür
        return super.salary * .05;// Bu metot employee sınıfından alınana maaş/salary değişkenine erişir.
        //Ne ile erişir ? Super kelimesi ile erişir
        //Metodun genel işlevi ise maaşının %5'ini hesaplar ve döndürür.Bu Engineer'in yıllık bonusunu belirler.
    }
}
