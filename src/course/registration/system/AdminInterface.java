package course.registration.system;

import java.io.IOException;

public interface AdminInterface {
    public void addcourses() throws IOException;
    public void deletecourses() throws IOException;
    public void addmodule() throws IOException;
    public void cancelcourse() throws IOException;
    public void Assigninst() throws IOException;
    public void addMarks() throws IOException;
    public void update() throws IOException;

}
