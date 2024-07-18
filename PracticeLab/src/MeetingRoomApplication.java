public class MeetingRoomApplication {
    public static void main(String[] args) {
        MeetingRoom room1 = new MeetingRoom(101, 50,5, true);
        room1.setDeviceId("50");
        room1.setDeviceAccountId("ABCDEF");

        Booking booking1 = new Booking(123, "June24", "12PM", 45, room1);
        System.out.println("Booking Details:");
        System.out.println("Employee ID: " + booking1.getEmployeeId());
        System.out.println("Meeting date: " + booking1.getMeetingDate());
        System.out.println("Meeting Time: " + booking1.getMeetingTime());
        System.out.println("Duration: " + booking1.getDuration() + "min");
        System.out.println("Room ID: " + booking1.getMeetingRoom().getRoomId());
        System.out.println("Capacity: " + booking1.getMeetingRoom().getCapacity());



    }
}

class MeetingRoom {
    private int roomId;
    private int capacity;
    private int floor;
    private boolean ZoomFacility;
    private String DeviceId;
    private String DeviceAccountId;

    public MeetingRoom(int roomId, int capacity, int floor, boolean ZoomFacility, String DeviceId, String DeviceAccountId) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
        this.ZoomFacility = ZoomFacility;
        this.DeviceId = null;
        this.DeviceAccountId = null;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean ZoomFacility() {
        return ZoomFacility;
    }

    public void setZoomFacility(boolean ZoomFacility) {
        this.ZoomFacility = ZoomFacility;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public String getDeviceAccountId() {
        return DeviceAccountId;
    }

    public void setDeviceAccountId(String DeviceAccountId) {
        this.DeviceAccountId = DeviceAccountId;
    }
}
    class Booking {
        private int employeeId;
        private String meetingDate;
        private String meetingTime;
        private int duration;
        private MeetingRoom meetingRoom;

        public Booking(int employeeId, String meetingDate, String meetingTime, int duration, MeetingRoom meetingRoom) {
            this.employeeId = employeeId;
            this.meetingDate = meetingDate;
            this.meetingTime = meetingTime;
            this.duration = duration;
            this.meetingRoom = meetingRoom;
        }
        public int getEmployeeId() {
            return employeeId;
        }
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }
        public String getMeetingDate() {
            this.meetingDate = meetingDate;
        }
        public void setMeetingDate(String meetingDate) {
            this.meetingDate = meetingDate;
        }
        public String getMeetingTime() {
            return meetingTime;
        }
        public void setMeetingTime(String meetingTime) {
            this.meetingTime = meetingTime;
        }
        public int getDuration(){
            return duration;
        }
        public void setDuration(int duration) {
            this.duration = duration;
        }
        public MeetingRoom getMeetingRoom() {
            return meetingRoom;
        }
        public void setMeetingRoom(MeetingRoom meetingRoom) {
            this.meetingRoom = meetingRoom;
        }

    }