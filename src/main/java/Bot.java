import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {
    Nature nature = new Nature();
    Relaxation relaxation = new Relaxation();
    Places places = new Places();
    private long chat_ad;
    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {

            if (update.getMessage().hasText()) {
                update.getUpdateId();
                SendMessage sMessage = new SendMessage().setChatId(update.getMessage().getChatId());
                chat_ad = update.getMessage().getChatId();
                String text = update.getMessage().getText();
                sMessage.setReplyMarkup(replyKeyboardMarkup);
                try {
                    sMessage.setText(getMessage(text));
                    execute(sMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                if(update.getMessage().getText().equals("История крыма")){
                    try {
                        execute(sendMessageHistory(update.getMessage().getChatId()));
                    }catch (TelegramApiException e){
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Как добраться")){
                    try {
                        execute(sendMessageRoad(update.getMessage().getChatId()));
                    }catch (TelegramApiException e){
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Куда ехать")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\0.002674.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(sendMessageJourney(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Тропы")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\f218529c493534318ff1.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(nature.sendMessage(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Водопады")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\473664_main.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(nature.sendMessageWaterfalls(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Водоемы")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\scale_1200.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(nature.sendMessagePond(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Пещеры")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\Peshhera-Kr.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(nature.sendMessageСave(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Горы и скалы")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\708693_main.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(nature.sendMessageMountain(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Бухты")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\IMG_0010_2.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(nature.sendMessageBay(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Заповедники")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\Krymskiy-prirodniy.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(nature.sendMessageReserve(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Родники")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\1710279389.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(nature.sendMessageSource(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Планетарий")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\c742edcacd92111a3.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(nature.sendMessagePlanetarium(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Аквапарки")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\IMG_5604.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(relaxation.sendMessageAquapark(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Атракционы")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\Пляжный-отдых-в-.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(relaxation.sendMessageAttractions(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Зоопарки")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\scale_12).jpg "));
                    try {
                        execute(sendPhoto);
                        execute(relaxation.sendMessageZoo(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Дельфинарии")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\XXL.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(relaxation.sendMessageDolphinarium(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Музеи")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\i.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(relaxation.sendMessageMuseum(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Экскурсии")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\207b68025d.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(relaxation.sendMessageTrip(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Активный отдых")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\16_7.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(relaxation.sendMessageActivitie(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Городища")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\b707406s-1920.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(places.sendMessageAncient(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Дворцы")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\big_12843477302.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(places.sendMessagePalace(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Крепости")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\2473115.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(places.sendMessageFortresse(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Парки")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\big-57f174-1c8sliv.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(places.sendMessagePark(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Пещерные города")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\902.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(places.sendMessageCave(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Подводные объекты")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\Zatonuvshee-sudno2.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(places.sendMessageUnderwater(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Монастыри")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\scale).jpg "));
                    try {
                        execute(sendPhoto);
                        execute(places.sendMessageMonasteries(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(update.getMessage().getText().equals("Разное")){
                    SendPhoto sendPhoto = new SendPhoto();
                    sendPhoto.setChatId(chat_ad);
                    sendPhoto.setPhoto(new File("D:\\фото\\43381220401_63c33bd178_b.jpg "));
                    try {
                        execute(sendPhoto);
                        execute(places.sendMessageVarious(update.getMessage().getChatId()));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public String getBotUsername() {
        return "@OurCrimeaBot";
    }

    public String getBotToken() {
        return "1698243545:AAGrcF7G8mfw1Hb-zdlxcd-bzPtVudtReGY";
    }

    public static SendMessage sendMessageHistory(long chat_ad){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Старинные карты Крыма");
        inlineKeyboardButton1.setUrl("https://krymoteka.com/starinnye-karty-kryma.html");
        inlineKeyboardButton2.setText("Статьи и книги");
        inlineKeyboardButton2.setUrl("http://www.krimoved-library.ru/books/");
        inlineKeyboardButton3.setText("Крым в истории России");
        inlineKeyboardButton3.setUrl("http://krym.rusarchives.ru");
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
        return new SendMessage().setChatId(chat_ad).setText("Если вы интересуетесь историей, крыма" +
                " возможно вас заинтересует следующее:").setReplyMarkup(inlineKeyboardMarkup);
    }

    public static SendMessage sendMessageRoad(long chat_ad){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("tutu.ru");
        inlineKeyboardButton1.setUrl("https://www.tutu.ru");
        inlineKeyboardButton2.setText("aviasales.ru");
        inlineKeyboardButton2.setUrl("https://www.aviasales.ru");
        inlineKeyboardButton3.setText("skyscanner.ru");
        inlineKeyboardButton3.setUrl("https://www.skyscanner.ru");
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
        return new SendMessage().setChatId(chat_ad).setText("Вот сайты, которые могут вам в этом помочь:").setReplyMarkup(inlineKeyboardMarkup);
    }

    public  SendMessage sendMessageJourney(long chat_ad) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Районы Крыма. Кто чем богат.");
        inlineKeyboardButton1.setUrl("https://prostorikrima.ru/c/rajony-3");
        inlineKeyboardButton2.setText("Города Крыма для отдыха");
        inlineKeyboardButton2.setUrl("https://www.krym4you.com/rejtingi/goroda/");
        inlineKeyboardButton3.setText("booking.com");
        inlineKeyboardButton3.setUrl("https://www.booking.com/index.ru.html?aid=806408;" +
                "label=yandex-NB4C05Q5cHzgCBe3HYpwfw-3994848249");
        inlineKeyboardButton4.setText("Сайт сервиса бронирования отелей Крыма");
        inlineKeyboardButton4.setUrl("https://crimea-otel.ru/?yclid=969468801589219594");
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
        return new SendMessage().setChatId(chat_ad).setText("Вот что я могу вам предложить.").setReplyMarkup(inlineKeyboardMarkup);
    }

    public String getMessage(String msg) {
        if (msg.equals("/start")) {
            return infoStart();
        }
        if (msg.equals("Тропы") || msg.equals("Водоемы")|| msg.equals("Пещеры")
                || msg.equals("Горы и скалы")|| msg.equals("Водопады")
                || msg.equals("Бухты")|| msg.equals("Заповедники")|| msg.equals("Родники")
                || msg.equals("Планетарий")) {
            return nature.getNatureObject(msg);
        }
        if (msg.equals("Аквапарки") || msg.equals("Атракционы")|| msg.equals("Зоопарки")
                || msg.equals("Дельфинарии")|| msg.equals("Музеи")
                || msg.equals("Экскурсии")||msg.equals("Активный отдых")) {
            return relaxation.getRelaxationObject(msg);
        }
        if (msg.equals("Городища") || msg.equals("Дворцы")|| msg.equals("Крепости")
                || msg.equals("Парки")|| msg.equals("Пещерные города")
                || msg.equals("Подводные объекты")|| msg.equals("Монастыри")|| msg.equals("Разное")) {
            return places.getPlacesObject(msg);
        }
        if(msg.equals("История крыма")){
            SendPhoto sendPhoto = new SendPhoto();
            sendPhoto.setChatId(chat_ad);
            sendPhoto.setPhoto(new File("D:\\фото\\0_187a3c_77be84ae_XXL (1).jpg"));
            try {
                execute(sendPhoto);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            return "Хороший выбор.";
        }

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        KeyboardRow keyboardTreeRow = new KeyboardRow();


        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        if (msg.equals("Привет") || msg.equals("Меню")) {
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Как добраться");
            keyboardFirstRow.add("История крыма");
            keyboardFirstRow.add("Отдых");
            keyboardSecondRow.add("Природа");
            keyboardSecondRow.add("Куда ехать");
            keyboardSecondRow.add("Знаковые места");
            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Что же. Вот мои основные разделы.";
        }
        if (msg.equals("Как добраться")) {
            SendPhoto sendPhoto = new SendPhoto();
            sendPhoto.setChatId(chat_ad);
            sendPhoto.setPhoto(new File("D:\\фото\\img-20181111084138-391.jpg"));
            try {
                execute(sendPhoto);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            return "Все способы путешествия по своему интересны и увлекательны в этот " +
                    "замечательный край, но я рекамендую Самолет, как самый быстрый способ.";
        }
        if (msg.equals("Куда ехать")) {
            return "Выбор огромный, но я помогу вам его сделать. ";
        }
        if (msg.equals("Отдых")) {
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Аквапарки");
            keyboardFirstRow.add("Атракционы");
            keyboardFirstRow.add("Зоопарки");
            keyboardSecondRow.add("Дельфинарии");
            keyboardSecondRow.add("Музеи");
            keyboardTreeRow.add("Экскурсии");
            keyboardTreeRow.add("Активный отдых");
            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);
            keyboard.add(keyboardTreeRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Выбор за вами ;)";
        }
        if (msg.equals("Знаковые места")) {
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Городища");
            keyboardFirstRow.add("Дворцы");
            keyboardFirstRow.add("Крепости");
            keyboardSecondRow.add("Парки");
            keyboardSecondRow.add("Пещерные города");
            keyboardSecondRow.add("Подводные объекты");
            keyboardTreeRow.add("Монастыри");
            keyboardTreeRow.add("Разное");
            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);
            keyboard.add(keyboardTreeRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Понимаю. Вот, что я могу предложить.";
        }
        if (msg.equals("Природа")) {
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("Водопады");
            keyboardFirstRow.add("Пещеры");
            keyboardFirstRow.add("Горы и скалы");
            keyboardSecondRow.add("Тропы");
            keyboardSecondRow.add("Водоемы");
            keyboardSecondRow.add("Бухты");
            keyboardTreeRow.add("Заповедники");
            keyboardTreeRow.add("Родники");
            keyboardTreeRow.add("Планетарий");
            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);
            keyboard.add(keyboardTreeRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Хороший выбор.";
        }
        return "Чем ещё я могу помочь?.";
    }

    public String infoStart() {
        String s = "Добрый день. Данный бот посвещен тематике полуостова Крым." +
                " Сдесь вы сможете найти много полезной информации про этот замечательный полуостров," +
                " а так же ссылки на различные сайты по данной тематике." +
                "\n Пожалуста, напешите < Меню >, чтобы продолжить.";
        return s;
    }
}
