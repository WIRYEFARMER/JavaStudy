package kr.ac.kopo.day15.homeworks;

import java.util.Calendar;

public class CalendarUtil {
	private Calendar c;

	public CalendarUtil() {
		c = Calendar.getInstance();
	}

	public void showByYear(int year) {
		for (int month = 1; month <= 12; month++) {
			showByMonth(year, month);

		}
	}

	public void showByMonth(int year, int month) {
		System.out.println("***" + year + "년" + month + "월 ***");
		// year/month/1 날짜 정보 수정
		c.set(year, month - 1, 1);

		// 요일추출
		int week = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("WEEK : " + week);

	}

}
