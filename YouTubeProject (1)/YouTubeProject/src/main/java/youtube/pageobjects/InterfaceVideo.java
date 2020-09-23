package youtube.pageobjects;

public abstract class InterfaceVideo {
    public interface Video{
        public void clickOnThumbnail(int x);
        public void clickOnThumbnailDescription(int x);
        public void clickOnThumbnailChannelName();
        public void clickOnThumbnailViews();
        public void clickOnThumbnailReleaseDate();
    }
}
