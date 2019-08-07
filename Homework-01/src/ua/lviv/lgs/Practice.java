package ua.lviv.lgs;

public class Practice {

	public static void main(String[] args) {

		Byte a = 1;
		Short b = 2;
		Integer c = 3;
		Long d = 4L;
		Double e = 5.5;
		Float f = 6.6F;
		boolean g = true;
		char h = 'h';

		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Short = " + Short.MAX_VALUE);
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Integer = " + Integer.MAX_VALUE);
		System.out.println("Integer = " + Integer.MIN_VALUE);
		System.out.println("Long = " + Long.MAX_VALUE);
		System.out.println("Long = " + Long.MIN_VALUE);
		System.out.println("Double = " + Double.MAX_VALUE);
		System.out.println("Double = " + Double.MIN_VALUE);
		System.out.println("Float = " + Float.MAX_VALUE);
		System.out.println("Float = " + Float.MIN_VALUE);
		System.out.println("boolean = " + g);
		System.out.println("char = " + h);

		int[] array = { 323, 435, 71, 9229, 2, 754, 11, 3456, 23, 219 };

		int max = array[0], min = array[0];

		for (int i = 0; i < array.length; i++) {

			if (max < array[i])
				max = array[i];

			if (min > array[i])
				min = array[i];

		}

		System.out.println("Max: " + max);
		System.out.println("Min:" + min);

	}
}
