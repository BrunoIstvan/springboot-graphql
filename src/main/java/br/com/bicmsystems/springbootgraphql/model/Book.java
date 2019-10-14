package br.com.bicmsystems.springbootgraphql.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
@Where(clause = "is_active = true")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String isbn = UUID.randomUUID().toString();
	
	private String title;
	
	private String subject;
	
	@ManyToOne
	private Author author;
	
	private LocalDate createdAt = LocalDate.now();
	
	@Column(name = "is_active")
	private boolean active = true;

}
