
public class ArtPortfolioClient {

    public static void main(String[] args) {
        Image sunsetImage = new Image("Sunset", "jpg", 1920, 1080);
        Animation cityAnimation = new Animation("City Life", "mp4", 1280, 720, 300);
        Artwork gameArt = new InteractiveArt("Escape Room", 15);

        System.out.println(sunsetImage.name + " file size: " + sunsetImage.calculateFileSize() + " MB");
        System.out.println(cityAnimation.name + " file size: " + cityAnimation.calculateFileSize() + " MB");
        System.out.println("Escape Room file size: " + gameArt.calculateFileSize() + " MB");

        System.out.println("-----------------");

        System.out.println(sunsetImage.name + " New file size: " + sunsetImage.resize() + " MB");
        System.out.println(cityAnimation.name + " New file size: " + cityAnimation.resize() + " MB");

    }
}
