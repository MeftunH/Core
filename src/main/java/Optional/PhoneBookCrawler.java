package Optional;

import java.util.Optional;

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
        StringBuilder result = new StringBuilder();
        phoneBook.findPhoneNumberByName(name)
                .ifPresentOrElse(result::append ,
                ()->System.out.println(phoneBook.getPhoneBookEntries()));
        return result.toString();
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
      String result = "";
        Optional<String> phoneNumberOptional = phoneBook.findPhoneNumberByName(name);
        Optional<String> nameOptional = phoneBook.findNameByPhoneNumber(phoneNumber);

        if(phoneNumberOptional.isPresent())
        {
            return phoneNumberOptional.get();
        }
        else if (nameOptional.isPresent()) {
            return nameOptional.get();
        }
        return null;
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }

}
