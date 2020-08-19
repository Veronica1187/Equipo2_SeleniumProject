package YoutubeTestCases.YoutubeVideoDetailsPageTestCase;

import YoutubeTestCases.BaseTestCase;
import org.testng.annotations.Test;
import youtube.usersteps.YoutubeVideoPageUserSteps;

public class YouTubeVideoDetailsTestCases extends BaseTestCase {
    @Test (description = "Validate play button when clicks on it", groups = {"regression"}, alwaysRun = true)
    public void testPlayVideo() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.playVideo();
    }

    @Test
    public void testPauseVideo() {
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.pauseVideo();
    }

    @Test
    public void testMuteVideo() {
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.muteVideo();
    }

    @Test
    public void testUnmuteVideo() {
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.unMuteVideo();

    }

    @Test
    public void selectFullscreen(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectFullScreenButton();
    }

    @Test
    public void testLikeVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.likeVideo();
    }

    @Test
    public void testUnlikeVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.unlikeVideo();
    }

    @Test
    public void testShareVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.shareVideo();
    }

    @Test
    public void testReplayVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.replayVideo();
    }

    @Test
    public void testSelectNextVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectNextVideo();
    }

    @Test
    public void testSelectVideoThumbnail(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnail();
    }

    @Test
    public void testSelectMiniPlayer(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectMiniPLayerButton();
    }

    @Test
    public void testSelectTheater(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectTheaterButton();
    }

    @Test
    public void testAddingPublicComment(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.addPublicComment();
    }
}