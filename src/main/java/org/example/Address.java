package org.example;

import lombok.*;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    public Address(int streetNo, String street, String city, String province, String postalCode, String country) {
        if (isPostalCodeValid(postalCode)) {
            this.streetNo = streetNo;
            this.street = street;
            this.city = city;
            this.province = province;
            this.postalCode = postalCode.toUpperCase();
            this.country = country;
        } else {
            setStreetNo(0);
            setStreet(null);
            setCity(null);
            setProvince(null);
            setPostalCode(null);
            setCountry(null);
        }
    }

    /**
     * Checks if the postalCode provided is valid by determining if it follows the character digit rule
     * A1B2C3 and in case of space present A1B 2C3
     *
     * @param postalCode String that contains digit and letters
     * @return true if the postal code provided is valid
     */
    public static boolean isPostalCodeValid(String postalCode) {
        boolean valid = false;

        if (postalCode.length() == 7) {
            for (int i = 0; i < 7; i++) {
                char c = postalCode.charAt(i);
                valid = switch (i) {
                    case 0, 2, 5 -> Character.isAlphabetic(c);
                    case 1, 4, 6 -> Character.isDigit(c);
                    default -> Character.isSpaceChar(c);
                };
                if (!valid) {
                    return false;
                }
            }
            return valid;
        }

        if (postalCode.length() == 6) {
            for (int i = 0; i < 6; i++) {
                char c = postalCode.charAt(i);
                valid = switch (i) {
                    case 0, 2, 4 -> Character.isAlphabetic(c);
                    default -> Character.isDigit(c);
                };
                if (!valid) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
