package detail.Controller;

import java.net.URL;

import java.util.ResourceBundle;

import developers.yong.seatResv.SeatResvMain;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import mainMovie.MediaServiceImpl;

public class DetailController06 implements Initializable {
	Parent root;
	
	MediaServiceImpl ms = new MediaServiceImpl();

	public void setRoot(Parent root) {
		this.root = root;
		ms.setMedia(root,"/media/video5.mp4");
	}

	public void gotoSeatPage() {
		System.out.println("좌석선택페이지");
		SeatResvMain sm = new SeatResvMain();
		sm.start();
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
