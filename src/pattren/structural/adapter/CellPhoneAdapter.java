package pattren.structural.adapter;

public class CellPhoneAdapter implements CellPhone {

    private FriendCellPhone friendCellPhone;

    public CellPhoneAdapter(FriendCellPhone friendCellPhone) {
        this.friendCellPhone = friendCellPhone;
    }

    @Override
    public void call() {
        this.friendCellPhone.ring();
    }
}
