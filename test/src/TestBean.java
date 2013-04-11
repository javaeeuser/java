import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestBean {

	private List<Question> questions;

	private Question question = new Question();

	@PostConstruct
	public void init() {
		questions = new ArrayList<Question>();
		questions.add(new Question((long) 1, "Title1 ", "Content1"));
		questions.add(new Question((long) 2, "Title2", "Content2"));
		questions.add(new Question((long) 2, "Title3", "Content3"));
		questions.add(new Question((long) 2, "Title4", "Content4"));
		questions.add(new Question((long) 2, "Title5", "Content5"));
		questions.add(new Question((long) 1, "Title1 ", "Content1"));
		questions.add(new Question((long) 2, "Title2", "Content2"));
		questions.add(new Question((long) 2, "Title3", "Content3"));
		questions.add(new Question((long) 2, "Title4", "Content4"));
		questions.add(new Question((long) 2, "Title5", "Content5"));
	}

	public void create() {
		questions.add(question);
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
