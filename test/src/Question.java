public class Question {

	private Long id;
	private String title;
	private String content;

	
	
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Question(Long id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
