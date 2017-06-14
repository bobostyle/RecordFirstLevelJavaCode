package listener;

 /**
 * Paper.java
 * 2016年9月4日下午8:57:29
 * @author cbb
 * TODO 文章作为事件源
 */
public class Paper {

	private long id; //文章的id编号
	private String name; //文章的标题
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
