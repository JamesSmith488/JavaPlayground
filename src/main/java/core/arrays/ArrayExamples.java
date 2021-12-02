package core.arrays;

public class ArrayExamples {

    private int[] menuItems = {1,2,3,4,5};

    public ArrayExamples() {
    }

    public void setMenuItemsValue(int indexOfVal, int val){
        if (val>0 && val<6){
            menuItems[indexOfVal] = val;
        }
    }

    public int getMenuItemsValue(int indexOfVal){
        return  menuItems[indexOfVal];
    }

    public void swapMenuItems(int indexNum1, int indexNum2){
        int valSwapHolder = menuItems[indexNum2];
        setMenuItemsValue(indexNum2,menuItems[indexNum1]);
        setMenuItemsValue(indexNum1,valSwapHolder);
    }

    public int size(){
        return menuItems.length;
    }

}
