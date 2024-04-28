package DesingPatterns.AbstractDesignPattern.Widget.Factories;

import DesingPatterns.AbstractDesignPattern.Widget.SocialMedia.Facebook;
import DesingPatterns.AbstractDesignPattern.Widget.SocialMedia.ISocialMedia;

public class FacebookFactory implements SociaMediaFactory{
    @Override
    public ISocialMedia callSocialMedia() {
        return new Facebook();
    }
}
