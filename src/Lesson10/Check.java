package Lesson10;

public class Check {
    String datePokupki;
    Tovar tovar;
    double bonus;
    PayCard payCard;

    public Check() {
    }

    public Check(String datePokupki, Tovar tovar, double bonus, PayCard payCard) {
        this.datePokupki = datePokupki;
        this.tovar = tovar;
        this.bonus = bonus;
        this.payCard = payCard;
    }

    public String getDatePokupki() {
        return datePokupki;
    }

    public void setDatePokupki(String datePokupki) {
        this.datePokupki = datePokupki;
    }


    public Tovar getTovar() {
        return tovar;
    }

    public void setTovar(Tovar tovar) {
        this.tovar = tovar;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public PayCard getPayCard() {
        return payCard;
    }

    public void setPayCard(PayCard payCard) {
        this.payCard = payCard;
    }

    @Override
    public String toString() {
        return "Check{" +
                "datePokupki='" + datePokupki + '\'' +
                ", tovar=" + tovar +
                ", bonus=" + bonus +
                ", payCard=" + payCard +
                '}';
    }
}
