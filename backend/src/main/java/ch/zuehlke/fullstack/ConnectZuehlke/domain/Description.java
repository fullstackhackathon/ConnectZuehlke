package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import java.util.List;

public class Description {
    private int Id;
    private List<Skill> skills;

    public Description(int id, List<Skill> skills) {
        this.Id = id;
        this.skills = skills;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
