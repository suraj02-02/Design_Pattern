package observer_Design.subject;

import observer_Design.observer.IMentee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 *      This is a <code>Subject component</code> in <code>Observer Pattern</code>
 *      It will be observed by <code>Observer</code>
 *   </p>
 *   <p>
 *      It will be having session details and list of observers to which it will notify on state change.
 *      Whenever a new <code>Session </code> is posted by mentor all the mentees will be notified
 *   </p>
 */
public class Mentor {

    private List<IMentee> menteesList = new ArrayList<>();
    private String sessionDetails;

      public void attach(IMentee mentees) {
           this.menteesList.add(mentees);
      }

      public void detach(IMentee mentees) {
           this.menteesList.remove(mentees);
      }

      public void postSession(String sessionDetails){
            this.sessionDetails = sessionDetails;
            notifyMentees();
      }

      public void notifyMentees() {

          Optional.ofNullable(menteesList)
                  .orElse(Collections.emptyList())
                  .stream()
                  .forEach(mentees -> mentees.update(sessionDetails));
      }


}
