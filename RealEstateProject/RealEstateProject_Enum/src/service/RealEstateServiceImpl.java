package service;

import java.util.ArrayList;
import java.util.List;

import vo.BuyingAndSelling;
import vo.Charter;
import vo.MonthlyRent;
import vo.RealEstate;
import vo.RealEstateType;


public class RealEstateServiceImpl implements RealEstateService {
	List<RealEstate> list = new ArrayList<>();
	
	@Override
	public boolean insert(RealEstate realEstate) {
		return list.add(realEstate);
	}

	public List<RealEstate> selectByType(RealEstateType type) {
		List<RealEstate> myList = new ArrayList<>();
		
		// 반복적으로 데이터를 조회
		for(int i=0; i<list.size(); ++i) {
			switch(type) {
			case BuyingAndSelling :
				if(list.get(i) instanceof BuyingAndSelling)
					myList.add(list.get(i));
				break;
			case Charter :
				if(list.get(i) instanceof Charter)
					myList.add(list.get(i));
				break;
			case MonthlyRent :
				if(list.get(i) instanceof MonthlyRent)
					myList.add(list.get(i));	
			}
		}
		
		return myList;
	}

	@Override
	public List<RealEstate> selectAll() {
		return list;
	}

	@Override
	public boolean update(RealEstate realEstate) {
		String address = realEstate.getAddress();
		RealEstate r = null;

		for(int i=0; i<list.size(); ++i) {
			r = list.get(i);
			if(r.getAddress().equals(address)) {
				if(r instanceof BuyingAndSelling) {
					int price = ((BuyingAndSelling)realEstate).getPrice();
					((BuyingAndSelling)r).setPrice(price);
				} else if(r instanceof Charter) {
					int price = ((Charter)realEstate).getDepositMoney();
					((Charter)r).setDepositMoney(price);
				} else if(r instanceof MonthlyRent) {
					int price = ((MonthlyRent)realEstate).getMonthlyRent();
					((MonthlyRent)r).setMonthlyRent(price);
				}
				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public boolean delete(String address) {
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getAddress().equals(address)) {
				list.remove(i);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public RealEstate selectByAddress(String address) {
		RealEstate realEstate = null;
		
		for(RealEstate r : list) {
			if(r.getAddress().equals(address)) {
				realEstate = r;
				break;
			}
		}
			
		return realEstate;
	}
}
