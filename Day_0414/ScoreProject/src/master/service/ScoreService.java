package master.service;

import master.vo.Student;

public interface ScoreService {
	public static final int MAX = 100;		// 최대 학생 수
	public boolean insert(Student student);	// 학생 데이터 배열추가
	public boolean update(Student student); // 성적 수정
	public boolean delete(String stdid);    // 학생 정보 삭제
	public Student selectOne(String stdid); // 1명의 정보 조회
	public Student[] selectAll(); 			// 전체 학생 정보 조회
	public int getCount();					// 등록된 학생수 조회
	
	/**
	 * 3과목의 평균 계산 (추가기능)
	 * @return 3과목의 평균이 저장되어 있는 double[]
	 */
	public double[] scoreAnaly();			// 각 과목의 평균
}
