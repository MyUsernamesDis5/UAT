package PA_2026;

import java.awt.EventQueue;

public class uno {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Cprincipal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}