package ui;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import service.RealEstateService;
import service.RealEstateServiceImpl;
import vo.BuyingAndSelling;
import vo.Charter;
import vo.MonthlyRent;
import vo.RealEstate;
import vo.RealEstateType;

public class RealEstateUI {
	Scanner keyin = new Scanner(System.in);
	RealEstateService service = new RealEstateServiceImpl();

	public RealEstateUI() {
		while(true) {
			mainMenu();
			String choice;

			choice = keyin.next();   keyin.nextLine();

			switch(choice) {
			case "1" : regist();   		break;  // ���
			case "2" : retrieve(); 		break;	// �˻�
			case "3" : modify();   		break;	// ����
			case "4" : delete();   		break;	// ����
			case "5" : retrieveAll();  	break;	// ��ü���	
			case "0" : 
				System.out.println("** ���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("** �޴��� �ٽ� �������ּ���");
			}
		}
	}

	// ���
	private void regist() {
		String choice;
		registMenu();

		choice = keyin.next();
		
		keyin.nextLine();
		
		switch(choice) {
		case "1" : 
			input(RealEstateType.BuyingAndSelling);	// �Ÿ� ���(�ּ�, �ְ�����, ũ��, �ŸŰ���)
			break;
		case "2" : 				
			input(RealEstateType.Charter);				// ���� ���
			break;
		case "3" : 				
			input(RealEstateType.MonthlyRent);			// ���� ���
			break;

		case "0" : return; // ���� �޴�
		default : System.out.println("** �޴��� �ٽ� �������ּ���");			
		}
	}

	// �Ź� ������ ������ �� �ߺ������� �Է�
	private void input(RealEstateType type) {
		String address;			// �ּ�
		String houseType;		// �ְ�����
		int size;				// ũ��
		int price;				// ����, ����, �ŸŰ���
		RealEstate realEstate = null;

		System.out.print("> �ּ� �Է�: ");
		address = keyin.nextLine();		// ����Ű�� �����ͷ� ó��
		System.out.print("> �ְ� ����(����Ʈ, ����, �ܵ�����): ");
		houseType = keyin.next();
		System.out.print("> ũ��(����): ");
		size = keyin.nextInt();

		switch(type) {
		case BuyingAndSelling:
			System.out.print("> �Ÿ� ����: ");
			price = keyin.nextInt();
			realEstate = new BuyingAndSelling(address, houseType, size, price);
			break;
		case Charter : 
			System.out.print("> ���� ����: ");
			price = keyin.nextInt();
			realEstate = new Charter(address, houseType, size, price);
			break;
		case MonthlyRent:
			System.out.print("> ���� ����: ");
			price = keyin.nextInt();
			realEstate = new MonthlyRent(address, houseType, size, price);
		}
		boolean result = service.insert(realEstate);

		if(result) {
			System.out.println("** ������ ��ϵǾ����ϴ�.");
			return;
		}
		System.out.println("** ���� ��� ����!");
	}

	private void retrieve() {
		retrieveMenu();
		
		String choice, address;
		List<RealEstate> list = null;
		RealEstateType type ;
		
		choice = keyin.next();  keyin.nextLine(); 

		switch(choice) {
		case "1" : {
			System.out.println("> �˻��� �ּ� �Է�: ");
			address = keyin.nextLine();
			RealEstate realEstate = service.selectByAddress(address);
			System.out.println(realEstate);
		}	
		return;
		case "2" : 
			type = RealEstateType.BuyingAndSelling;
			break;
		case "3" : 
			type = RealEstateType.Charter;
			break;
		case "4" : 
			type = RealEstateType.MonthlyRent;
			break;
		default :
			System.out.println("** �޴� ������ �ٽ�~");
			return;
		}

		list = service.selectByType(type);
		if(list.size() == 0) {
			System.out.println("** ã�� ������ �����ϴ�.");
			return;
		}
		
		Iterator<RealEstate> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	private void modify() {
		String address;

		System.out.println("> ���� ������ �ּ�: ");
		address = keyin.nextLine();

		RealEstate realEstate = service.selectByAddress(address);
		if (realEstate == null) {
			System.out.println("** �ش� �ּ��� ������ �����ϴ�.");
			return;
		}

		System.out.println("*** ��ϵ� ����");
		System.out.println(realEstate);

		int price; 

		if(realEstate instanceof BuyingAndSelling) {
			System.out.print("> �ŸŰ���: ");
			price = keyin.nextInt();
			((BuyingAndSelling)realEstate).setPrice(price);
		}
		else if(realEstate instanceof Charter) {
			System.out.print("> ���� �Ӵ� ������: ");
			price = keyin.nextInt();
			((Charter)realEstate).setDepositMoney(price);
		}
		else if(realEstate instanceof MonthlyRent) {
			System.out.print("> �� �Ӵ��: ");
			price = keyin.nextInt();
			((MonthlyRent)realEstate).setMonthlyRent(price);
		}
		boolean result = service.update(realEstate);

		if(result) {
			System.out.println("** ������ �Ϸ�Ǿ����ϴ�.");
			return;
		}
		System.out.println("** ���� ����!");
	}

	// �ŷ� �Ϸ� ���� ����
	private void delete() {
		String address;

		System.out.println("> ���� ������ �ּ�: ");
		address = keyin.nextLine();

		boolean result = service.delete(address);

		if(result) System.out.println("** ���� �����Ǿ����ϴ�.");
		else       System.out.println("** ���� ����");
	}

	// ��ü ������ ���
	private void retrieveAll() {
		List<RealEstate> list = service.selectAll();

		if(list.size() == 0) {
			System.out.println("** ��ϵ� ������ �����ϴ�.");
			return;
		}

		Iterator<RealEstate> iter = list.iterator();

		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	// ���� �޴�
	private void mainMenu() {
		System.out.println("\n-----------------------------");
		System.out.println("   �ε��� �߰� ���� �ý���");
		System.out.println("-----------------------------");
		System.out.println("        1. ��    ��");
		System.out.println("        2. ��    ��");
		System.out.println("        3. ��    ��");
		System.out.println("        4. ����(�ŷ��Ϸ�)");
		System.out.println("        5. ��ü���");
		System.out.println("        0. ��    ��");
		System.out.println("-----------------------------");
		System.out.print  ("        �޴����� > ");
	}

	// ��� �޴�
	private void registMenu() {
		System.out.println("\n-----------------------------");
		System.out.println("    �ε��� �Ź� ���� ���");
		System.out.println("-----------------------------");
		System.out.println("        1. ��    ��");
		System.out.println("        2. ��    ��");
		System.out.println("        3. ��    ��");
		System.out.println("        0. �����޴�");
		System.out.println("-----------------------------");
		System.out.print  ("        �޴����� > ");		
	}

	// �˻� �޴�
	private void retrieveMenu() {
		System.out.println("\n-----------------------------");
		System.out.println("    �ε��� �Ź� ���� �˻�");
		System.out.println("-----------------------------");
		System.out.println("       1. �ּҷ� �˻�");
		System.out.println("       2. �Ÿ� ���� �˻�");
		System.out.println("       3. ���� ���� �˻�");
		System.out.println("       4. ���� ���� �˻�");
		System.out.println("-----------------------------");
		System.out.print  ("        �޴����� > ");		
	}
}
