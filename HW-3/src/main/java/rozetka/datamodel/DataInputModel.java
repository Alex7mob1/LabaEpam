package rozetka.datamodel;

import lombok.Getter;

@Getter
public class DataInputModel {
    private String laptop;
    private String type;
    private String price;

    DataInputModel() {
    }

    public static Builder getBuilder() {
        return new DataInputModel().new Builder();
    }

    public class Builder {
        public Builder laptop(String value) {
            laptop = value;
            return this;
        }

        public Builder type(String value) {
            type = value;
            return this;
        }

        public Builder price(String value) {
            price = value;
            return this;
        }

        public DataInputModel build() {
            return DataInputModel.this;
        }
    }
}