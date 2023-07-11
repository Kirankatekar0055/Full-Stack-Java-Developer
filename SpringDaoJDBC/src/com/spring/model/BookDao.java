package com.spring.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.protocol.Resultset;


public class BookDao 
{
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int saveBook(Book b)
	{
		String q="insert into Bookm values(?,?,?,?)";
		return jt.update(q,b.getId(),b.getName(),b.getPrice(),b.getAuther());
		
	}
	
	public int deleteBook(int id)
	{
		String q="delete from Bookm where id=?";
		return jt.update(q,id);
		
	}
	
	public int updateBook(Book b)
	{
		String q="update Bookm set Price=? where id=?";
		return jt.update(q,b.getPrice(),b.getId());
		
	}
	
	public void showallBooks()
	{
		List<Book>blist=new ArrayList<Book>();
		jt.query("select * from Bookm",new RowMapper());
		{
			public object mapRow(Resultset rs,int rowno);
			{
				Book b=new Book();
				b.setId(rs.getInt);
				b.setName(rs.getString);
				b.setAuther(rs.getString);
				b.setPrice(rs.getDouble);
				
				blist.add(b);
				return b;
			}
			 System.out.println("All Books Are:");
			 for(Book b:blist)
			 {
				 System.out.println(b);
			 }
		}
		
	}

}
