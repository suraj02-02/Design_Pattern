package observer_Design.observer;

/**
 *  <p>
 *     This is a <code>Concrete Observer component </code> in <code>Observer Pattern</code>
 *  </p>
 *  <p>
 *     The mentees will be notified using the @code{@link observer_Design.observer.Mentees#update(String)} method.
 *  </p>
 */

public class Mentees implements IMentee {

    private String menteeName;

    public Mentees(String menteeName){
          this.menteeName = menteeName;
    }

    @Override
    public void update(String sessionDetails) {
             System.out.println("Hey " + menteeName + ", session details are : " + sessionDetails);
    }
}
