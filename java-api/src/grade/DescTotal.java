package grade;

import java.util.Comparator;

public class DescTotal implements Comparator<Grade>{

	@Override
	public int compare(Grade front, Grade back) {
		return (front.getTotal() > back.getTotal()) ? -1 : (front.getTotal() < back.getTotal()? 1 : 0);
	}
}
