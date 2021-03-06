package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Dates {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));


		Date y1 = sdf1.parse("12/11/2012");
		Date y2 = sdf2.parse("12/11/2012 12:12:11");
		Date y3 = Date.from(Instant.parse("2018-11-12T15:12:12Z"));

		Date x1 = new Date();

		Date x2 = new Date(System.currentTimeMillis());

		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(y3));
		System.out.println(x1);
		System.out.println(sdf2.format(x1));
		System.out.println(x2);
		System.out.println(sdf2.format(x2));
		System.out.println("===================");
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
		System.out.println(sdf3.format(y3));
		System.out.println(x1);
		System.out.println(sdf3.format(x1));
		System.out.println(x2);
		System.out.println(sdf3.format(x2));
		System.out.println();

	}

}
