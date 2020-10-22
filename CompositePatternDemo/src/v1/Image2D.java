package v1;

public class Image2D {

	private String imageUrl;
	
	public void renderImageWithUrl() {
		System.out.println("Download the image and render it.");
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
