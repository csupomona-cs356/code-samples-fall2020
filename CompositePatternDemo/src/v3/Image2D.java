package v3;

public class Image2D implements Widget {

	private String imageUrl;
	
	public void render() {
		System.out.println("Download the image and render it.");
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
