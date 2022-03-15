package Lesson10;

public class Pokupatel {
    String name;
    String phoneNumber;
    String email;
    String date;
    PayCard payCard;
    BonusCard bonusCard;
    String BethDay;
    Tovar tovar;



    public Pokupatel() {
    }

    public Pokupatel(String name, String phoneNumber, String email, String date, PayCard payCard, BonusCard bonusCard, String bethDay, Tovar tovar) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
        this.payCard = payCard;
        this.bonusCard = bonusCard;
        BethDay = bethDay;
        this.tovar = tovar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PayCard getPayCard() {
        return payCard;
    }

    public void setPayCard(PayCard payCard) {
        this.payCard = payCard;
    }

    public BonusCard getBonusCard() {
        return bonusCard;
    }

    public void setBonusCard(BonusCard bonusCard) {
        this.bonusCard = bonusCard;
    }

    public String getBethDay() {
        return BethDay;
    }

    public void setBethDay(String bethDay) {
        BethDay = bethDay;
    }

    public Tovar getTovar() {
        return tovar;
    }

    public void setTovar(Tovar tovar) {
        this.tovar = tovar;
    }

    @Override
    public String toString() {
        return "Pokupatel{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                ", payCard=" + payCard +
                ", bonusCard=" + bonusCard +
                ", BethDay='" + BethDay + '\'' +
                ", tovar=" + tovar +
                '}';
    }
}
