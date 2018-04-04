package Coordinate;
import java.util.List;
import java.util.Map;

import javafx.collections.*;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.plugin.Requires;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

//@Requires(group = "com.acme", name = "Custom Plugin", minVersion = "1.2.3")
@Requires(group = "edu.wpi.first.shuffleboard", name = "Base", minVersion = "1.0.0")
@Description(group = "com.Coordinate", name = "Coordinate Plugin", version = "0.0.0", summary = "Displays robot Position")
public class MyPlugin extends Plugin {
	public MyPlugin() {
		
	}
	
	@Override
	public List<DataType> getDataTypes(){
		return ImmutableList.of(Point2DType.Instance);
	}
	
	@Override
	public List<ComponentType> getComponents(){
		return ImmutableList.of(WidgetType.forAnnotatedWidget(Point2DWidget.class));
	}
	
	@Override
	public Map<DataType, ComponentType> getDefaultComponents(){
		return ImmutableMap.<DataType, ComponentType>builder()
				.put(Point2DType.Instance, WidgetType.forAnnotatedWidget(Point2DWidget.class))
				.build();
	}
	
	
	
}
