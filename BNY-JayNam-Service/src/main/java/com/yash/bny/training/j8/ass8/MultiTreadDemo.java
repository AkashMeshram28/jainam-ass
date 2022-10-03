/**
 * 
 */
package com.yash.bny.training.j8.ass8;

/**
 * @author akash.meshram
 *
 */

public class MultiTreadDemo {
	public static void main(String[] args) {

		Runnable thread1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value Of I Is " + i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(thread1);
		t.setName("Nothing can stop us....!");
		t.start();

		Runnable thread2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * 2);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t2 = new Thread(thread2);
		t2.setName("yes, i can do it....!");
		t2.start();
	}
}
