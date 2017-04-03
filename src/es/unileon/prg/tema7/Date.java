package es.unileon.prg.tema7;
public class Date
{
	

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	public int getYear(){
		return this.year;}
	public int getMonth(){
		return this.month;}
	public int getDay(){
		return this.day;}

	public boolean isSameYear(Date fecha2)
	{
		if(getYear() == fecha2.getYear()){
			return true;
		}
		else
			return false;
	}
	
	public boolean isSameMonth(Date fecha2){
		if(getMonth() == fecha2.getMonth()){
			return true;
		}
		else
			return false;
	}
	
	public boolean isSameDay(Date fecha2){
		if(getDay() == fecha2.getDay()){
			return true;
		}
		else
			return false;
	}
	
	public boolean isSame(Date fecha2){
		if((getDay() == fecha2.getDay()) && (getMonth() == fecha2.getMonth()) && (getYear() == fecha2.getYear())){
			return true;
		}
		else
			return false;
	}
			

	public boolean SameYear(Date fecha2){
		return (getYear()==fecha2.getYear());
	}
	public boolean SameMonth(Date fecha2){
		return (getMonth()==fecha2.getMonth());
	}
	public boolean SameDay(Date fecha2){
		return (getDay()==fecha2.getDay());
	}
	public boolean Same(Date fecha2){
		return((getYear()==fecha2.getYear())&&(getMonth()==fecha2.getMonth())&&(getDay()==fecha2.getDay()));
	}

	public void nameMonth(){
	

		if(getMonth() == 01){
		System.out.println("Enero");
							}
		else if(getMonth() == 02){
		System.out.println("Febrero");
							}
		else if(getMonth() == 03){
		System.out.println("Marzo");
							}
		else if(getMonth() == 04){
		System.out.println("Abril");
							}
		else if(getMonth() == 05){
		System.out.println("Mayo");
							}
		else if(getMonth() == 06){
		System.out.println("Junio");
							}
		else if(getMonth() == 07){
		System.out.println("Julio");
							}
		else if(getMonth() == 8){
		System.out.println("Agosto");
							}
		else if(getMonth() == 9){
		System.out.println("Septiembre");
							}
		else if(getMonth() == 10){
		System.out.println("Octubre");
							}
		else if(getMonth() == 11){
		System.out.println("Noviembre");
							}
		else{
		System.out.println("Diciembre");
		}
	}

