package es.unileon.prg.tema7;
public class MainDate{
public static void main(String args[]){
	Date fecha=new Date(12,01,2017);
	Date fecha2=new Date(22,11,2017);
	System.out.println("isSameYear = " + fecha.isSameYear(fecha2));
	System.out.println("isSameMonth = " + fecha.isSameMonth(fecha2));
	System.out.println("isSameDay = " + fecha.isSameDay(fecha2));
	System.out.println("isSame = " + fecha.isSame(fecha2));

	System.out.println("SameYear = " + fecha.isSameYear(fecha2));
	System.out.println("SameMonth = " + fecha.isSameMonth(fecha2));
	System.out.println("SameDay = " + fecha.isSameDay(fecha2));
	System.out.println("Same = " + fecha.isSame(fecha2));

	fecha.nameMonth();
	fecha.checkDay();
	fecha.seasonMonth();

	fecha.untilEnd();
	fecha.datesMonth();
	fecha.sameDays();
	fecha.daysSinceFirst();

	fecha.randDate();
	fecha.randDateDo();

	System.out.println(fecha.toString());
	}
}
