package com.text;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.GoodsDao;
import com.model.Goods;


public class Text {

	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
		    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
		        .build(Resources.getResourceAsReader("mybatis.xml"));
		    sqlSession = sessionFactory.openSession();
		    GoodsDao goodsDao = sqlSession.getMapper(GoodsDao.class);
	/*	    Goods goods = goodsDao.findById("0001");
		    if(goods!=null) {
		    	System.out.println(goods.getId());
		    	System.out.println(goods.getName());
		    	System.out.println(goods.getPrice());
		    }
		    List<Goods> list = goodsDao.findAll();
		    if(list!=null) {
		    	for(Goods g:list) {
		    		System.out.println(g.getId());
		    		System.out.println(g.getName());
		    		System.out.println(g.getPrice());
		    	}
		    }
		    Goods goods=new Goods();		    
		    goods.setId("0008");
		    goods.setName("黑鲨手机");
		    goods.setPrice(6000.00);
		    int insert = goodsDao.insert(goods);
		    if(insert!=0) {
		    	System.out.println("操作成功");
		    }*/
/*		    Goods goods = new Goods("0008", "白鲨手机", 9000.00);
		    int update = goodsDao.update(goods);
		    if(update!=0) {
		    	System.out.println("修改成功");
		    }*/
		    int delete = goodsDao.delete("0008");
		    if(delete!=0) {
		    	System.out.println("删除成功");
		    }
		    //执行增删改查
		    sqlSession.commit(); // 提交事务
		} catch (Exception e) {
		    e.printStackTrace();
		    sqlSession.rollback();
		} finally {
		    if (sqlSession != null) {
		       sqlSession.close();
		    }
		}

	}

}
