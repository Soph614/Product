public class Product {
    private String ID;
    private String name;
    private String description;
    double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Product(String ID, String name, String description, double cost) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }


    /** toCSV()
     * Takes data from a Product arraylist and
     * inputs it into a comma-separated value.
     * @return Returns a csv record with the product's
     * ID, name, description, and cost.
     */

    public String toCSV() {
        return getID() + ", " + getName() + ", " + getDescription() + ", " + getCost();
    }


    /**  toJSON()
     * Converts an arraylist of product data into a JSON data string
     * @return Returns a JSON data String with product data
     */

    public String toJSON() {
        String returnString = "";
        char DQ = '\u0022';
        returnString = "{" + DQ + "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        returnString += " " + DQ + "name" + DQ + ":" + DQ + this.name + DQ + ",";
        returnString += " " + DQ + "description" + DQ + ":" + DQ + this.description + DQ + ",";
        returnString += " " + DQ + "cost" + DQ + ":" + DQ + this.cost + DQ + "}";

        return returnString;
    }

    /**  toXML()
     * Converts an arraylist of product data into an XML data string
     * @return Returns an XML data String with product data
     */

    public String toXML() {
        String returnString = "";
        returnString = "<Product>";
        returnString += "<ID>" + this.ID + "</ID>";
        returnString += "<name>" + this.name + "</name>";
        returnString += "<description>" + this.description + "</description>";
        returnString += "<cost>" + this.cost + "</cost></Product>";

        return returnString;
    }
}