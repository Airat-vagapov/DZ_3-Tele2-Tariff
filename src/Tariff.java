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
    boolean unlimitedFacebook;
    boolean unlimitedVk;
    boolean unlimitedOk;
    boolean unlimitedWhatsapp;
    boolean unlimitedViber;
    boolean unlimitedMessenger;
    boolean unlimitedInstagram;

//  Плашка Хит
    boolean hit;

//  Цена
    int price;

//  Кнопки
    boolean buttonBuy;
    boolean buttonSetup;
}
