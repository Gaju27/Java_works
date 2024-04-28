package DesingPatterns.AbstractDesignPattern.Widget;

import DesingPatterns.AbstractDesignPattern.Widget.AppConfigure.Application;
import DesingPatterns.AbstractDesignPattern.Widget.Factories.FacebookFactory;
import DesingPatterns.AbstractDesignPattern.Widget.Factories.InstagramFactory;
import DesingPatterns.AbstractDesignPattern.Widget.Factories.SociaMediaFactory;
import DesingPatterns.AbstractDesignPattern.Widget.Factories.TwitterFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the media configurations\n" +
                "1. Twitter\n" +
                "2. Facebook\n" +
                "3. Instagram");
        int selection = input.nextInt();
        Application app = widgetCallConfiguration(selection);
        app.configureSocialMedia();

    }

    private static Application widgetCallConfiguration(int selection){
        SociaMediaFactory factory = null;

        switch (selection){
            case 1: factory = new TwitterFactory();
            break;
            case 2: factory = new FacebookFactory();
            break;
            case 3: factory = new InstagramFactory();
        }
        assert factory != null;
        return new Application(factory);
    }
}
