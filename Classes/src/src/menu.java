public class menu {
    private String[] menuArray;
    private int choice;

    public void setMenu(String... menuArray) {
        this.menuArray = menuArray;

        for(int i = 0; i < menuArray.length; i++)
        {
            System.out.println((i + 1) + ") " + menuArray[i]);
        }
    }

    public String[] getMenu() {
        return menuArray;
    }
}
