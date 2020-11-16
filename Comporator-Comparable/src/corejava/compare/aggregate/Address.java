package corejava.compare.aggregate;

import java.util.Comparator;

public class Address {

        private String city;
        private String State;

        public Address(String city, String state) {
            this.city = city;
            State = state;
        }

        public Address(){

        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return State;
        }

        public void setState(String state) {
            State = state;
        }

}
