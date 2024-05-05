package solid.Open_Close;

import java.util.List;

public class AreaManager {
    private   double area = 0;
    public double calculateArea(List<Shape> shapes){
        for(Shape shape : shapes){
            area += shape.get_area();
        }
        return area;
    }
}
