package Coordinate;

import org.fxmisc.easybind.EasyBind;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;


@Description(name = "Point2D", dataTypes = Point2D.class)
@ParametrizedController("Point2DWidget.fxml")
public class Point2DWidget extends SimpleAnnotatedWidget<Point2D> {
	@FXML
	private Pane root;
	@FXML
	private Label xLabel;
	@FXML
	private Label yLabel;
	
	@FXML
	private void initialize() {
		xLabel.textProperty().bind(
				EasyBind.monadic(dataOrDefault)
				.map(Point2D::getX)
				.map(Number::toString)
				.orElse("0.0"));
	}
	@Override
	public Pane getView() {
		return root;
	}
}
