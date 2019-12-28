
public class Modulo {

		String modul()
		{
			byte a = 3;
			short b = 7;
			int c = 10;
			float e = 15.9f;
			char g = 'A';
		    float   h = (a*b+e)/c+g;
			return "by performing all Arithmatic operations we get"+h;
		}

		public static void main(String[] args) {
			
			Modulo m = new Modulo();
		    
			System.out.println(m.modul());
			
		}
		}


