package DesingPatterns.AbstractDesignPattern.Widget.AppConfigure;

import DesingPatterns.AbstractDesignPattern.Document.App.App;
import DesingPatterns.AbstractDesignPattern.Widget.Factories.SociaMediaFactory;
import DesingPatterns.AbstractDesignPattern.Widget.SocialMedia.ISocialMedia;

public class Application {
    private ISocialMedia socialMedia;

    public Application(SociaMediaFactory factory){
        this.socialMedia = factory.callSocialMedia();
    }

    public void configureSocialMedia(){
        this.socialMedia.alpha();
        this.socialMedia.beta();
        this.socialMedia.gamma();

    }
}