	public void checkDay(){
		if((getMonth() == 01)&&(getDay()>31)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 02)&&(getDay()>28)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 03)&&(getDay()>31)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 04)&&(getDay()>30)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 05)&&(getDay()>31)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 06)&&(getDay()>30)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 07)&&(getDay()>31)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 8)&&(getDay()>31)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 9)&&(getDay()>30)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 10)&&(getDay()>31)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 11)&&(getDay()>30)){
			System.out.println("Día incorrecto");
		}
		else if((getMonth() == 12)&&(getDay()>31)){
			System.out.println("Día incorrecto");
		}
	}

	public void seasonMonth(){
		if((getMonth() == 03)&&(getDay()>= 21)){
			System.out.println("Primavera");}
		else if(getMonth() == 04){
			System.out.println("Primavera");}
		else if(getMonth() == 05){
			System.out.println("Primavera");}
		else if((getMonth() == 06)&&(getDay()<=21)){
			System.out.println("Primavera");}
		else if((getMonth() == 06)&&(getDay()>=22)){
			System.out.println("Verano");}
		else if(getMonth() == 07){
			System.out.println("Verano");}
		else if(getMonth() == 8){
			System.out.println("Verano");}
		else if((getMonth() == 9)&&(getDay()<=23)){
			System.out.println("Verano");}
		else if((getMonth() == 9)&&(getDay()>=24)){
			System.out.println("Otoño");}
		else if(getMonth() == 10){
			System.out.println("Otoño");}
		else if(getMonth() == 11){
			System.out.println("Otoño");}
		else if((getMonth() == 12)&&(getDay()<=21)){
			System.out.println("Otoño");}
		else if((getMonth() == 12)&&(getDay()>=22)){
			System.out.println("Invierno");}
		else if(getMonth() == 01){
			System.out.println("Invierno");}
		else if(getMonth() == 02){
			System.out.println("Invierno");}
		else if((getMonth() == 03)&&(getDay()<=20)){
			System.out.println("Invierno");}
	}

	public void untilEnd(){
		if(getMonth() == 01){
			System.out.println("11 meses hasta el final del año");}
		else if(getMonth() == 02){
			System.out.println("10 meses hasta el final del año");}
		else if(getMonth() == 03){
			System.out.println("9 meses hasta el final del año");}
		else if(getMonth() == 04){
			System.out.println("8 meses hasta el final del año");}
		else if(getMonth() == 05){
			System.out.println("7 meses hasta el final del año");}
		else if(getMonth() == 06){
			System.out.println("6 meses hasta el final del año");}
		else if(getMonth() == 07){
			System.out.println("5 meses hasta el final del año");}
		else if(getMonth() == 8){
			System.out.println("4 meses hasta el final del año");}
		else if(getMonth() == 9){
			System.out.println("3 meses hasta el final del año");}
		else if(getMonth() == 10){
			System.out.println("2 meses hasta el final del año");}
		else if(getMonth() == 11){
			System.out.println("1 meses hasta el final del año");}
		else if(getMonth() == 12){
			System.out.println("Último del mes del año");}
	}

	public void datesMonth(){
		int j;
		if((getMonth() == 01)||(getMonth() == 03)||(getMonth() == 05)||(getMonth() == 07)||(getMonth() == 8)||(getMonth() == 10)||(getMonth() == 12)){
		for(j=getDay(); j<=31; j +=1){
			System.out.println("Día "+j );}
		}
		if(getMonth() == 02){
		for(j=getDay(); j<=28; j +=1){
			System.out.println("Día "+j );}
		}
		if((getMonth() == 04)||(getMonth() == 06)||(getMonth() == 9)||(getMonth() == 11)){
		for(j=getDay(); j<=30; j +=1){
			System.out.println("Día "+j );}
		}
	}	

	public void sameDays(){
		if((getMonth() == 01)||(getMonth() == 03)||(getMonth() == 05)||(getMonth() == 07)||(getMonth() == 8)||(getMonth() == 10)||(getMonth() == 12)){
			System.out.println("Los meses de Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre tienen 31 días");}
		if(getMonth() == 02){
			System.out.println("Febrero es el único mes con 28 días");}
		if((getMonth() == 04)||(getMonth() == 06)||(getMonth() == 9)||(getMonth() == 11)){
			System.out.println("Los meses de Abril, Junio, Septiembre y Noviembre tienen 30 días");}
	}

	public void daysSinceFirst(){
			
		if (getMonth() == 01){
				System.out.println("Los días desde el comienzo del año son " +getDay());
			}
		if (getMonth() == 02){
				System.out.println("Los días desde el comienzo del año son 31 + " +getDay());
			}
		if (getMonth() == 03){
				System.out.println("Los días desde el comienzo del año son 59 + " +getDay());
			}
		if (getMonth() == 04){
				System.out.println("Los días desde el comienzo del año son 90 + " +getDay());
			}
		if (getMonth() == 05){
				System.out.println("Los días desde el comienzo del año son 120 + " +getDay());
			}
		if (getMonth() == 06){
				System.out.println("Los días desde el comienzo del año son 151 + " +getDay());
			}
		if (getMonth() == 07){
				System.out.println("Los días desde el comienzo del año son 181 + " +getDay());
			}
		if (getMonth() == 8){
				System.out.println("Los días desde el comienzo del año son 212 + " +getDay());
			}
		if (getMonth() == 9){
				System.out.println("Los días desde el comienzo del año son 243 + " +getDay());
			}
		if (getMonth() == 10){
				System.out.println("Los días desde el comienzo del año son 273 + " +getDay());
			}
		if (getMonth() == 11){
				System.out.println("Los días desde el comienzo del año son 304 + " +getDay());
			}
		if (getMonth() == 12){
				System.out.println("Los días desde el comienzo del año son 334 + " +getDay());
			}
	}
	public void randDate(){
		int d=0;
		int m=0;

		while((d!=getDay())&&(m!=getMonth())&&(d<31)&&(m<12)){
			d+=Math.floor(Math.random()*31);
			m+=Math.floor(Math.random()*12);
		}
		System.out.println("Intentos aleatorios día(while)= "+d);
		System.out.println("Intentos aleatorios mes(while)= "+m);
	}

	public void randDateDo(){
		int e=0;
		int n=0;

		do{
			e+=Math.floor(Math.random()*31);
			n+=Math.floor(Math.random()*12);
		}while((e!=getDay())&&(n!=getMonth())&&(e<31)&&(n<12));
		System.out.println("Intentos aleatorios día(do-while)= "+e);
		System.out.println("Intentos aleatorios mes(do-while)= "+n);
	}

	
	public String toString (int day, int month, int year)
	{
		return +this.day+"/" +this.month+"/" +this.year;
	}
}
		
