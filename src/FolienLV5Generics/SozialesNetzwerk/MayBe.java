package FolienLV5Generics;

public class MayBe<T> {
    private T value;
    private AccessRoles neededAccessRole;


    public MayBe(T value) {
        this.value = value;
      //  this.neededAccessRole = neededAccessRole;
    }

    public void deliverValue(AccessRoles accesser){
        switch (accesser){
            case Platform:
            case Self:
                System.out.println(value);
                break;
            case BestFriend:
            case externalUser:
                System.out.println("forbidden");
                break;
            default:
                System.out.println("not allowed");
        }
    }
}
