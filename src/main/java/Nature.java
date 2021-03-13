import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Nature {
    private Document document;

    public String getNatureObject(String msg) {
        return connect(msg);
    }

    private String connect(String msg) {
        switch (msg) {
            case "Тропы" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/tropy-84").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Водоемы" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/vodoemy-102").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Пещеры" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/pescheri-101").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Горы и скалы" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/gori-i-skali-98").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Водопады" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/vodopadi-100").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Бухты" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/buhti-132").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Заповедники" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/zapovedniki-104").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Родники" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/rodniki-106").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Планетарий" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/planetarij-147").get();
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

    public  SendMessage sendMessage(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Таракташская тропа");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/o/taraktashskaya-tropa-524");
        inlineKeyboardButton2.setText("Тропа Голицына");
        inlineKeyboardButton2.setUrl("https://prostorikrima.ru/o/tropa-golitsyina-539");
        inlineKeyboardButton3.setText("Чертова Лестница");
        inlineKeyboardButton3.setUrl("https://prostorikrima.ru/o/certova-lestnica-659");
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
        return new SendMessage().setChatId(chat_ad).setText("Извесьнейшие тропы:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessagePond(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Юсуповское озеро");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/o/yusupovskoe-ozero-667");
        inlineKeyboardButton2.setText("Подробнее с картой");
        inlineKeyboardButton2.setUrl("https://prostorikrima.ru/c/vodoemy-102");
        inlineKeyboardButton3.setText("30 главных озер Крыма");
        inlineKeyboardButton3.setUrl("https://must-see.top/ozera-kryma/");
        inlineKeyboardButton4.setText("Интересные статьи");
        inlineKeyboardButton4.setUrl("http://krymea.ru/vodoemy");
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
        return new SendMessage().setChatId(chat_ad).setText("А также:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageСave(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Пещеры на карте");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/pescheri-101");
        inlineKeyboardButton2.setText("Итересные статьи");
        inlineKeyboardButton2.setUrl("http://krymea.ru/peschery");
        inlineKeyboardButton3.setText("Знаменитые пещеры Крыма");
        inlineKeyboardButton3.setUrl("https://travelcrimea.com/priroda/20210105/1579880.html");
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
    public  SendMessage sendMessageMountain(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Горы и скалы на карте");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/gori-i-skali-98");
        inlineKeyboardButton2.setText("Крымские горы: Знаменитый Аю-Даг");
        inlineKeyboardButton2.setUrl("https://www.kp.ru/russia/gory-rossii/krymskie/");
        inlineKeyboardButton3.setText("Горы Крыма – величие и красота природы");
        inlineKeyboardButton3.setUrl("https://gidcrima.ru/gory-kryma/");
        inlineKeyboardButton4.setText("Больше.. гор");
        inlineKeyboardButton4.setUrl("https://www.krym4you.com/dostoprimechatelnosti/gory/gora-kastel/");
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
        return new SendMessage().setChatId(chat_ad).setText("А также:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageWaterfalls(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Водопады на карте");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/vodopadi-100");
        inlineKeyboardButton2.setText("20 лучших водопадов Крыма");
        inlineKeyboardButton2.setUrl("https://must-see.top/vodopady-kryma/");
        inlineKeyboardButton3.setText("Подробнее");
        inlineKeyboardButton3.setUrl("https://waterfal.ru/vodopady-kryma/");
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
        return new SendMessage().setChatId(chat_ad).setText("Вот что могу вам посоветовать:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageBay(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Бухты крыма");
        inlineKeyboardButton.setUrl("https://www.krym4you.com/dostoprimechatelnosti/buhty-kryma/");
        List<InlineKeyboardButton> keyboardButton = new ArrayList<>();
        keyboardButton.add(inlineKeyboardButton);
        inlineKeyboardMarkup.setKeyboard(Collections.singletonList(keyboardButton));
        return new SendMessage().setChatId(chat_ad).setText("Более подробно:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageReserve(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Крымский природный заповедник");
        inlineKeyboardButton.setUrl("https://prostorikrima.ru/o/kryimskiy-prirodnyiy-zapovednik-286");
        List<InlineKeyboardButton> keyboardButton = new ArrayList<>();
        keyboardButton.add(inlineKeyboardButton);
        inlineKeyboardMarkup.setKeyboard(Collections.singletonList(keyboardButton));
        return new SendMessage().setChatId(chat_ad).setText("Более подробно:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageSource(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Главные источники и родники");
        inlineKeyboardButton.setUrl("https://prostorikrima.ru/c/rodniki-106");
        List<InlineKeyboardButton> keyboardButton = new ArrayList<>();
        keyboardButton.add(inlineKeyboardButton);
        inlineKeyboardMarkup.setKeyboard(Collections.singletonList(keyboardButton));
        return new SendMessage().setChatId(chat_ad).setText("Более подробно:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessagePlanetarium(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Официальный сайт");
        inlineKeyboardButton.setUrl("http://www.craocrimea.ru/ru/");
        List<InlineKeyboardButton> keyboardButton = new ArrayList<>();
        keyboardButton.add(inlineKeyboardButton);
        inlineKeyboardMarkup.setKeyboard(Collections.singletonList(keyboardButton));
        return new SendMessage().setChatId(chat_ad).setText("Более подробно:").setReplyMarkup(inlineKeyboardMarkup);
    }
}

