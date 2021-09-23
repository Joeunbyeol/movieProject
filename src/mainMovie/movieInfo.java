package mainMovie;

import javafx.scene.Parent;
import javafx.scene.control.Label;

public class movieInfo {
	Parent root;
	Label movieTitle, movieDate, movieInfomation, movieNation, movieDirector, movieActor, movieFilmrate;

	public void movie() {

		movieTitle = (Label) root.lookup("#movieTitle");
		movieDate = (Label) root.lookup("#movieDate");
		movieInfomation = (Label) root.lookup("#movieInfomation");
		movieNation = (Label) root.lookup("#movieNation");
		movieDirector = (Label) root.lookup("#movieDirector");
		movieActor = (Label) root.lookup("#movieActor");
		movieFilmrate = (Label) root.lookup("#movieFilmrate");

	}
}
