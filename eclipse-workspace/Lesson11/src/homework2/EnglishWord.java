package homework2;

public class EnglishWord {

	private String word;
	private String kindOfWord;
	private String note;
	private String mean;
	
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	public EnglishWord() {
		super();
	}
	public EnglishWord(String word,String mean, String kindOfWord, String note) {
		super();
		this.word = word;
		this.mean=mean;
		this.kindOfWord = kindOfWord;
		this.note = note;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getKindOfWord() {
		return kindOfWord;
	}
	public void setKindOfWord(String kindOfWord) {
		this.kindOfWord = kindOfWord;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof EnglishWord)) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		EnglishWord Eword = (EnglishWord) obj;
		return Eword.getWord().equals(word);
	}
	@Override
	public String toString() {
		return "EnglishWord [word=" + word + ", kindOfWord=" + kindOfWord + ", note=" + note + ", mean=" + mean + "]";
	}
	
	
}
