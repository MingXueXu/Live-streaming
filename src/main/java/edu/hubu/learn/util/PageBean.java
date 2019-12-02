package edu.hubu.learn.util;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.List;

/**
 * @moduleName: PageBean
 * @description: PageHelper，自定义分页查询的返回值，
 *
 * @author: 杨睿
 * @since: 2109-12-02 21:53
 */
public class PageBean<T> implements Serializable {
  private static final long serialVersionUID = -9202109574544652243L;
  /**
   * 数据总数
   */
  private long total;

  /**
   * 存放需要显示的实体类数据
   */
  private List<T> list;

  /**
   * 当前页码数（默认给1）
   */
  private int pageNum;

  /**
   * 总页数
   */
  private int pages;

  /**
   * 每页显示的实例总数（默认为20）
   */
  private int pageSize;

  /**
   * 当前页的实例数量 <= pageSize，该属性来自ArrayList的size属性
   */
  private int size;

  public PageBean(List<T> list) {
    if (list instanceof Page) {
      Page<T> page = (Page<T>) list;
      this.pageNum = page.getPageNum();
      this.pageSize = page.getPageSize();
      this.total = page.getTotal();
      this.pages = page.getPages();
      this.list = page;
      this.size = page.size();
    }
  }

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }

  public int getPageNum() {
    return pageNum;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
