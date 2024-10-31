package baitap3;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int inputKey = -1;
		while (inputKey != 0) {
			System.out.println("|-----------------MENU---------------------|");
			System.out.println("| 1. Chương trình 1                        |");
			System.out.println("| 2. Chương trình 1.1                      |");
			System.out.println("| 3. Chương trình 1.2                      |");
			System.out.println("| 4. Chương trình 2                        |");
			System.out.println("| 5. Chương trình 3                        |");
			System.out.println("| 6. Chương trình 4                        |");
			System.out.println("| 7. Chương trình 5                        |");
			System.out.println("| 8. Chương trình 6                        |");
			System.out.println("| 9. Chương trình 7                        |");
			System.out.println("| 10. Chương trình 8                       |");
			System.out.println("| 0. Thoát                                 |");
			System.out.println("|------------------------------------------|");
			Scanner console = new Scanner(System.in);
			System.out.print("Vui lòng chọn một số : ");
			inputKey = console.nextInt();
			switch (inputKey) {
			case 0:
				System.out.println("Tạm biệt!");
				break;
			case 1:
				chuongTrinh1();
				break;
			case 2:
				chuongTrinh1_1();
				break;
			case 3:
				chuongTrinh1_2();
				break;
			case 4:
				chuongTrinh2();
				break;
			case 5:
				chuongTrinh3();
				break;
			case 6:
				chuongTrinh4();
				break;
			case 7:
				chuongTrinh5();
				break;
			case 8:
				chuongTrinh6();
				break;
			case 9:
				chuongTrinh7();
				break;
			case 10:
				chuongTrinh8();
				break;
			default:
				System.out.println("Hãy chọn lại!");
				break;
			}
		}
	}

	private static void chuongTrinh8() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số lượng phần tử của mảng (n): ");
		int n = scanner.nextInt();
		if (n <= 0) {
			System.out.println("Vui lòng nhập một số nguyên dương lớn hơn 0.");
		} else {
			int[] array = new int[n];
			System.out.println("Nhập vào " + n + " phần tử số nguyên:");
			for (int i = 0; i < n; i++) {
				System.out.print("Phần tử thứ " + (i + 1) + ": ");
				array[i] = scanner.nextInt();
			}
			System.out.print("Các phần tử là số chẵn trong mảng: ");
			boolean hasEven = false;
			for (int i = 0; i < n; i++) {
				if (array[i] % 2 == 0) {
					System.out.print(array[i] + " ");
					hasEven = true;
				}
			}
			if (!hasEven) {
				System.out.print("Không có phần tử chẵn nào.");
			}
			System.out.println();
		}
	}

	private static void chuongTrinh7() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số lượng phần tử của mảng (n): ");
		int n = scanner.nextInt();
		if (n <= 0) {
			System.out.println("Vui lòng nhập một số nguyên dương lớn hơn 0.");
		} else {
			int[] array = new int[n];
			System.out.print("Nhập 1 để nhập mảng bằng tay, 2 để tạo mảng tự động: ");
			int choice = scanner.nextInt();

			if (choice == 1) {
				System.out.println("Nhập vào " + n + " phần tử số nguyên:");
				for (int i = 0; i < n; i++) {
					System.out.print("Phần tử thứ " + (i + 1) + ": ");
					array[i] = scanner.nextInt();
				}
			} else if (choice == 2) {
				Random random = new Random();
				System.out.println("Mảng được tạo tự động là:");
				for (int i = 0; i < n; i++) {
					array[i] = random.nextInt(100);
					System.out.println("Phần tử thứ " + (i + 1) + ": " + array[i]);
				}
			} else {
				System.out.println("Lựa chọn không hợp lệ.");
				scanner.close();
				return;
			}
			System.out.print("Mảng vừa nhập: ");
			for (int i = 0; i < n; i++) {
				System.out.print(array[i] + "\s");
			}
			System.out.println();
		}

	}

	private static void chuongTrinh6() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào chiều rộng của hình vuông: ");
		double r = scanner.nextDouble();
		System.out.println("Diện tích hình vuông là: " + calculateArea(r));
		System.out.println("Chu vi hình vuông là: " + calculatePerimeter(r));

	}

	private static double calculatePerimeter(double r) {
		// TODO Auto-generated method stub
		return (double) (4 * r);
	}

	private static double calculateArea(double r) {
		// TODO Auto-generated method stub
		return (double) (r * r);
	}

	private static void chuongTrinh5() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số lượng phần tử của mảng (N): ");
		int N = scanner.nextInt();
		if (N <= 0) {
			System.out.println("Vui lòng nhập một số nguyên dương lớn hơn 0.");
		} else {
			int[] array = new int[N];
			System.out.println("Nhập vào " + N + " phần tử số nguyên:");
			for (int i = 0; i < N; i++) {
				System.out.print("Phần tử thứ " + (i + 1) + ": ");
				array[i] = scanner.nextInt();
			}
			int max = array[0];
			int min = array[0];

			for (int i = 1; i < N; i++) {
				if (array[i] > max) {
					max = array[i];
				}
				if (array[i] < min) {
					min = array[i];
				}
			}
			System.out.println("Số lớn nhất trong mảng là: " + max);
			System.out.println("Số nhỏ nhất trong mảng là: " + min);
		}

	}

	private static void chuongTrinh4() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số lượng phần tử của mảng (n): ");
		int n = scanner.nextInt();
		if (n <= 0) {
			System.out.println("Vui lòng nhập một số nguyên dương lớn hơn 0.");
		} else {
			int[] array = new int[n];
			int sum = 0;
			System.out.println("Nhập vào " + n + " phần tử số nguyên:");
			for (int i = 0; i < n; i++) {
				System.out.print("Phần tử thứ " + (i + 1) + ": ");
				array[i] = scanner.nextInt();
				sum += array[i];
			}
			double average = (double) sum / n;
			System.out.println("Giá trị trung bình của mảng là: " + average);
		}

	}

	private static void chuongTrinh3() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên dương n: ");
		int n = scanner.nextInt();
		if (n < 0) {
			System.out.println("Vui lòng nhập một số nguyên dương.");
		} else {
			int sum = 0;
			for (int i = 0; i <= n; i += 2) {
				sum += i;
			}
			System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + sum);
		}
	}

	private static void chuongTrinh2() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên từ 1 đến 10: ");
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			System.out.println("Một");
			break;
		case 2:
			System.out.println("Hai");
			break;
		case 3:
			System.out.println("Ba");
			break;
		case 4:
			System.out.println("Bốn");
			break;
		case 5:
			System.out.println("Năm");
			break;
		case 6:
			System.out.println("Sáu");
			break;
		case 7:
			System.out.println("Bảy");
			break;
		case 8:
			System.out.println("Tám");
			break;
		case 9:
			System.out.println("Chín");
			break;
		case 10:
			System.out.println("Mười");
			break;
		default:
			System.out.println("Số không hợp lệ. Vui lòng nhập số từ 1 đến 10.");
			break;
		}

	}

	private static void chuongTrinh1_2() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên: ");
		int number = scanner.nextInt();
		if (isPrime(number)) {
			System.out.println("Số nguyên tố");
		} else {
			System.out.println("Không phải số nguyên tố");
		}
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static void chuongTrinh1_1() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên: ");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("Số chẵn");
		} else {
			System.out.println("Số lẻ");
		}

	}

	private static void chuongTrinh1() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên: ");
		int number = scanner.nextInt();
		if (number >= 0) {
			System.out.println("Đây là số nguyên dương");
		} else {
			System.out.println("Đây là số nguyên âm");
		}
	}
}
