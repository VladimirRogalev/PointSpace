package telran.point.dao;

import java.util.Comparator;

import telran.point.model.Point;

public class PointComparator implements Comparator<Point> {
	Point relPoint;
	

	public PointComparator(Point relPoint) {
		this.relPoint = relPoint;
	}

	public int compare(Point o1, Point o2) {


		double dx1 =o1.getX() - relPoint.getX();
		double dy1 = o1.getY() - relPoint.getY();
		double d1 = Math.sqrt(dx1*dx1+dy1*dy1);
		
		double dx2 =o2.getX() - relPoint.getX();
		double dy2 = o2.getY() - relPoint.getY();
		double d2 = Math.sqrt(dx2*dx2+dy2*dy2);
		

		return Double.compare(d1, d2);




	}

}
