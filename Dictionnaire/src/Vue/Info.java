package Vue;

/**
 *
 * @author JBDEV95
 */
public class Info {

    private String text, doc;

    public Info(String text, String doc) {
        this.text = text;
        this.doc = doc;
    }

    public Info() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

}
