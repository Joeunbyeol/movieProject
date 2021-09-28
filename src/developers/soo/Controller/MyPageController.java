package developers.soo.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import db.dbCommon;
import developers.soo.main.ModifyMy;
import developers.soo.service.Mypage;
import developers.soo.service.MypageImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class MyPageController implements Initializable {
	Mypage mp;
	dbCommon dbCommon;
	ModifyMy mm;
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
		mp.setRoot(root);
	}
	
	public void onClose() {
		mp.setClose();
	}
	
	public void onModify() {
		mp.setModify();
	}
	
	public void onView() {
		mp.setView();
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mp = new MypageImpl();
		dbCommon.setDBConnection();
	}

}
