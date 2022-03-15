package Lesson10;

public class Main {
    public static void main(String[] args) {


        OnlineShop onlineShop = new OnlineShop();
        onlineShop.setAdressUrl("https://magazin.com");
        onlineShop.setName("Magazin");
        Tovar tovar = new Tovar();
        tovar.setName("Milk");
        tovar.setPrice(30);
        onlineShop.setTovar(tovar);


        Pokupatel pokupatel = new Pokupatel();
        pokupatel.setName("Dmitriy");
        pokupatel.setEmail("pokupatel@mail.ru");
        pokupatel.setPhoneNumber("8-999-000-79-99");
        pokupatel.setBethDay("01.01.1990");


        BonusCard bonusCard = new BonusCard();
        bonusCard.setCardNumber("1234567");
        bonusCard.setCardHolder("Skobsow Dmitriy");

        PayCard payCard = new PayCard();
        payCard.setCardNumber("1232-1223-4567-7656");
        payCard.setCardHolder("Skobsow Dmitriy");
        payCard.setBalance(1000);
        pokupatel.setPayCard(payCard);
        pokupatel.setBonusCard(bonusCard);



        onlineShop.chekPokupki(pokupatel);


    }

}

