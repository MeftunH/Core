package Optional;

public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public static void main(String[] args) {
//        findPhoneNumberByNameAndPunishIfNothingFound("Maftun").toUpperCase();
    }

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElseThrow(() -> new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return null;
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return null;
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }

}
