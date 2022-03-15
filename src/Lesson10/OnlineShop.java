package Lesson10;

public class OnlineShop {
    String name ;
    String adressUrl;
    Pokupatel pokupatel;
    Tovar tovar;

    public OnlineShop() {
    }

    public OnlineShop(String name, String adressUrl, Pokupatel pokupatel, Tovar tovar) {
        this.name = name;
        this.adressUrl = adressUrl;
        this.pokupatel = pokupatel;
        this.tovar = tovar;
    }

    public boolean chekPokupki(Pokupatel pokupatel){
        if (pokupatel.getPayCard().getBalance() >= tovar.getPrice()){
            pokupatel.setTovar(this.tovar);
            sendMessage(pokupatel);
            System.out.println("Покупка прошла успешно");
            System.out.println(pokupatel.getTovar());
            System.out.println(pokupatel.getBonusCard());
            return true;
        }else {
          return false;
        }
    }

    public void sendMessage(Pokupatel pokupatel){
        Message message = new Message();
        Check check = new Check();
        check.setBonus(tovar.getPrice() / 100 * 1);
        check.setTovar(this.tovar);
        check.setDatePokupki("27-11-2021 14:07");
        PayCard payCard = maskirovkaCard(pokupatel.getPayCard());
        check.setPayCard(payCard);
        message.setHelloMessage("Здравствуйте " + pokupatel.getName() + " " + "Спасибо что выбрали магазин " + name);
        message.setCheck(check);
        System.out.println(message);

    }
    public PayCard maskirovkaCard(PayCard payCard){
        String s1 = "XXXX-XXXX-XXXX-2122";//1234-5666-5555-2122
        s1 += payCard.getCardNumber().substring(payCard.getCardNumber().length()-4);
        payCard.setCardNumber(s1);
        return payCard;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressUrl() {
        return adressUrl;
    }

    public void setAdressUrl(String adressUrl) {
        this.adressUrl = adressUrl;
    }

    public Pokupatel getPokupatel() {
        return pokupatel;
    }

    public void setPokupatel(Pokupatel pokupatel) {
        this.pokupatel = pokupatel;
    }

    public Tovar getTovar() {
        return tovar;
    }

    public void setTovar(Tovar tovar) {
        this.tovar = tovar;
    }

    @Override
    public String toString() {
        return "OnlineShop{" +
                "name='" + name + '\'' +
                ", adressUrl='" + adressUrl + '\'' +
                ", pokupatel=" + pokupatel +
                ", tovar=" + tovar +
                '}';
    }
}
