package dev.drf.java14.features.test.npe;

import dev.drf.java14.features.test.FeatureTest;

public final class NewNullPointerTest implements FeatureTest {
    @Override
    public void processTest() {
        // java -XX:+ShowCodeDetailsInExceptionMessages --enable-preview Main
        AddressObject addressObject = new AddressObject();
        addressObject.setStreet("street value");

        AuthorObject authorObject = new AuthorObject();
        authorObject.setAddress(addressObject);

        AuthorObject authorNull = new AuthorObject();
        authorNull.setAddress(null);

        MessageObject messageObject = new MessageObject();
        messageObject.setAuthor(authorObject);

        MessageObject messageNull = new MessageObject();
        messageNull.setAuthor(authorNull);

        try {
            System.out.println(messageObject.getAuthor().getAddress().getStreet());
        } catch (Throwable tr) {
            tr.printStackTrace();
        }

        try {
            System.out.println(messageNull.getAuthor().getAddress().getStreet());
        } catch (Throwable tr) {
            tr.printStackTrace();
        }
    }

    public static class MessageObject {
        private AuthorObject author;

        public AuthorObject getAuthor() {
            return author;
        }

        public void setAuthor(AuthorObject author) {
            this.author = author;
        }
    }

    public static class AuthorObject {
        private AddressObject address;

        public AddressObject getAddress() {
            return address;
        }

        public void setAddress(AddressObject address) {
            this.address = address;
        }
    }

    public static class AddressObject {
        private String street;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }
    }
}
