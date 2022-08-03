package FuramaResort.service.impl;

import FuramaResort.exception.DuplicateIDException;
import FuramaResort.model.Facility.Facility;
import FuramaResort.model.Facility.House;
import FuramaResort.model.Facility.Room;
import FuramaResort.model.Facility.Villa;
import FuramaResort.service.IFacilityService;
import FuramaResort.utils.ReadWriteFacilityFile;

import java.util.Map;
import java.util.Scanner;

public class FacilityService<E> implements IFacilityService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH_HOUSE = "FuramaResort/data/House.csv";
    private static final String PATH_VILLA = "FuramaResort/data/Villa.csv";
    private static final String PATH_ROOM = "FuramaResort/data/Room.csv";

    public void inputFacility(Facility facility) {
        String serviceId;
        while (true) {
            try {
                System.out.print("Nhập mã dịch vụ: ");
                serviceId = SCANNER.nextLine();
                if (facility instanceof Villa) {
                    if (!serviceId.matches("^SVVL-\\d{4}$")) {
                        throw new DuplicateIDException("vui lòng nhập theo định dạng SVVL-YYYY (với Y là số từ 0-9)");
                    }
                } else if (facility instanceof House) {
                    if (!serviceId.matches("^SVHO-\\d{4}$")) {
                        throw new DuplicateIDException("vui lòng nhập theo định dạng SVVL-YYYY (với Y là số từ 0-9)");

                    }
                } else if (facility instanceof Room) {
                    if (!serviceId.matches("^SVRO-\\d{4}$")) {
                        throw new DuplicateIDException("vui lòng nhập theo định dạng SVVL-YYYY (với Y là số từ 0-9)");
                    }
                }
                facility.setServiceCode(serviceId);
                break;
            }catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }
        String serviceName;
        while (true) {
            try {
                System.out.print("Nhập tên dịch vụ: ");
                serviceName = SCANNER.nextLine();
                if (!serviceName.matches("^(Villa|House|Room)$")) {
                    throw new DuplicateIDException("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường!");
                }
                facility.setServiceName(serviceName);
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        double area;
        while (true) {
            try {
                System.out.print("Nhập diện tích sử dụng: ");
                area = Double.parseDouble(SCANNER.nextLine());
                if (area <= 30) {
                    throw new DuplicateIDException("Diện tích sử dụng phải là số thực lớn hơn 30m2!");
                }
                facility.setUsableArea(area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        double rentalCosts;
        while (true) {
            try {
                System.out.print("Nhập chi phí thuê: ");
                rentalCosts = Double.parseDouble(SCANNER.nextLine());
                if (rentalCosts <= 0) {
                    throw new DuplicateIDException("Chi phí thuê phải là số dương!");
                }
                facility.setCostRent(rentalCosts);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        int maximumNumberOfPeople;
        while (true) {
            try {
                System.out.print("Nhập số người tối đa: ");
                maximumNumberOfPeople = Integer.parseInt(SCANNER.nextLine());
                if (maximumNumberOfPeople <= 0 || maximumNumberOfPeople >= 20) {
                    throw new DuplicateIDException("Số lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20!");
                }
                facility.setMaximumNumberOfPeople(maximumNumberOfPeople);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        String rentalType;
        while (true) {
            try {
                System.out.print("Nhập vào kiểu thuê: ");
                rentalType = SCANNER.nextLine();
                if (!rentalType.matches("^(Ngày|Tháng|Năm)$")) {
                    throw new DuplicateIDException("Nhập lại kiểu thuê  ");
                }
                facility.setRentalType(rentalType);
                break;
            } catch (DuplicateIDException e) {
                System.err.println(e.getMessage());
            }
        }

    }

    @Override
    public void displayFacility() {
        System.out.println("\nDanh sách cơ sở: ");

        System.out.println("1. Danh sách biệt thự: ");
        Map<Facility, Integer> villaList = ReadWriteFacilityFile.readFacilityFile(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            System.out.println(villa + " | Số lần sử dụng: " + villaList.get(villa));
        }

        System.out.println("2. Danh sách nhà: ");
        Map<Facility, Integer> houseList = ReadWriteFacilityFile.readFacilityFile(PATH_HOUSE);
        for (Facility house : houseList.keySet()) {
            System.out.println(house + " | Số lần sử dụng: " + houseList.get(house));
        }

        System.out.println("3. Danh sách phòng: ");
        Map<Facility, Integer> roomList = ReadWriteFacilityFile.readFacilityFile(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            System.out.println(room + " | Số lần sử dụng: " + roomList.get(room));
        }


    }

    @Override
    public void addFacility() {
        while (true) {
            System.out.println("THÊM MỚI CƠ SỞ:\n" +
                    "1. Thêm mới biệt thự.\n" +
                    "2. Thêm mới nhà.\n" +
                    "3. Thêm mới phòng.\n" +
                    "4. Trở về menu quản lý cơ sở.");
            int choice = 0;
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choice = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
            switch (choice) {
                case 1:
                    Map<Facility, Integer> villaList = ReadWriteFacilityFile.readFacilityFile(PATH_VILLA);
                    Villa villa = new Villa();
                    inputFacility(villa);

                    String roomStandardVilla;
                    while (true) {
                        try {
                            System.out.print("Nhập tiêu chuẩn phòng: ");
                            roomStandardVilla = SCANNER.nextLine();
                            if (!roomStandardVilla.matches("^[A-Z][a-z]+( [a-z]+)*$")) {
                                throw new DuplicateIDException("Tiêu chuẩn phòng phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường!");
                            }
                            villa.setRoomStandard(roomStandardVilla);
                            break;
                        } catch (DuplicateIDException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    double poolArea;
                    while (true) {
                        try {
                            System.out.print("Nhập diện tích hồ bơi: ");
                            poolArea = Double.parseDouble(SCANNER.nextLine());
                            if (poolArea <= 30) {
                                throw new DuplicateIDException("Diện tích hồ bơi phải là số thực lớn hơn 30m2!");
                            }
                            villa.setPoolArea(poolArea);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        } catch (DuplicateIDException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    int numberOfFloorsVilla;
                    while (true) {
                        try {
                            System.out.print("Nhập số tầng: ");
                            numberOfFloorsVilla = Integer.parseInt(SCANNER.nextLine());
                            if (numberOfFloorsVilla <= 0) {
                                throw new DuplicateIDException("Số tầng phải là số nguyên dương!");
                            }
                            villa.setNumberOfFloors(numberOfFloorsVilla);

                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        } catch (DuplicateIDException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    villaList.put(villa, 0);
                    ReadWriteFacilityFile.writeFacilityFile(PATH_VILLA, villaList);
                    System.out.println("Thêm mới Biệt thự thành công!");
                    break;
                case 2:
                    Map<Facility, Integer> houseList = ReadWriteFacilityFile.readFacilityFile(PATH_HOUSE);
                    House house = new House();
                    inputFacility(house);

                    String roomStandardHouse;
                    while (true) {
                        try {
                            System.out.print("Nhập tiêu chuẩn phòng: ");
                            roomStandardHouse = SCANNER.nextLine();
                            if (!roomStandardHouse.matches("^[A-Z][a-z]+( [a-z]+)*$")) {
                                throw new DuplicateIDException("Tiêu chuẩn phòng phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường!");
                            }
                            house.setRoomStandard(roomStandardHouse);
                            break;
                        } catch (DuplicateIDException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    int numberOfFloorsHouse;
                    while (true) {
                        try {
                            System.out.print("Nhập số tầng: ");
                            numberOfFloorsHouse = Integer.parseInt(SCANNER.nextLine());
                            if (numberOfFloorsHouse <= 0) {
                                throw new DuplicateIDException("Số tầng phải là số nguyên dương!");
                            }
                            house.setNumberOfFloorsHouse(numberOfFloorsHouse);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        } catch (DuplicateIDException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    houseList.put(house, 0);
                    ReadWriteFacilityFile.writeFacilityFile(PATH_HOUSE, houseList);
                    System.out.println("Thêm mới Nhà thành công!");
                    break;
                case 3:
                    Map<Facility, Integer> roomList = ReadWriteFacilityFile.readFacilityFile(PATH_ROOM);
                    Room room = new Room();
                    inputFacility(room);

                    System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
                    String freeServiceIncluded = SCANNER.nextLine();
                    room.setFreeServiceIncluded(freeServiceIncluded);
                    roomList.put(room, 0);
                    ReadWriteFacilityFile.writeFacilityFile(PATH_ROOM, roomList);
                    System.out.println("Thêm mới Phòng thành công!");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }


        }

    }

    @Override
    public void displayFacilityMaitenance() {
        System.out.println("\nDanh sách bảo trì cơ sở: ");
        System.out.println("1. Danh sách bảo trì biệt thự: ");
        Map<Facility, Integer> villaList = ReadWriteFacilityFile.readFacilityFile(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            if (villaList.get(villa) > 4) {
                System.out.println(villa + " | Số lần sử dụng: " + villaList.get(villa));
            }
        }

        System.out.println("2. Danh sách bảo trì nhà: ");
        Map<Facility, Integer> houseList = ReadWriteFacilityFile.readFacilityFile(PATH_HOUSE);
        for (Facility house : houseList.keySet()) {
            if (houseList.get(house) > 4) {
                System.out.println(house + " | Số lần sử dụng: " + houseList.get(house));
            }
        }

        System.out.println("3. Danh sách bảo trì phòng: ");
        Map<Facility, Integer> roomList = ReadWriteFacilityFile.readFacilityFile(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            if (roomList.get(room) > 4) {
                System.out.println(room + " | Số lần sử dụng: " + roomList.get(room));
            }
        }

    }
}