package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.ebean.Finder;
import io.ebean.Model;

@Entity
public class Member extends Model{
	
	@Id
	public Long id;
	public String name;
	
	public static Finder<Long,Member> find = new Finder<Long,Member>(Member.class);
	
	@Override
	public String toString() {
		return "id: " + id + "name: " + name;
	}
}
