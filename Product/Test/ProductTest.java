import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product linen;

    @BeforeEach
    void setUp() {
        linen = new Product("000001", "Linen", "Fine woven; natural color", 18.99);
    }

    @Test
    void setIDTest() {
        linen.setID("C000001");
        assertEquals("C000001", linen.getID());
    }

    @Test
    void setNameTest() {
        linen.setName("Stained Linen");
        assertEquals("Stained Linen", linen.getName());
    }

    @Test
    void setDescriptionTest() {
        linen.setDescription("Fine woven; natural color; stain spots");
        assertEquals("Fine woven; natural color; stain spots", linen.getDescription());
    }

    @Test
    void setCostTest() {
        linen.setCost(9.99);
        assertEquals(9.99, linen.getCost());
    }

    @Test
    void toCSVTest() {
        assertEquals("000001, Linen, Fine woven; natural color, 18.99", linen.toCSV());
    }

    @Test
    void toJSONTest() {
        char DQ = '\u0022';
        assertEquals("{" + DQ + "ID" + DQ + ":" + DQ + "000001" + DQ + ", "
                + DQ + "name" + DQ + ":" + DQ + "Linen" + DQ + ", "
                + DQ + "description" + DQ + ":" + DQ + "Fine woven; natural color" + DQ + ", "
                + DQ + "cost" + DQ + ":" + DQ + "18.99" + DQ + "}", linen.toJSON());
    }

    @Test
    void toXMLTest() {
        assertEquals("<Product>" +
                                "<ID>000001</ID>" +
                                "<name>Linen</name>" +
                                "<description>Fine woven; natural color</description>" +
                                "<cost>18.99</cost>" +
                                "</Product>", linen.toXML());
    }
}