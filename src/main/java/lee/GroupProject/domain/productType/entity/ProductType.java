package lee.GroupProject.domain.productType.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 제품종류 Bean
 * @author LEE KYUHEON
 */
@Entity
@DynamicInsert
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductType {
	@Id
	@Column(name="type_num")
	private Integer typeNum;
	private String typeName;
	private String description;
}

