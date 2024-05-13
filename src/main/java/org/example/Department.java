package org.example;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId = 1;

    /**
     * Checks if the name of the department is valid or not by checking if all characters are either letters or spaces
     * @param departmentName
     * @return true if all characters are letters or spaces and false if any character is something else like a digit
     */
    private boolean validateDepartmentName(String departmentName){
        boolean valid = false;
        int length = departmentName.length();

        for (int i = 0; i < length; i++){
            char c = departmentName.charAt(i);
            return (Character.isAlphabetic(c) || Character.isSpaceChar(c));
        }
        return valid;
    }
}
