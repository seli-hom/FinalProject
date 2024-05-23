package org.example;

import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Department {

    private String departmentId;
    private String departmentName;
    private static int nextId = 1;

    public Department(String departmentId, String departmentName) {
        if (validateDepartmentName(departmentName)){
            this.departmentId = String.valueOf('D' + nextId);
            this.departmentName = departmentName;
            nextId++;
        } else {
            this.departmentId = null;
            this.departmentName = null;
        }

    }

    /**
     * Checks if the name of the department is valid or not by checking if all characters are either letters or spaces
     * @param departmentName
     * @return true if all characters are letters or spaces and false if any character is something else like a digit
     */
    private boolean validateDepartmentName(String departmentName){
        int length = departmentName.length();

        for (int i = 0; i < length; i++){
            char c = departmentName.charAt(i);
            if (!Character.isAlphabetic(c) && !Character.isSpaceChar(c)){
                return false;
            }
        }
        return true;
    }
}
