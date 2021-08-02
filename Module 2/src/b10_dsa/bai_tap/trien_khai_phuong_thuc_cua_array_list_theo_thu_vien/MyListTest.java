package b10_dsa.bai_tap.trien_khai_phuong_thuc_cua_array_list_theo_thu_vien;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>(5);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.printList();
        list.remove(2); // Xoa phan tu vi tri 2
        System.out.println("Xoá phần tử vị trí 2");
        MyList<Integer> list2 = (MyList<Integer>)list.clone();
        list2.printList();
        System.out.println("Vi trí phần tử 1: "+list2.indexOf(1)+", " +list2.contains(1));
        System.out.println("Thêm phần tử 10 vào vị trí 3");
        list2.add(3,10);
        list2.printList();
        list2.clear();
        list2.printList();



    }
}
