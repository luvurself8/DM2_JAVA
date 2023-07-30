package master.service;

import master.vo.Student;

public class ScoreServiceImpl implements ScoreService {
	Student[] list = new Student[MAX];
	int count = 0;
	
	@Override
	public boolean insert(Student student) {
		list[count] = student;
		++count;
		return true;
	}

	@Override
	public boolean update(Student student) {
		for(int i=0; i<count; ++i) {
			if(list[i].getStdid().equals(student.getStdid())) { 
				list[i] = student;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(String stdid) {
		for(int i=0; i<count; ++i) {
			if(list[i].getStdid().equals(stdid)) {
					for(int j=i; j<count; ++j) {
					list[j] = list[j+1];
				}
				--count;
				
				return true;
			}
		}
		return false;
	}

	@Override
	public Student selectOne(String stdid) {
		for(int i=0; i<count; ++i) {
			if(list[i].getStdid().equals(stdid))
				return list[i];
		}
		return null;
	}

	@Override
	public Student[] selectAll() {
		
		return list;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public double[] scoreAnaly() {
		double[] score = new double[3]; // 0: it평균, 1: language평균, 2:basic평균
	
		for(int i=0; i<count; ++i) {
			score[0] += list[i].getIt();
			score[1] += list[i].getLanguage();
			score[2] += list[i].getBasic();
		}
		score[0] = score[0] / count;
		score[1] = score[1] / count;
		score[2] = score[2] / count;
		
		return score;
	}

}
