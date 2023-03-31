package com.enesbayram.model.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.enesbayram.model.DtoJFIlac;
import com.enesbayram.model.JFIlac;

public class Converter {

	public static <T> T toDTO(Object source, Class<T> targetType) {
		T target = null;
		try {
			target = targetType.newInstance();
			BeanUtils.copyProperties(source, target);
		} catch (Exception e) {
			System.out.println("Dto 'ya çevrilirken hata oluştu : " + e.getMessage());
		}
		return target;
	}

	public static <T> List<T> toDTOList(List<?> list, Class<T> targetType) {
		List<T> dtoList = new ArrayList<T>();
		for (Object object : list) {
			T dto = toDTO(object, targetType);
			dtoList.add(dto);
		}
		return dtoList;
	}

	public static void main(String[] args) {

		JFIlac jfIlac = new JFIlac();
		jfIlac.setIlacId(1);
		jfIlac.setBarkod("8699999999999999");
		jfIlac.setIlacAdi("Parol");
		jfIlac.setEczsts(50.5);
		jfIlac.setSgksts(20.5);

		JFIlac jfIlac2 = new JFIlac();
		jfIlac2.setIlacId(1);
		jfIlac2.setBarkod("86999999955555");
		jfIlac2.setIlacAdi("Aspirin");
		jfIlac2.setEczsts(25.3);
		jfIlac2.setSgksts(12.3);

		JFIlac jfIlac3 = new JFIlac();
		jfIlac3.setIlacId(1);
		jfIlac3.setBarkod("86999999111111");
		jfIlac3.setIlacAdi("Apranax");
		jfIlac3.setEczsts(120.5);
		jfIlac3.setSgksts(50D);

		List<JFIlac> jfilacList = new ArrayList<JFIlac>();
		jfilacList.add(jfIlac);
		jfilacList.add(jfIlac2);
		jfilacList.add(jfIlac3);

//		DtoJFIlac dto = toDTO(jfIlac, DtoJFIlac.class);
//		System.out.println(dto);

		 List<DtoJFIlac> dtoList = toDTOList(jfilacList, DtoJFIlac.class);
		 for (DtoJFIlac dtoJFIlac : dtoList) {
			System.out.println(dtoJFIlac);
		}
	}
}
