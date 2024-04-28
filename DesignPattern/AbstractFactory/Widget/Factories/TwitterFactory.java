package DesingPatterns.AbstractDesignPattern.Widget.Factories;

import DesingPatterns.AbstractDesignPattern.Widget.SocialMedia.ISocialMedia;
import DesingPatterns.AbstractDesignPattern.Widget.SocialMedia.Twitter;

public class TwitterFactory implements SociaMediaFactory{
    @Override
    public ISocialMedia callSocialMedia() {
        return new Twitter();
    }
}
