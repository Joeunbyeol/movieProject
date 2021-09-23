package mainMovie;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;


public class DetailController implements Initializable {
	Parent root;
	ImageView img = new ImageView();
	MediaServiceImpl ms = new MediaServiceImpl();

	public void setRoot(Parent root) {
		this.root = root;
		ms.setMedia(root,"/media/movie_video1.mp4");
	}
		
	public void gotoSeatPage() {
		System.out.println("좌석선택페이지");
	}
	public void gotoReviewPage() {
		System.out.println("선호도및리뷰페이지");
	}

	public void myPlay() { ms.myPlay(); }
	public void myStop() { ms.myStop(); }
	public void myPause() { ms.myPause(); }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new MediaServiceImpl();
	
		
	}
	
	
	}