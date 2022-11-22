

import java.util.Scanner;

public class Zodiac {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your date of birth: ");
        int birthDay = scanner.nextInt();

        System.out.print("Please enter your month of birth: ");
        int birthMonth = scanner.nextInt();

        String zodiacSign = "";
        boolean isError = false;

        if (birthMonth == 1) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 21) {
                    zodiacSign = "Capricorn";
                } else {
                    zodiacSign = "Aquarius";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 2) {
            if (birthDay >= 1 && birthDay <= 28) {
                if (birthDay <= 19) {
                    zodiacSign = "Aquarius";
                } else {
                    zodiacSign = "Piscez";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 3) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 20) {
                    zodiacSign = "Piscez";
                } else {
                    zodiacSign = "Aries";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 4) {
            if (birthDay >= 1 && birthDay <= 30) {
                if (birthDay <= 20) {
                    zodiacSign = "Aries";
                } else {
                    zodiacSign = "Taurus";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 5) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 21) {
                    zodiacSign = "Taurus";
                } else {
                    zodiacSign = "Gemini";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 6) {
            if (birthDay >= 1 && birthDay <= 30) {
                if (birthDay <= 22) {
                    zodiacSign = "Gemini";
                } else {
                    zodiacSign = "Cancer";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 7) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 22) {
                    zodiacSign = "Cancer";
                } else {
                    zodiacSign = "Leo";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 8) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 23) {
                    zodiacSign = "Leo";
                } else {
                    zodiacSign = "Virgo";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 9) {
            if (birthDay >= 1 && birthDay <= 30) {
                if (birthDay <= 22) {
                    zodiacSign = "Virgo";
                } else {
                    zodiacSign = "Libra";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 10) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 22) {
                    zodiacSign = "Libra";
                } else {
                    zodiacSign = "Scorpio";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 11) {
            if (birthDay >= 1 && birthDay <= 30) {
                if (birthDay <= 21) {
                    zodiacSign = "Scorpio";
                } else {
                    zodiacSign = "Sagittarius";
                }
            } else {
                isError = true;
            }
        } else if (birthMonth == 12) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 21) {
                    zodiacSign = "Sagittarius";
                } else {
                    zodiacSign = "Capricorn";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("You entered an invalid day.");
        } else {
            System.out.println("Your Zodiac Sign is: " + zodiacSign);
        }
    }

}