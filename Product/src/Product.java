public class Product {
    private String ID;
    private String name;
    private String description;
    double cost;


    /**  getCost
     * Gets the cost of a product from a data record
     * @return Returns the cost of the product
     */
    public double getCost() {
        return cost;
    }

    /**  setCost
     * Changes a product's cost to an inputted value
     * @param cost is what the cost is supposed to change to
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**  getID
     * Gets a product's ID from a data record
     * @return Returns the product's ID
     */
    public String getID() {
        return ID;
    }

    /**  setID
     * Changes a product's ID to an inputted value
     * @param ID is what the ID is supposed to change to
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**  getDescription
     * Gets a product's description from a data record
     * @return Returns the product's description
     */
    public String getDescription() {
        return description;
    }

    /**  setDescription
     * Changes a product's description to an inputted String value
     * @param description is what the product's description is supposed to change to
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**  getName
     * Gets a product's name from a data record
     * @return Returns the product's name
     */
    public String getName() {
        return name;
    }

    /**
     * Changes a product's name to an inputted String value
     * @param name is what the product's name is supposed to change to
     */
    public void setName(String name) {
        this.name = name;
    }

    /**  toString
     * Converts product data into a human-readable String
     * @return Returns a human-readable string of product data
     */
    @Override
    public String toString() {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }

    /**  Product
     * Creates a Product data record based on an inputted
     * ID, name, description, and cost.
     * @param ID is the product's ID number
     * @param name is the product's name
     * @param description is the product's description
     * @param cost is the product's cost
     */
    public Product(String ID, String name, String description, double cost) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    /** toCSV
     * Takes data from a Product arraylist and
     * inputs it into a comma-separated value.
     * @return Returns a csv record with the product's
     * ID, name, description, and cost.
     */
    public String toCSV() {
        return getID() + ", " + getName() + ", " + getDescription() + ", " + getCost();
    }

    /**  toJSON
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

    /**  toXML
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