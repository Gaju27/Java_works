package DesingPatterns.AbstractDesignPattern.Widget.Factories;

import DesingPatterns.AbstractDesignPattern.Widget.SocialMedia.ISocialMedia;
import DesingPatterns.AbstractDesignPattern.Widget.SocialMedia.Instagram;

public class InstagramFactory implements SociaMediaFactory{
    @Override
    public ISocialMedia callSocialMedia() {
        return new Instagram();
    }
}
