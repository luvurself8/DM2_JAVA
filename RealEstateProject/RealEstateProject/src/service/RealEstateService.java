package service;

import java.util.List;

import vo.RealEstate;

public interface RealEstateService {
	public boolean insert(RealEstate realEstate);
	public List<RealEstate> selectByType(String type);
	public List<RealEstate> selectAll();
	public boolean update(RealEstate realEstate);
	public boolean delete(String address);
	public RealEstate selectByAddress(String address);
}
