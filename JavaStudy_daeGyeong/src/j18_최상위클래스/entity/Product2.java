package j18_최상위클래스.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * 상품 정보 클래스(Entity Class)
 * 
 * 변수					productCode, productName, category, productionDate
 * 기본 생성자
 * 전체 생성자
 * getter, setter
 * hashCode()
 * equals()
 * toString()
 */

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Product2 {
	private int productCode;
	@NonNull
	private String productName;
	private int category;
	private LocalDate productionDate;
	
}