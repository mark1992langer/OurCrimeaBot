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

public class Places {
    private Document document;

    public String getPlacesObject(String msg) {
        return connect(msg);
    }

    private String connect(String msg) {

        switch (msg) {
            case "Городища" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/gorodischa-137").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Дворцы" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/dvorcy-109").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Крепости" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/krepost-90").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Парки" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/parki-92").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Пещерные города" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/peschernye-goroda-89").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Подводные объекты" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/podvodnye-obekty-88").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Монастыри" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/monastyri-142").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                getTitle(document);
            }
            case "Разное" -> {
                try {
                    document = Jsoup.connect("https://prostorikrima.ru/c/raznoe-135").get();
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

    public SendMessage sendMessageAncient(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Карта городов");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/gorodischa-137");
        inlineKeyboardButton2.setText("Пещерные города Крыма");
        inlineKeyboardButton2.setUrl("https://www.krym4you.com/dostoprimechatelnosti/dostoprimechatelnosti-" +
                "krim/peschernye-goroda-kryma/");
        inlineKeyboardButton3.setText("Древние города Крыма");
        inlineKeyboardButton3.setUrl("http://ai-petri.com/crimean-history/old-crimea/");
        inlineKeyboardButton4.setText("Старинные города");
        inlineKeyboardButton4.setUrl("https://travelask.ru/articles/starinnye-goroda-kryma");
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
    public  SendMessage sendMessagePalace(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Карта известных дворцов");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/dvorcy-109");
        inlineKeyboardButton2.setText("Дворцы и усадьбы");
        inlineKeyboardButton2.setUrl("https://www.krym4you.com/dostoprimechatelnosti/dvorcy/");
        inlineKeyboardButton3.setText("Дворцы Крыма");
        inlineKeyboardButton3.setUrl("https://gidcrima.ru/dvorcy-kryma/");
        inlineKeyboardButton4.setText("10 самых красивых дворцов");
        inlineKeyboardButton4.setUrl("https://mishka.travel/blog/index/node/id/3855-10-samih-krasivih-dvorcov-v-krimu/");
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
        return new SendMessage().setChatId(chat_ad).setText("И конечно:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageFortresse(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Крепости на карте");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/krepost-90");
        inlineKeyboardButton2.setText("Крепости");
        inlineKeyboardButton2.setUrl("https://www.krym4you.com/dostoprimechatelnosti/kreposti/");
        inlineKeyboardButton3.setText("Крепости разных культур");
        inlineKeyboardButton3.setUrl("https://toptopkrym.ru/kreposti/kryma-3/");
        inlineKeyboardButton4.setText("Статьи");
        inlineKeyboardButton4.setUrl("https://www.gintur.com/sight/kreposti");
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
        return new SendMessage().setChatId(chat_ad).setText("и как же без:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessagePark(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Карта парков крыма");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/parki-92");
        inlineKeyboardButton2.setText("Парки Крыма");
        inlineKeyboardButton2.setUrl("https://www.krym4you.com/rejtingi/otdyh/parki-kryma/");
        inlineKeyboardButton3.setText("Парки Южного берега Крыма");
        inlineKeyboardButton3.setUrl("http://sevlove.ru/dostoprimechatelnosti/11-samyih-krasivyih-parkov-" +
                "yuzhnogo-berega-kryima.html");
        inlineKeyboardButton4.setText("Никитский ботанический сад");
        inlineKeyboardButton4.setUrl("http://nikitasad.ru");
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
    public  SendMessage sendMessageCave(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Пещерные города на карте");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/peschernye-goroda-89");
        inlineKeyboardButton2.setText("Пещерные города Крыма");
        inlineKeyboardButton2.setUrl("https://www.krym4you.com/dostoprimechatelnosti/dostoprimechatelnosti" +
                "-krim/peschernye-goroda-kryma/");
        inlineKeyboardButton3.setText("8 пещерных городов");
        inlineKeyboardButton3.setUrl("https://localway.ru/yalta/guide/657");
        inlineKeyboardButton4.setText("Полный список");
        inlineKeyboardButton4.setUrl("http://krymea.ru/architecture/pechernie-goroda-krima.html");
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
        return new SendMessage().setChatId(chat_ad).setText("Подробнее :").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageUnderwater(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Некоторые объекты");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/podvodnye-obekty-88");
        inlineKeyboardButton2.setText("Подводные достопримечательности");
        inlineKeyboardButton2.setUrl("https://yandex.ru/turbo/mygeografi.ru/s/podvodnye-dostoprimechatelnosti-v-krymu");
        inlineKeyboardButton3.setText("Подводные объекты Крыма на карте");
        inlineKeyboardButton3.setUrl("https://mysuntime.ru/sight.php?cat=404");
        inlineKeyboardButton4.setText("Чем интересен подводный мир Крыма");
        inlineKeyboardButton4.setUrl("https://gotonature.ru/1626-dayving-v-krymu.html");
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
        return new SendMessage().setChatId(chat_ad).setText("Интересные татьи:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageMonasteries(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("11 монастерей крыма");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/monastyri-142");
        inlineKeyboardButton2.setText("Паломничество в монастыри");
        inlineKeyboardButton2.setUrl("https://azbyka.ru/palomnik/Крым_%28монастыри%29");
        inlineKeyboardButton3.setText("Святые места");
        inlineKeyboardButton3.setUrl("https://puteshestvie.net/sights/546-monastyri-kryma.html");
        inlineKeyboardButton4.setText("Самые древние святыни Крыма");
        inlineKeyboardButton4.setUrl("https://travelcrimea.com/svyatiny/20210101/664146.html");
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
        return new SendMessage().setChatId(chat_ad).setText("С Богом:").setReplyMarkup(inlineKeyboardMarkup);
    }
    public  SendMessage sendMessageVarious(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Официальный сайт");
        inlineKeyboardButton.setUrl("https://prostorikrima.ru/c/raznoe-135");
        List<InlineKeyboardButton> keyboardButton = new ArrayList<>();
        keyboardButton.add(inlineKeyboardButton);
        inlineKeyboardMarkup.setKeyboard(Collections.singletonList(keyboardButton));
        return new SendMessage().setChatId(chat_ad).setText("Более подробно:").setReplyMarkup(inlineKeyboardMarkup);
    }
}
