
public enum Person {
	손오공("원숭이") {
		public String work() {
			return "영업부 부장";
		}
	}, 
	사오정("괴수") {
		public String work() {
			return "총무부 과장";
		}
	},
	저팔계("돼지"){
		public String work() {
			return "기획팀 대리";
		}
	},
	삼장법사("스님"){
		public String work() {
			return "전산실 실장";
		}
	},
	전우치("도사");
	
	private String nickName;
	Person(String nickName) {
		this.nickName = nickName;
	}
	
	public String getNickName() {
		return this.nickName;
	}
	public String work() {
		return "??";
	}
}
