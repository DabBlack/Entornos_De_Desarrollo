package subidaDeNotaExamen;

public class SubidaDeNota {

	public static int Intervalo(int x, int y, int num) {
		int c = 0;
		if (x > 0 && y > 0) {
			if (num >= x && num <= y) {
				c = 1;
			} else {
				c = -1;
			}
		} else {
			c = -1;
		}
		return c;
	}

}
