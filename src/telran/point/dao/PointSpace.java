package telran.point.dao;


import java.util.Arrays;
import java.util.Comparator;

import telran.point.model.Point;

public class PointSpace {
	Point relPoint;
	Point [] points;
	Comparator<Point> comparator;
	public PointSpace(Point relPoint, Point[] points) {
		this.relPoint = relPoint;
		this.points = Arrays.copyOf(points, points.length);
		comparator = new PointComparator (relPoint); 
		Arrays.sort(this.points, comparator);
		
	}
	public Point[] getPoints() {
		return points;
	}
	
	public void addPoint (Point point) {
		// TODO keep this.points sorted
	}
	
	
	
	
}
