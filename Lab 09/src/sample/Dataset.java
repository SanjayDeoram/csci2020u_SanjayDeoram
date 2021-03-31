package sample;

public class Dataset {

    private static String date;
    private static float open;
    private static float high;
    private static float low;
    private static float close;
    private static float adjClose;
    private static float volume;

    Dataset(String date, float open, float high, float low, float close, float adjClose, float volume) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.adjClose = adjClose;
        this.volume = volume;
    }

    public static String getDate() { return date; }
    public static float getOpen() { return open; }
    public static float getHigh() { return high; }
    public static float getLow() { return low; }
    public static float getClose() { return close; }
    public static float getAjdClose() { return adjClose; }
    public static float getVolume() { return volume; }

}
