package project;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        ArrayList<Admin> AdminList = new ArrayList<>();
        ArrayList<Customer> CustomerList = new ArrayList<>();
        ArrayList<Dealer> DealerList = new ArrayList<>();
        ArrayList<Car> CarList = new ArrayList<>();
        ArrayList<Payment> PayList = new ArrayList<>();
        try {

            //test admin
            Admin admin1 = new Admin("admin", "admin", "Saif", "Banasree", "2022-3-60-045@std.ewubd.edu", "018392289**");
            Admin admin2 = new Admin("sristy", "1234", "Sristy", "Banasree", "2022-3-60-311@std.ewubd.edu", "0183324329**");
            Admin admin3 = new Admin("efte", "123456", "Efte", "Banasree", "2022-3-60-042@std.ewubd.edu", "0183324289**");
            AdminList.add(admin1);
            AdminList.add(admin2);
            AdminList.add(admin3);

            //test customer
            Customer cus1 = new Customer(11, "Muqaddisa", "Narayanganj", "2022-3-60-317@std.ewubd.edu", "01919426415");

            CustomerList.add(cus1);

            //test Dealer
            Dealer dealer1 = new Dealer(101, "Abrar", "Barishal", "coolboiabrar@gmail.com", "017232323**");
            Dealer dealer2 = new Dealer(102, "Redwan", "gazipur", "Homieboiredwan@gmail.com", "01342432323**");
            Dealer dealer3 = new Dealer(103, "shahmul", "kishorganj", "chololateboishahmul@gmail.com", "013422323**");
            Dealer dealer4 = new Dealer(104, "Ekra", "polligram", "onlyimo@gmail.com", "013232323**");
            DealerList.add(dealer1);
            DealerList.add(dealer2);
            DealerList.add(dealer3);
            DealerList.add(dealer4);

            //test Cars
            Car testcar1 = new Car(1, "Ferrari", "X", "Red", "sports", "diesel", 2022, 10000, dealer1);
            Car testcar2 = new Car(2, "Ferrari", "Y", "Blue", "sports", "diesel", 2023, 9500, dealer1);
            Car testcar3 = new Car(3, "Honda ", "Z", "Black", "family_car", "octane", 2021, 2500, dealer2);
            Car testcar4 = new Car(4, "Tesla", "X", "Black", "coupe", "electricity", 2022, 5000, dealer2);
            Car testcar5 = new Car(5, "Toyota", "Z", "blue", "sports", "diesel", 2023, 9500, dealer3);
            Car testcar6 = new Car(6, "McLaren ", "Y", "blue", "sports", "diesel", 2023, 9500, dealer3);
            Car testcar7 = new Car(7, "BMW", "Y", "White", "Antique", "petrol ", 2023, 6000, dealer4);
            Car testcar8 = new Car(8, "BMW", "Z", "White", "Limousine", "petrol ", 2023, 9500, dealer4);
            Car testcar9 = new Car(9, "Honda", "X", "blue", "sports", "Octane", 2023, 9500, dealer1);
            Car testcar10 = new Car(10, "Range_Rover", "Y", "Grey", "luxury", "diesel", 2023, 8500, dealer3);
            CarList.add(testcar1);
            CarList.add(testcar2);
            CarList.add(testcar3);
            CarList.add(testcar4);
            CarList.add(testcar5);
            CarList.add(testcar6);
            CarList.add(testcar7);
            CarList.add(testcar8);
            CarList.add(testcar9);
            CarList.add(testcar10);

            // MAIN MENU
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                       Welcome to KAKOLI Car Store   ");
            System.out.println("");
            System.out.println("                        price low, quality besht");
            System.out.println("-----------------------------------------------------------------------------");
            while (true) {

                System.out.println("\nEnter as:");
                System.out.println("1.Admin\n2.Customer\n3.Dealer");
                System.out.println("0.Exit");
                System.out.print("Enter- ");

                int x = inp.nextInt();
                if (x == 0) {
                    break;
                } //admin panel
                else if (x == 1) {
                    System.out.println("");
                    System.out.print("Enter Username: ");
                    String id = inp.next();
                    System.out.print("Enter Password: ");
                    String pass = inp.next();

                    if (logincheck(AdminList, id, pass)) {
                        System.out.println("\nlogin successful\n");

                        while (true) {
                            System.out.println("Welcome to Admin menu\n\nOptions:");

                            System.out.println("\n1.Manage Users\n2.Manage Cars\n3.Manage payments\n0.Exit");
                            System.out.print("Enter- ");
                            int x1 = inp.nextInt();
                            if (x1 == 0) {
                                break;
                            } else if (x1 == 1) {
                                while (true) {
                                    System.out.println("\n1.Add Admin\n2.Remove Admin\n3.Add Dealer\n4.Remove Dealer\n5.Add Customer\n6.Remove Customer\n7.Show all Users\n0.Exit");
                                    System.out.print("Enter- ");
                                    int x2 = inp.nextInt();
                                    if (x2 == 0) {
                                        break;
                                    } else if (x2 == 1) {
                                        System.out.print("Enter Username :");
                                        String un = inp.next();
                                        System.out.print("Enter Password :");
                                        String pas = inp.next();
                                        System.out.print("Enter Name :");
                                        String aname = inp.next();
                                        System.out.print("Enter Address :");
                                        String aadd = inp.next();
                                        System.out.print("Enter Email :");
                                        String amail = inp.next();
                                        System.out.print("Enter Phone :");
                                        String pn = inp.next();

                                        Admin ad = new Admin(un, pas, aname, aadd, amail, pn);
                                        AdminList.add(ad);
                                        System.out.println("\nSucessfully added\n");
                                    } else if (x2 == 2) {
                                        System.out.print("\nEnter username of admin to remove: ");
                                        String remAd = inp.next();
                                        int test = 1;
                                        for (int i = 0; i < AdminList.size(); i++) {
                                            if (AdminList.get(i).getUsername().equals(remAd)) {
                                                AdminList.remove(AdminList.get(i));
                                                test = 0;
                                                System.out.println("\nSuccesfully removed\n");
                                                break;
                                            }
                                        }
                                        if (test == 1) {
                                            System.out.println("\nNo Admin found\n");
                                        }
                                    } else if (x2 == 3) {

                                        System.out.print("Enter Dealer ID :");
                                        int Did = inp.nextInt();
                                        System.out.print("Enter Name :");
                                        String dname = inp.next();
                                        System.out.print("Enter Address :");
                                        String dadd = inp.next();
                                        System.out.print("Enter Email :");
                                        String dmail = inp.next();
                                        System.out.print("Enter Phone :");
                                        String pn = inp.next();

                                        Dealer ad = new Dealer(Did, dname, dadd, dmail, pn);
                                        DealerList.add(ad);
                                        System.out.println("\nSucessfully added\n");
                                    } else if (x2 == 4) {
                                        System.out.print("\nEnter Dealer ID to remove: ");
                                        int Did = inp.nextInt();
                                        int test = 1;
                                        for (int i = 0; i < DealerList.size(); i++) {
                                            if (DealerList.get(i).getDeID() == Did) {
                                                DealerList.remove(DealerList.get(i));
                                                test = 0;
                                                System.out.println("\nSuccesfully removed\n");
                                                break;
                                            }
                                        }
                                        if (test == 1) {
                                            System.out.println("\nNo Dealer found\n");
                                        }
                                    } else if (x2 == 5) {
                                        System.out.print("Enter Customer ID :");
                                        int Cid = inp.nextInt();
                                        System.out.print("Enter Name :");
                                        String cname = inp.next();
                                        System.out.print("Enter Address :");
                                        String cadd = inp.next();
                                        System.out.print("Enter Email :");
                                        String cmail = inp.next();
                                        System.out.print("Enter Phone :");
                                        String pn = inp.next();

                                        Customer cus = new Customer(Cid, cname, cadd, cmail, pn);
                                        CustomerList.add(cus);
                                        System.out.println("\nSucessfully added\n");
                                    } else if (x2 == 6) {
                                        System.out.print("\nEnter Customer ID to remove: ");
                                        int Cid = inp.nextInt();
                                        int test = 1;
                                        for (int i = 0; i < CustomerList.size(); i++) {
                                            if (CustomerList.get(i).getCusID() == Cid) {
                                                CustomerList.remove(CustomerList.get(i));
                                                test = 0;
                                                System.out.println("\nSuccesfully removed\n");
                                                break;
                                            }
                                        }
                                        if (test == 1) {
                                            System.out.println("\nNo Customer found\n");
                                        }
                                    } else if (x2 == 7) {
                                        System.out.println("\nAll admins: \n");
                                        for (int i = 0; i < AdminList.size(); i++) {
                                            System.out.println(AdminList.get(i));
                                            System.out.println("");
                                        }
                                        System.out.println("\nAll Dealers: \n");
                                        for (int i = 0; i < DealerList.size(); i++) {
                                            System.out.println(DealerList.get(i));
                                            DealerList.get(i).printAllCars();
                                            System.out.println("");
                                        }
                                        System.out.println("\nAll Customers: \n");
                                        for (int i = 0; i < CustomerList.size(); i++) {
                                            System.out.println(CustomerList.get(i));
                                            System.out.println("");
                                        }

                                    }
                                }
                            } else if (x1 == 2) {
                                while (true) {
                                    System.out.println("\n1.Add Cars\n2.Remove Car\n3.Veiw All Cars\n4.Update Car Info\n0.Exit");
                                    System.out.print("Enter- ");
                                    int x3 = inp.nextInt();
                                    if (x3 == 0) {
                                        break;
                                    }
                                    if (x3 == 1) {
                                        System.out.print("Enter CarID: ");
                                        int cid = inp.nextInt();
                                        System.out.print("Enter Brand name: ");
                                        String brand = inp.next();
                                        System.out.print("Enter Model: ");
                                        String model = inp.next();
                                        System.out.print("Enter Color: ");
                                        String color = inp.next();
                                        System.out.print("Enter Car Type: ");
                                        String ctype = inp.next();
                                        System.out.print("Enter Fuel Type: ");
                                        String ftype = inp.next();
                                        System.out.print("Enter Year: ");
                                        int year = inp.nextInt();
                                        System.out.print("Enter Price: ");
                                        double price = inp.nextDouble();

                                        Car carob = new Car(cid, brand, model, color, ctype, ftype, year, price);
                                        CarList.add(carob);
                                        System.out.println("\nSucessfully added\n");
                                    } else if (x3 == 2) {
                                        System.out.print("\nEnter Car ID to remove: ");
                                        int Cid = inp.nextInt();
                                        int test = 1;
                                        for (int i = 0; i < CarList.size(); i++) {
                                            if (CarList.get(i).getCarID() == Cid) {
                                                CarList.remove(CarList.get(i));
                                                test = 0;
                                                System.out.println("\nSuccesfully removed\n");
                                                break;
                                            }
                                        }
                                        if (test == 1) {
                                            System.out.println("\nNo Car found\n");
                                        }

                                    } else if (x3 == 3) {
                                        System.out.println("\nAll cars info: ");
                                        for (int i = 0; i < CarList.size(); i++) {
                                            System.out.println(CarList.get(i));
                                            System.out.println("");
                                        }
                                    } else if (x3 == 4) {
                                        System.out.println("\nUpdate Car Price");
                                        System.out.print("\nEnter the Car ID to update: ");
                                        int Cid = inp.nextInt();
                                        int test = 1;
                                        for (int i = 0; i < CarList.size(); i++) {
                                            if (CarList.get(i).getCarID() == Cid) {
                                                System.out.print("\nEnter the new Price: ");
                                                double pr = inp.nextDouble();
                                                CarList.get(i).setPrice(pr);
                                                test = 0;
                                                System.out.println("\nSuccesfully Updated\n");
                                                break;
                                            }
                                        }
                                        if (test == 1) {
                                            System.out.println("\nNo Car found\n");
                                        }
                                    }
                                }

                            } else if (x1 == 3) {
                                while (true) {
                                    System.out.println("\n1.View All Payments\n2.Total Balance\n0.Exit");
                                    System.out.print("Enter- ");
                                    int x4 = inp.nextInt();
                                    if (x4 == 0) {
                                        break;
                                    } else if (x4 == 1) {
                                        int a = Payment.getPaymentID();
                                        if (a != 0) {
                                            for (int i = 0; i < PayList.size(); i++) {
                                                System.out.println(PayList.get(i));
                                                System.out.println("");
                                            }
                                        } else {
                                            System.out.println("\nNo payment information found\n");
                                        }
                                    } else if (x4 == 2) {
                                        double totalbalance = 0;
                                        for (int i = 0; i < PayList.size(); i++) {
                                            totalbalance = totalbalance + PayList.get(i).getAmount();

                                        }
                                        System.out.println("\nTotal sell balance is: " + totalbalance + "$\n");

                                    }
                                }
                            }

                        }
                    } else {
                        System.out.println("\nLogin failed\n");
                    }
                } else if (x == 2) {
                    int breaker = 0;
                    while (true && breaker == 0) {

                        System.out.print("\nEnter your customer ID: ");
                        int cid = inp.nextInt();
                        Customer cus = null;
                        if (cuscheck(CustomerList, cid)) {

                            for (int i = 0; i < CustomerList.size(); i++) {
                                if (CustomerList.get(i).getCusID() == cid) {
                                    cus = CustomerList.get(i);
                                }
                            }
                            while (true) {
                                System.out.println("\nHello! " + cus.getName() + "\nWelcome to our store!");
                                System.out.println("\n1.Buy Car\n2.View All Orders\n3.Remove from Order\n4.make payment\n5.View Payment Details\n0.Exit");
                                System.out.print("Enter- ");
                                int x1 = inp.nextInt();
                                if (x1 == 0) {
                                    breaker = 1;
                                    break;
                                } else if (x1 == 1) {
                                    while (true) {
                                        System.out.println("\n1.View All Cars\n2.Search Car\n0.Exit");
                                        System.out.print("Enter- ");
                                        int x2 = inp.nextInt();
                                        if (x2 == 0) {
                                            breaker = 1;
                                            break;
                                        }
                                        if (x2 == 1) {
                                            System.out.println("\nAll Available cars: ");
                                            for (int i = 0; i < CarList.size(); i++) {
                                                System.out.println(CarList.get(i));
                                                System.out.println("");
                                            }
                                            System.out.print("\nEnter the CarID to add to order (or enter 0 to exit): ");
                                            int carid = inp.nextInt();
                                            if (carid != 0) {
                                                Car car1;
                                                int found = 0;
                                                for (int i = 0; i < CarList.size(); i++) {
                                                    if (CarList.get(i).getCarID() == carid) {
                                                        car1 = CarList.get(i);
                                                        cus.buyCar(car1);
                                                        System.out.println("\nSuccesfully Added to OrderList\n");
                                                        found = 1;
                                                        breaker = 1;
                                                        break;
                                                    }
                                                }
                                                if (found == 0) {
                                                    breaker = 1;
                                                    System.out.println("\nCar not found\n");
                                                }

                                            } else if (carid == 0) {
                                                breaker = 1;
                                            }
                                        } else if (x2 == 2) {
                                            System.out.println("\nSearch Car by \n1.car id\n2.model\n3.brand\n4.year\n0.Exit");
                                            System.out.print("Enter- ");
                                            int x3 = inp.nextInt();
                                            if (x3 == 0) {
                                                break;
                                            } else if (x3 == 1) {
                                                int found = 0;
                                                System.out.print("Enter car ID: ");
                                                int carid = inp.nextInt();
                                                for (int i = 0; i < CarList.size(); i++) {
                                                    if (CarList.get(i).getCarID() == carid) {
                                                        System.out.println(CarList.get(i));
                                                        found = 1;
                                                    }
                                                }
                                                if (found == 0) {
                                                    breaker = 1;
                                                    System.out.println("\nCar not found\n");
                                                }

                                            } else if (x3 == 2) {
                                                int found = 0;
                                                System.out.print("Enter car Model: ");
                                                String carm = inp.next();
                                                for (int i = 0; i < CarList.size(); i++) {
                                                    if (CarList.get(i).getModel().equals(carm)) {
                                                        System.out.println(CarList.get(i));
                                                        found = 1;
                                                    }
                                                }
                                                if (found == 0) {
                                                    breaker = 1;
                                                    System.out.println("\nCar not found\n");
                                                } else if (found == 1) {
                                                    System.out.print("\nEnter the CarID to add to order (or enter 0 to exit): ");
                                                    int carid = inp.nextInt();
                                                    if (carid != 0) {
                                                        Car car1;
                                                        int found1 = 0;
                                                        for (int i = 0; i < CarList.size(); i++) {
                                                            if (CarList.get(i).getCarID() == carid) {
                                                                car1 = CarList.get(i);
                                                                cus.buyCar(car1);
                                                                System.out.println("\nSuccesfully Added to OrderList\n");
                                                                found1 = 1;
                                                                breaker = 1;
                                                                break;
                                                            }
                                                        }
                                                        if (found1 == 0) {
                                                            breaker = 1;
                                                            System.out.println("\nCar not found\n");
                                                        }

                                                    } else if (carid == 0) {
                                                        breaker = 1;
                                                    }
                                                }
                                            } else if (x3 == 3) {
                                                int found = 0;
                                                System.out.print("Enter car Brand: ");
                                                String carb = inp.next();
                                                for (int i = 0; i < CarList.size(); i++) {
                                                    if (CarList.get(i).getBrand().equals(carb)) {
                                                        System.out.println(CarList.get(i));
                                                        found = 1;
                                                    }
                                                }
                                                if (found == 0) {
                                                    breaker = 1;
                                                    System.out.println("\nCar not found\n");
                                                } else if (found == 1) {
                                                    System.out.print("\nEnter the CarID to add to order (or enter 0 to exit): ");
                                                    int carid = inp.nextInt();
                                                    if (carid != 0) {
                                                        Car car1;
                                                        int found1 = 0;
                                                        for (int i = 0; i < CarList.size(); i++) {
                                                            if (CarList.get(i).getCarID() == carid) {
                                                                car1 = CarList.get(i);
                                                                cus.buyCar(car1);
                                                                System.out.println("\nSuccesfully Added to OrderList\n");
                                                                found1 = 1;
                                                                breaker = 1;
                                                                break;
                                                            }
                                                        }
                                                        if (found1 == 0) {
                                                            breaker = 1;
                                                            System.out.println("\nCar not found\n");
                                                        }

                                                    } else if (carid == 0) {
                                                        breaker = 1;
                                                    }
                                                }
                                            } else if (x3 == 4) {
                                                int found = 0;
                                                System.out.print("Enter year: ");
                                                int cary = inp.nextInt();
                                                for (int i = 0; i < CarList.size(); i++) {
                                                    if (CarList.get(i).getYear() == cary) {
                                                        System.out.println(CarList.get(i));
                                                        found = 1;
                                                    }
                                                }
                                                if (found == 0) {
                                                    breaker = 1;
                                                    System.out.println("\nCar not found\n");
                                                } else if (found == 1) {
                                                    System.out.print("\nEnter the CarID to add to order (or enter 0 to exit): ");
                                                    int carid = inp.nextInt();
                                                    if (carid != 0) {
                                                        Car car1;
                                                        int found1 = 0;
                                                        for (int i = 0; i < CarList.size(); i++) {
                                                            if (CarList.get(i).getCarID() == carid) {
                                                                car1 = CarList.get(i);
                                                                cus.buyCar(car1);
                                                                System.out.println("\nSuccesfully Added to OrderList\n");
                                                                found1 = 1;
                                                                breaker = 1;
                                                                break;
                                                            }
                                                        }
                                                        if (found1 == 0) {
                                                            breaker = 1;
                                                            System.out.println("\nCar not found\n");
                                                        }

                                                    } else if (carid == 0) {
                                                        breaker = 1;
                                                    }
                                                }
                                            }

                                        }
                                    }
                                } else if (x1 == 2) {
                                    cus.printAllOrderedCars();
                                } else if (x1 == 3) {
                                    System.out.print("\nEnter the CarID to remove from order: ");
                                    int carid = inp.nextInt();
                                    if (carid != 0) {
                                        Car car1;
                                        int found = 0;
                                        for (int i = 0; i < CarList.size(); i++) {
                                            if (CarList.get(i).getCarID() == carid) {
                                                car1 = CarList.get(i);
                                                cus.cancelOrder(car1);
                                                System.out.println("\nSuccesfully removed from the OrderList\n");
                                                found = 1;
                                                breaker = 1;
                                                break;
                                            }
                                        }
                                        if (found == 0) {
                                            breaker = 1;
                                            System.out.println("\nCar not found\n");
                                        }

                                    } else if (carid == 0) {
                                        breaker = 1;
                                    }
                                } else if (x1 == 4) {
                                    double total = 0;
                                    for (int i = 0; i < cus.carList.size(); i++) {
                                        total = total + cus.carList.get(i).getPrice();
                                    }
                                    System.out.println("\nTotal bill: " + total + "$");
                                    System.out.print("Press 1 to confirm payment: ");
                                    int c = inp.nextInt();
                                    if (c == 1) {
                                        Payment ps = new Payment(total, cus);
                                        cus.setPaymentdetails(ps);
                                        PayList.add(ps);
                                        System.out.println("\nPayment Successful\n");
                                    } else {
                                        System.out.println("\nPayment failed\n");
                                    }
                                } else if (x1 == 5) {
                                    System.out.println("\npayment details:");
                                    if (cus.isPaymentStatus()) {
                                        System.out.println(cus.getPaymentdetails());

                                    } else {
                                        System.out.println("\nNo Payment information found.\n");
                                    }

                                }
                            }
                        } else {
                            System.out.println("No Customer found\n");
                            break;
                        }

                    }

                } else if (x == 3) {

                    int breaker = 0;
                    while (true && breaker == 0) {

                        System.out.print("\nEnter your Dealer ID: ");
                        int did = inp.nextInt();
                        Dealer dealer = null;
                        if (dealcheck(DealerList, did)) {

                            for (int i = 0; i < DealerList.size(); i++) {
                                if (DealerList.get(i).getDeID() == did) {
                                    dealer = DealerList.get(i);
                                }
                            }
                            System.out.println("\nHello! " + dealer.getName() + "\nWelcome !");
                            System.out.println("\n1.Add Car\n2.Remove Car\n0.Exit");
                            System.out.print("Enter- ");
                            int x1 = inp.nextInt();
                            if (x1 == 0) {
                                break;
                            }
                            if (x1 == 1) {
                                System.out.print("Enter CarID: ");
                                int cid = inp.nextInt();
                                System.out.print("Enter Brand name: ");
                                String brand = inp.next();
                                System.out.print("Enter Model: ");
                                String model = inp.next();
                                System.out.print("Enter Color: ");
                                String color = inp.next();
                                System.out.print("Enter Car Type: ");
                                String ctype = inp.next();
                                System.out.print("Enter Fuel Type: ");
                                String ftype = inp.next();
                                System.out.print("Enter Year: ");
                                int year = inp.nextInt();
                                System.out.print("Enter Price: ");
                                double price = inp.nextDouble();

                                Car carob = new Car(cid, brand, model, color, ctype, ftype, year, price, dealer);

                                CarList.add(carob);
                                dealer.carList.add(carob);
                                System.out.println("\nSucessfully added\n");
                            }
                            if (x1 == 2) {
                                System.out.print("\nEnter Car ID to remove: ");
                                int Cid = inp.nextInt();
                                int test = 1;
                                for (int i = 0; i < dealer.carList.size(); i++) {
                                    if (dealer.carList.get(i).getCarID() == Cid) {
                                        dealer.carList.remove(dealer.carList.get(i));
                                        CustomerList.remove(dealer.carList.get(i));
                                        test = 0;
                                        System.out.println("\nSuccesfully removed\n");
                                        break;
                                    }
                                }
                                if (test == 1) {
                                    System.out.println("\nNo Car found\n");
                                }

                            }
                        } else {
                            System.out.println("\nNo Dealer found\n");
                            break;
                        }
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            File dir = new File("All Data");
            dir.mkdir();
            String path = dir.getAbsolutePath();
            File file = new File(path + "/All Cars.txt");
            try (PrintWriter w = new PrintWriter(file)) {
                for (int i = 0; i < CarList.size(); i++) {
                    w.println(CarList.get(i).toString1());
                    w.println("");
                    w.println("");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            File file1 = new File(path + "/All Dealers.txt");
            try (PrintWriter w = new PrintWriter(file1)) {
                for (int i = 0; i < DealerList.size(); i++) {
                    w.println(DealerList.get(i).toString1());
                    //w.println(DealerList.get(i).printAllCars());
                    w.println("");
                    w.println("");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            File file2 = new File(path + "/All Customers.txt");
            try (PrintWriter w = new PrintWriter(file2)) {
                for (int i = 0; i < CustomerList.size(); i++) {
                    w.println(CustomerList.get(i).toString1());
                    w.println("");
                    w.println("");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            File file4 = new File(path + "/All Admins.txt");
            try (PrintWriter w = new PrintWriter(file4)) {
                for (int i = 0; i < AdminList.size(); i++) {
                    w.println(AdminList.get(i));
                    w.println("");
                    w.println("");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            File file3 = new File(path + "/All Payments.txt");
            try (PrintWriter w = new PrintWriter(file3)) {

                int a = Payment.getPaymentID();
                if (a != 0) {
                    for (int i = 0; i < PayList.size(); i++) {
                        w.println(PayList.get(i));
                        w.println("");
                        w.println("");
                    }
                } else {
                    w.println("\nNo payment information found\n");
                }

                double totalbalance = 0;
                for (int i = 0; i < PayList.size(); i++) {
                    totalbalance = totalbalance + PayList.get(i).getAmount();

                }
                w.println("Total balance of the Company is:" + totalbalance + "$");

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static boolean logincheck(ArrayList<Admin> adminList, String un, String pass) {
        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getUsername().equals(un)) {
                if (adminList.get(i).getPassword().equals(pass)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cuscheck(ArrayList<Customer> cusList, int id) {
        for (int i = 0; i < cusList.size(); i++) {
            if (cusList.get(i).getCusID() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean dealcheck(ArrayList<Dealer> dList, int id) {
        for (int i = 0; i < dList.size(); i++) {
            if (dList.get(i).getDeID() == id) {
                return true;
            }
        }
        return false;
    }

}
