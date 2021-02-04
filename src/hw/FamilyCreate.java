package hw;

public class FamilyCreate {

    private Family family = new Family();

    public FamilyCreate addLastName(String lastName) {
        family.setLastName(lastName);
        return this;
    }
    public FamilyCreate addMother(Person mother) {
        family.setMother(mother);
        return this;
    }

    public FamilyCreate addFather(Person father) {
        family.setFather(father);
        return this;
    }

    public FamilyCreate addChildren(Person child) {
        family.setChildren(child);
        return this;
    }

    public Family createFamily() {
        Family newFamily = family;
        family = null;
        return newFamily;
    }

}

