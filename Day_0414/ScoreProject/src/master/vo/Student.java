package master.vo;

public class Student {
	private String stdid;
	private String stdname;
	private double it;
	private double language;
	private double basic;
	private double avg;
	private String grade;
	
	public Student() {
		super();
	}

	public Student(String stdid, String stdname, double it, double language, double basic) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.it = it;
		this.language = language;
		this.basic = basic;
		calcAvg();
	}

	public String getStdid() {
		return stdid;
	}

	public void setStdid(String stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public double getIt() {
		return it;
	}

	public void setIt(double it) {
		this.it = it;
		calcAvg();
	}

	public double getLanguage() {
		return language;
	}

	public void setLanguage(double language) {
		this.language = language;
		calcAvg();
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
		calcAvg();
	}

	public double getAvg() {
		return avg;
	}

	public String getGrade() {
		return grade;
	}
	
	// 평균계산
	private void calcAvg() {
		avg = it*0.4 + language*0.3 + basic*0.3;
		checkGrade();
	}
	
	// 등급계산
	private void checkGrade() {
		if(avg >= 90)      grade="1등급";
		else if(avg >= 80) grade="2등급";
		else if(avg >= 70) grade="3등급";
		else if(avg >= 60) grade="4등급";
		else               grade="5등급";
	}

	@Override
	public String toString() {
		String temp = String.format("%3s번 %5s : %6.2f %6.2f %6.2f %6.2f %s", 
				stdid, stdname, it, language, basic, avg, grade ); 
		return temp;
	}
}
