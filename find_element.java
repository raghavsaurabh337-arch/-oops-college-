
class find_element {

    public static void main(String args[]) {
        int arr[] = {3, 43, 65, 87, 90};
        int i;
        int n = 625;
        for (i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("find tha number: "+arr[i]);
                break;
            }
        }
        if(i==arr.length){
            System.out.println("do not find"+n);
        }

    }
}

