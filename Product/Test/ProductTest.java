import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void toCSVTest() {
        Product linen = new Product("000001", "Linen", "Fine woven; natural color", 18.99);
        assertEquals("000001, Linen, Fine woven; natural color, 18.99", linen.toCSV());
    }

    @Test
    void toJSONTest() {
        Product linen = new Product("000001", "Linen", "Fine woven; natural color", 18.99);
        char DQ = '\u0022';
        assertEquals("{" + DQ + "ID" + DQ + ":" + DQ + "000001" + DQ + ", "
                + DQ + "name" + DQ + ":" + DQ + "Linen" + DQ + ", "
                + DQ + "description" + DQ + ":" + DQ + "Fine woven; natural color" + DQ + ", "
                + DQ + "cost" + DQ + ":" + DQ + "18.99" + DQ + "}", linen.toJSON());
    }

    @Test
    void toXMLTest() {
        Product linen = new Product("000001", "Linen", "Fine woven; natural color", 18.99);
        assertEquals("<Product>" +
                                "<ID>000001</ID>" +
                                "<name>Linen</name>" +
                                "<description>Fine woven; natural color</description>" +
                                "<cost>18.99</cost>" +
                                "</Product>", linen.toXML());
    }
}