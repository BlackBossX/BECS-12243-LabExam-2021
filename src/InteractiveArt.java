
public class InteractiveArt implements Artwork {

    private final double baseinteractionSize = 80000;
    public String name;
    private double interactionCount;
    private double fileSize;

    public InteractiveArt(String name, double interactionCount) {
        this.name = name;
        this.interactionCount = interactionCount;
    }

    @Override
    public double calculateFileSize() {
        return (baseinteractionSize * interactionCount) / 1000000;
    }

}
