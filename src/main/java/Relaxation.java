import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Relaxation {
    private Document document;

    public String getRelaxationObject(String msg) {
        return connect(msg);
    }

    private String connect(String msg) {

        switch (msg) {
            case "Аквапарки" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/akvaparki-95").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Атракционы" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/attraktsioni-127").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Зоопарки" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/zooparki-94").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Дельфинарии" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/delfinarii-96").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Музеи" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/muzei-91").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Экскурсии" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/ekskursii-78").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Активный отдых" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/paraplanerizm-49").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }

            default -> throw new IllegalStateException("Unexpected value: " + msg);
        }
        return getTitle(document);
    }

    public String getTitle(Document document) {
        Elements elements = document.getElementsByClass("mb-20");
        return elements.text();
    }

    public static SendMessage sendMessageAquapark(long chat_ad){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Аквапарки на карте");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/akvaparki-95");
        inlineKeyboardButton2.setText("Аквапарки Крыма: крытые, открытые.");
        inlineKeyboardButton2.setUrl("https://touristam.com/akvaparki-kryma.html");
        inlineKeyboardButton3.setText("ТОП 5 лучших аквапарков Крыма");
        inlineKeyboardButton3.setUrl("https://waterparkworld.ru/russia/top-cryma");
        List<InlineKeyboardButton> keyboardButtonRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow3 = new ArrayList<>();
        keyboardButtonRow1.add(inlineKeyboardButton1);
        keyboardButtonRow2.add(inlineKeyboardButton2);
        keyboardButtonRow3.add(inlineKeyboardButton3);
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(keyboardButtonRow1);
        keyboard.add(keyboardButtonRow2);
        keyboard.add(keyboardButtonRow3);
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return new SendMessage().setChatId(chat_ad).setText("Более подробно:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageAttractions(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Обзор парков в крыму");
        inlineKeyboardButton1.setUrl("https://azovsky.ru/otdyh-s-detmi/parki-razvlechenij-i-otdyha-v-krymu/");
        inlineKeyboardButton2.setText("8 развлекательных парков Крыма");
        inlineKeyboardButton2.setUrl("https://your-crimea.com/articles/interesnoe-o-kryme/top-8-razvlekatelnykh-parkov-v-krymu/");
        inlineKeyboardButton3.setText("Больше парков");
        inlineKeyboardButton3.setUrl("https://guruturizma.ru/25-luchshix-parkov-kryma/");
        List<InlineKeyboardButton> keyboardButtonRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow3 = new ArrayList<>();
        keyboardButtonRow1.add(inlineKeyboardButton1);
        keyboardButtonRow2.add(inlineKeyboardButton2);
        keyboardButtonRow3.add(inlineKeyboardButton3);
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(keyboardButtonRow1);
        keyboard.add(keyboardButtonRow2);
        keyboard.add(keyboardButtonRow3);
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return new SendMessage().setChatId(chat_ad).setText("Это может вас заинтересовать:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageZoo(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Зоопарки на карте");
        inlineKeyboardButton1.setUrl("https://gidcrima.ru/zooparki-kryma/");
        inlineKeyboardButton2.setText("Зоопарки");
        inlineKeyboardButton2.setUrl("https://www.krym4you.com/otdyh/zooparki/");
        inlineKeyboardButton3.setText("Актуально из Крыма");
        inlineKeyboardButton3.setUrl("https://grandfleur.com/novosti-kryma/73-luchshie-zooparki-kryma.html");
        List<InlineKeyboardButton> keyboardButtonRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow3 = new ArrayList<>();
        keyboardButtonRow1.add(inlineKeyboardButton1);
        keyboardButtonRow2.add(inlineKeyboardButton2);
        keyboardButtonRow3.add(inlineKeyboardButton3);
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(keyboardButtonRow1);
        keyboard.add(keyboardButtonRow2);
        keyboard.add(keyboardButtonRow3);
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return new SendMessage().setChatId(chat_ad).setText("А также:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageDolphinarium(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Дельфинарии на карте");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/delfinarii-96");
        inlineKeyboardButton2.setText("Дельфинарии узнайте больше");
        inlineKeyboardButton2.setUrl("https://turist.im/krym/delfinarii.html");
        inlineKeyboardButton3.setText("Актуально из Крыма");
        inlineKeyboardButton3.setUrl("https://www.krym4you.com/rejtingi/otdyh/delfinarii/");
        List<InlineKeyboardButton> keyboardButtonRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow3 = new ArrayList<>();
        keyboardButtonRow1.add(inlineKeyboardButton1);
        keyboardButtonRow2.add(inlineKeyboardButton2);
        keyboardButtonRow3.add(inlineKeyboardButton3);
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(keyboardButtonRow1);
        keyboard.add(keyboardButtonRow2);
        keyboard.add(keyboardButtonRow3);
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return new SendMessage().setChatId(chat_ad).setText("Подробнее:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageMuseum(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Музеи на карте");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/muzei-91");
        inlineKeyboardButton2.setText("Самое-самое");
        inlineKeyboardButton2.setUrl("https://tonkosti.ru/Музеи_Крыма");
        inlineKeyboardButton3.setText("Музеи Крыма: фото и описание");
        inlineKeyboardButton3.setUrl("https://www.tourister.ru/world/europe/russia/region/krym/museum");
        List<InlineKeyboardButton> keyboardButtonRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow3 = new ArrayList<>();
        keyboardButtonRow1.add(inlineKeyboardButton1);
        keyboardButtonRow2.add(inlineKeyboardButton2);
        keyboardButtonRow3.add(inlineKeyboardButton3);
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(keyboardButtonRow1);
        keyboard.add(keyboardButtonRow2);
        keyboard.add(keyboardButtonRow3);
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return new SendMessage().setChatId(chat_ad).setText("А также:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageTrip(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Экскурсии Крыма");
        inlineKeyboardButton1.setUrl("https://xcourse.me/krym");
        inlineKeyboardButton2.setText("Экскурсии по городам");
        inlineKeyboardButton2.setUrl("https://www.sputnik8.com/ru/regions/crimea");
        inlineKeyboardButton3.setText("Экскурсии каждый день");
        inlineKeyboardButton3.setUrl("https://tripshop.ru/krym/");
        List<InlineKeyboardButton> keyboardButtonRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow3 = new ArrayList<>();
        keyboardButtonRow1.add(inlineKeyboardButton1);
        keyboardButtonRow2.add(inlineKeyboardButton2);
        keyboardButtonRow3.add(inlineKeyboardButton3);
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(keyboardButtonRow1);
        keyboard.add(keyboardButtonRow2);
        keyboard.add(keyboardButtonRow3);
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return new SendMessage().setChatId(chat_ad).setText("Надеюсь вас заинтересует:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageActivitie(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("На карте");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/aktivnyj-otdyh-46");
        inlineKeyboardButton2.setText("15 вариантов активного отдыха в Крыму");
        inlineKeyboardButton2.setUrl("https://localway.ru/yalta/guide/505");
        inlineKeyboardButton3.setText("Походы по полуострову");
        inlineKeyboardButton3.setUrl("https://oetour.ru");
        inlineKeyboardButton4.setText("Активный отдых");
        inlineKeyboardButton4.setUrl("https://turnado.net/ru/d-krym/");
        List<InlineKeyboardButton> keyboardButtonRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonRow4 = new ArrayList<>();
        keyboardButtonRow1.add(inlineKeyboardButton1);
        keyboardButtonRow2.add(inlineKeyboardButton2);
        keyboardButtonRow3.add(inlineKeyboardButton3);
        keyboardButtonRow4.add(inlineKeyboardButton4);
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(keyboardButtonRow1);
        keyboard.add(keyboardButtonRow2);
        keyboard.add(keyboardButtonRow3);
        keyboard.add(keyboardButtonRow4);
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return new SendMessage().setChatId(chat_ad).setText("Выбор огромен:").setReplyMarkup(inlineKeyboardMarkup);
    }
}
