package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.meeting.Meeting;

public interface ReadOnlyMeetingBook {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Meeting> getMeetingList();
}

