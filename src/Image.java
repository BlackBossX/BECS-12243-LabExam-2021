
public class Image implements Artwork, Resizable {

    private double height;
    private double width;
    public String name;
    private String format;
    private double fileSize;

    public Image(String name, String format, double width, double height) {
        this.name = name;
        this.format = format;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateFileSize() {
        switch (format) {
            case "jpg":
                return ((2000 * width * height) / (1000000 * 1000));
            case "png":
                return ((2500 * width * height) / (1000000 * 1000));
            case "gif":
                return ((1500 * width * height) / (1000000 * 1000));
            default:
                return 0;
        }
    }

    @Override
    public double resize() {
        return calculateFileSize() * 0.15;
    }
}
