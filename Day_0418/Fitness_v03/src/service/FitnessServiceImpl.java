package service;

import vo.Fitness;

public class FitnessServiceImpl implements FitnessService {
	Fitness[] list = new Fitness[MAX];
	int count = 0;
	
	@Override
	public boolean insert(Fitness fitness) {
		list[count] = fitness;
		++count;

		return true;
	}

	@Override
	public Fitness selectOne(String id) {
		for(int i=0; i<count; ++i) {
			 if(list[i].getId().equals(id)) {
				 return list[i];
			 }
		}
		return null;
	}

	@Override
	public boolean update(Fitness fitness) {
		for(int i=0; i<count; ++i) {
			if(list[i].getId().equals(fitness.getId())) {
				list[i].setWeight(fitness.getWeight());
				list[i].setHeight(fitness.getHeight());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(String id) {
		for(int i=0; i<count; ++i) {
			if(list[i].getId().equals(id)) {
				for(int j=i; j<count-1; ++j) {
					list[j] = list[j+1];
				}
				--count;
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Fitness[] selectAll() {
		return list;
	}

	@Override
	public int getCount() {
		return count;
	}

}
