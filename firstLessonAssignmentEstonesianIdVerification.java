package Lesson1;

public class firstLessonAssignmentEstonesianIdVerification {


        public static void main(String[] args) {

            String estonessianId = "38907050234";
            
            int sum = (Character.getNumericValue(estonessianId.charAt(0)) * 1) +
                    (Character.getNumericValue(estonessianId.charAt(1)) * 2) +
                    (Character.getNumericValue(estonessianId.charAt(2)) * 3) +
                    (Character.getNumericValue(estonessianId.charAt(3)) * 4) +
                    (Character.getNumericValue(estonessianId.charAt(4)) * 5) +
                    (Character.getNumericValue(estonessianId.charAt(5)) * 6) +
                    (Character.getNumericValue(estonessianId.charAt(6)) * 7) +
                    (Character.getNumericValue(estonessianId.charAt(7)) * 8) +
                    (Character.getNumericValue(estonessianId.charAt(8)) * 9) +
                    (Character.getNumericValue(estonessianId.charAt(9)) * 1);

            int checksum = sum % 11;
            if (checksum == 10 || checksum == 11) {
                checksum = 0;
            }

            if (checksum == Character.getNumericValue(estonessianId.charAt(10))) {
                System.out.println("The ID code is valid.");
            } else {
                System.out.println("The ID code is invalid.");
            }
        }
    }



