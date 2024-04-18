package Collection;
import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;
	public LinkedList() {
		this.head = null;
	}

	// Thêm một phần tử vào đầu danh sách
	public void themDau(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// Thêm một phần tử vào cuối danh sách
	public void themCuoi(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	// Thêm một phần tử vào vị trí thứ i trong danh sách
	public void themViTriI(int index, int data) {
		if (index < 0) {
			System.out.println("Vi tri khong hop le");
			return;
		}
		if (index == 0) {
			themDau(data);
			return;
		}
		Node newNode = new Node(data);
		Node current = head;
		int count = 0;
		while (current != null && count < index - 1) {
			current = current.next;
			count++;
		}
		if (current == null) {
			System.out.println("Vi tri khong hop le");
			return;
		}
		newNode.next = current.next;
		current.next = newNode;
	}

	// Đếm số lượng phần tử chẵn dương và tính trung bình cộng các số
	public void demVaTBC() {
		Node current = head;
		int countEvenPositive = 0;
		int sum = 0;
		int count = 0;
		while (current != null) {
			if (current.data > 0 && current.data % 2 == 0) {
				countEvenPositive++;
			}
			sum += current.data;
			count++;
			current = current.next;
		}
		double average = (double) sum / count;
		System.out.println("So luong phan tu chan duong: " + countEvenPositive);
		System.out.println("Trung binh cong cac so: " + average);
	}

	// Kiểm tra xem một số có phải là số nguyên tố hay không
	public boolean ktraSoNguyenTo(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Đếm số lượng số nguyên tố trong danh sách
	public int demSoNguyenTo() {
		Node current = head;
		int count = 0;
		while (current != null) {
			if (ktraSoNguyenTo(current.data)) {
				count++;
			}
			current = current.next;
		}
		return count;
	}

	// Kiểm tra một số có phải là số hoàn hảo hay không
	public boolean ktraSoHoanHao(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum == n;
	}

	// Liệt kê tất cả các số hoàn hảo trong danh sách
	public void lietKeSoHoanHao() {
		Node current = head;
		System.out.println("Cac so hoan hao trong danh sach:");
		while (current != null) {
			if (ktraSoHoanHao(current.data)) {
				System.out.println(current.data);
			}
			current = current.next;
		}
	}

	// Xoá tất cả các số nguyên tố trong danh sách
	public void xoaCacSoNguyenTo() {
		Node current = head;
		Node prev = null;
		while (current != null) {
			if (ktraSoNguyenTo(current.data)) {
				if (prev == null) {
					head = current.next;
				} else {
					prev.next = current.next;
				}
			} else {
				prev = current;
			}
			current = current.next;
		}
	}

	// Kiểm tra xem có 3 phần tử liền kề lập thành cấp số cộng không
	public void ktra3PhanTu() {
		Node current = head;
		int count = 0;
		int[] arr = new int[3];
		while (current != null) {
			if (count == 3) {
				if (arr[1] - arr[0] == arr[2] - arr[1]) {
					System.out.println("Co cap so cong voi 3 phan tu lien ke lap thanh: " + (count - 3));
					System.out.println("Vi tri cac so: " + (count - 3) + ", " + (count - 2) + ", " + (count - 1));
					return;
				}
				count--;
			}
			arr[count] = current.data;
			count++;
			current = current.next;
		}
		System.out.println("Khong co cap so cong voi 3 phan tu lien ke");
	}

	// Sắp xếp danh sách theo thứ tự tăng dần
	public void sapXepTangDan() {
		if (head == null) {
			return;
		}
		Node current = head;
		while (current != null) {
			Node index = current.next;
			while (index != null) {
				if (current.data > index.data) {
					int temp = current.data;
					current.data = index.data;
					index.data = temp;
				}
				index = index.next;
			}
			current = current.next;
		}
	}

	// Hiển thị danh sách
	public void hienThi() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList list = new LinkedList();

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Tao danh sach  so (Nhap '#' de ket thuc)");
			System.out.println("2. Them 1 phan tu vao dau danh sach");
			System.out.println("3. Them 1 phan tu vao cuoi danh sach");
			System.out.println("4. Them phan tu vao vi tri thu i");
			System.out.println("5. Dem so luong phan tu chan duong va tinh trung binh cong");
			System.out.println("6. Dem so luong so nguyen to xuat hien trong danh sach");
			System.out.println("7. Liet ke tat ca cac so hoan hao");
			System.out.println("8. Xoa tat ca cac so nguyen to trong danh sach");
			System.out.println("9. Kiem tra trong danh sach co 3 phan tu dung lien ke nhau tao thanh cap so cong hay khong");
			System.out.println("10. Sap xep danh sach theo thu tu tang dan");
			System.out.println("11. Hien thi danh sach");
			System.out.println("12. Thoat");

			System.out.print("Chon thao tac: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Nhap cac so vao danh sach (Nhap '#' de ket thuc): ");
				while (true) {
					String n = scanner.next();
					if (n.equals("#")) {
						break;
					}
					try {
						int num = Integer.parseInt(n);
						list.themCuoi(num);
					} catch (NumberFormatException e) {
						System.out.println("Vui long nhap so nguyen hoac ky tu '#'.");
					}
				}
				break;
			case 2:
				System.out.print("Nhap phan tu can them vao dau danh sach: ");
				int td = scanner.nextInt();
				list.themDau(td);
				break;
			case 3:
				System.out.print("Nhap phan tu can them vao cuoi danh sach: ");
				int tc = scanner.nextInt();
				list.themCuoi(tc);
				break;
			case 4:
				System.out.print("Nhap vi tri can them: ");
				int vitri = scanner.nextInt();
				System.out.print("Nhap phan tu can them: ");
				int m = scanner.nextInt();
				list.themViTriI(vitri, m);
				break;
			case 5:
				list.demVaTBC();
				break;
			case 6:
				System.out.println("So luong so nguyen to trong danh sach: " + list.demSoNguyenTo());
				break;
			case 7:
				list.lietKeSoHoanHao();
				break;
			case 8:
				list.xoaCacSoNguyenTo();
				break;
			case 9:
				list.ktra3PhanTu();
				break;
			case 10:
				list.sapXepTangDan();
				System.out.println("Danh sach sau khi duoc sap xep:");
				list.hienThi();
				break;
			case 11:
				System.out.println("Danh sach:");
				list.hienThi();
				break;
			case 12:
				System.out.println("Ket thuc chuong trinh.");
				return;
			default:
				System.out.println("Lua chon khong hop le");
				break;
			}
		}
	}
}
