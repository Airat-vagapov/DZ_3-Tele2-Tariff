public class Tariff {
    long id;
    String name;

//  Сумма минут
    int minute;

//  Безлимитные звонки по Теле2
    boolean unlimitedTele2;

//  Сумма трафика
    int traffic;

    //Непонятно, как именно задать безлимитные соц сети, наверное проще задать их отдельным объектом?
    boolean unlimitedMedia;
//  Соц сети и другие медиа сервисы
    String imageFacebookUrl;
    String imageVkUrl;
    String imageOkUrl;
    String imageWhatsappUrl;
    String imageViberUrl;
    String imageMessengerUrl;
    String imageInstagramUrl;

//  Плашка Хит
    boolean hit;

//  Цена
    int price;

//  Кнопки
    boolean buttonBuy;
    boolean buttonSetup;
}