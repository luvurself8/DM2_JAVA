package test.sort;

public class TraineeProcess {
	public static void main(String[] args) {
		Trainee[] Trainee = new Trainee[10];
		Trainee[0] = new Trainee("장비", 100, 89, 98);
		Trainee[1] = new Trainee("제갈량", 99, 86, 98);
		Trainee[2] = new Trainee("이순신", 85, 100, 98);
		Trainee[3] = new Trainee("관우", 98, 99, 98);
		Trainee[4] = new Trainee("유관순", 89, 87, 98);
		Trainee[5] = new Trainee("김유신", 77, 65, 98);
		Trainee[6] = new Trainee("전우치", 67, 90, 98);
		Trainee[7] = new Trainee("임꺽정", 99, 100, 98);
		Trainee[8] = new Trainee("제공명", 80, 72, 98);
		Trainee[9] = new Trainee("유비", 76, 70, 98);

		System.out.println(">>>>>>> 원본");
		for(Trainee s : Trainee) 
			System.out.println(s);

		System.out.println();
		ranking(Trainee);

		System.out.println(">>>>>>> 순위 처리");
		for(Trainee s : Trainee) 
			System.out.println(s);

		System.out.println();
		nameSort(Trainee);

		System.out.println(">>>>>>> 이름으로 오름차순");
		for(Trainee s : Trainee) 
			System.out.println(s);

		System.out.println();
		totalSort(Trainee);

		System.out.println(">>>>>>> 성적으로 내림차순");
		for(Trainee s : Trainee) 
			System.out.println(s);
	}

	// 이름 순 정렬 : 선택정렬
	private static void nameSort(Trainee[] Trainee) {
		Trainee temp = null;

		for(int i=0; i<Trainee.length-1; i++)
			for(int j=i; j<Trainee.length; j++) 
				if(Trainee[i].getName().compareTo(Trainee[j].getName()) > 0) {
					temp = Trainee[i];
					Trainee[i] = Trainee[j];
					Trainee[j] = temp;
				}
	}

	// 성적 순 정렬 : 버블정렬
	private static void totalSort(Trainee[] Trainee) {
		Trainee temp = null;

		for(int i=Trainee.length-1; i>0; i--)
			for(int j=0; j<i; j++) 
				if(Trainee[i].getAvg() > Trainee[j].getAvg()) {
					temp = Trainee[i];
					Trainee[i] = Trainee[j];
					Trainee[j] = temp;
				}

	} 

	// 순위처리
	private static void ranking(Trainee[] Trainee) {

		for(int i=0; i<Trainee.length; i++) {
			Trainee[i].setRank(1);
			for(int j=0; j<i; j++) {
				if(Trainee[i].getAvg() < Trainee[j].getAvg()) {
					Trainee[i].setRank(Trainee[i].getRank()+1);
				} else if(Trainee[i].getAvg() > Trainee[j].getAvg()){
					Trainee[j].setRank(Trainee[j].getRank()+1);
				}
			}
		}
	}
}
