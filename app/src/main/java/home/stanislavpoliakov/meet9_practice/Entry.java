package home.stanislavpoliakov.meet9_practice;

/**
 * Класс записи, в котором:
 * timeStamp - дата и вермя создания записи
 * title - название записи
 * text - текст записи
 */
public class Entry {
    private String timeStamp, title, text;
    private boolean isLarge;
    private static final String TAG = "meet9_logs";

    public Entry(String title, String text) {
        this.title = title;
        this.text = text;

        //TODO Релизовать сохранение записи в отдельный файл, если запись слишком большая
        //TODO Очевидно, что в база должна хранить ссылку на файл или NULL, если запись сохранена в базе
        isLarge = false;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;

    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public String getTitle() {
        return this.title;
    }

    public String getText() {
        return this.text;
    }

    public boolean isLarge() {
        return this.isLarge;
    }
}
