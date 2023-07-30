
public enum Weather {
	맑음("Sunny"){
		public String playKor() {
			return "날씨가 좋으니 자바코딩";
		}
		public String playEng() {
			return "Sunny Day -> Java Coding";
		}
	},
	안개("Foggy"){
		public String playKor() {
			return "안개가 끼었으니 자바코딩";
		}
		public String playEng() {
			return "Foggy Day -> Funny Coding";
		}
	}, 
	흐림("Cloudy"){
		public String playKor() {
			return "구름이 끼었네! 아싸~ 자바코딩";
		}
		public String playEng() {
			return "Sunny Day -> Exciting Coding";
		}
	}, 
	비("Rainy") {
		public String playKor() {
			return "비가 오다니, 나가서 비맞지말고 자바코딩";
		}
		public String playEng() {
			return "Rainy Day -> Java Coding! Wow";
		}
	}, 
	눈("Snowy"){
		public String playKor() {
			return "눈올때 나가면 감기걸리니까 자바코딩";
		}
		public String playEng() {
			return "Snowy Day -> Java Coding! hahaha~~";
		}
	};
	private String english;
	Weather(String english) {
		this.english = english;
	}
	public String getEnglish() {
		return english;
	}
	public String playKor() {
		return "1년 365일 자바 코딩합시다";
	}
	public String playEng() {
		return "Everyday -> Java Coding!!";
	}
	
}
