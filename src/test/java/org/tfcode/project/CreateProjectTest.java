package org.tfcode.project;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreateProjectTest {
    @Test
    public void canConstructCreateProject() {
        CreateProject app = new CreateProject();
        assertEquals(app.getClass().toString(),CreateProject.class.toString());
    }
}
