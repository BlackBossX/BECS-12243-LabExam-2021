
public class Animation implements Artwork, Resizable {

    private double height;
    private double width;
    private double duraiton;
    public String name;
    private double baseInterationSize;
    private String format;
    private double fileSize;

    public Animation(String name, String format, double width, double height, double duration) {
        this.name = name;
        this.format = format;
        this.width = width;
        this.height = height;
        this.duraiton = duration;
    }

    @Override
    public double calculateFileSize() {
        switch (format) {
            case "mp4":
                return (3000 * width * height * duraiton) / (1000000 * 1000);
            case "webm":
                return (3500 * width * height * duraiton) / (1000000 * 1000);
            case "gif":
                return (1500 * width * height * duraiton) / (1000000 * 1000);
            default:
                return 0;
        }

    }

    @Override
    public double resize() {
        return calculateFileSize()*0.15;
    }

}
