package java2_Advanced.BaiTapNgay27_3_2020.OnLuyenFile_MultiThread.Bai2;

import java.io.*;
import java.util.*;

public class Abc {

    List<VeMayBay> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    VeMayBay vmb = new VeMayBay();

    public void input() {
        System.out.println("Nhap so n chuyen bay: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            VeMayBay vmb = new VeMayBay();
            list.add(vmb);
            System.out.println("Nhap thong tin chuyen bay thu " + (i + 1) + " :");
            System.out.println("Chon chuyen bay: ");
            int choose;
            System.out.println("1. chuyến bay của hãng VietjetAir");
            System.out.println("2. chuyến bay của hãng VietNam Airline");
            System.out.println("3. chuyến bay của hãng JetStar");
            System.out.println("chon: ");
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Nhap ma");
                    vmb.ma = scan.nextLine();
                    if (vmb.checkMa1(vmb.ma) == false) {
                        while (!vmb.checkMa1(vmb.ma)) {
                            System.out.println("Nhap lai: ");
                            vmb.ma = scan.nextLine();
                            if (vmb.checkMa1(vmb.ma)) {
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhap ma:");
                    vmb.ma = scan.nextLine();
                    if (vmb.checkMa2(vmb.ma) == false) {
                        while (!vmb.checkMa2(vmb.ma)) {
                            System.out.println("Nhap lai: ");
                            vmb.ma = scan.nextLine();
                            if (vmb.checkMa2(vmb.ma)) {
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap ma: ");
                    vmb.ma = scan.nextLine();
                    if (vmb.checkMa3(vmb.ma) == false) {
                        while (!vmb.checkMa3(vmb.ma)) {
                            System.out.println("Nhap lai: ");
                            vmb.ma = scan.nextLine();
                            if (vmb.checkMa3(vmb.ma)) {
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.err.println("Nhap loi !!!");
                    break;
            }
            vmb.nhap();
        }
    }

    public void hienthi() {
        for (VeMayBay a : list) {
            a.display();
        }
    }

    public void saveDuLieuBay() {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            fos = new FileOutputStream("d:/Admin/Java2_advanced/duLieuBay.txt");
            bos = new BufferedOutputStream(fos);

            for (VeMayBay ve : list) {
                String line = ve.getline();
                byte[] bytes = line.getBytes("UTF-8");
                bos.write(bytes);
            }
            System.out.println("Ghi thanh cong.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void readDuLieuBay() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("d:/Admin/Java2_advanced/duLieuBay.txt"));
            String a = br.readLine();
            while (a != null) {
                System.out.println(a);
                a = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void sortGiaVe() {
        Collections.sort(list, new Comparator<VeMayBay>() {
            @Override
            public int compare(VeMayBay veMayBay, VeMayBay t1) {
                if (veMayBay.giave > t1.giave) {
                    return -1;
                }
                return 1;
            }
        });
        for (VeMayBay a : list) {
            a.display();
        }
    }

    public void SaveFile_Ma() {
        for (int j = 0; j < list.size(); j++) {
            if (vmb.checkMa1(list.get(j).ma) == true) {
                FileOutputStream fos = null;
                BufferedOutputStream bos = null;
                try {
                    fos = new FileOutputStream("d:/Admin/Java2_advanced/ma1.txt");
                    bos = new BufferedOutputStream(fos);

                    for (int i = 0; i < list.size(); i++) {
                        if (vmb.checkMa1(list.get(i).ma) == true) {
                            String line = list.get(i).getline();
                            byte[] bytes = line.getBytes("UTF-8");
                            bos.write(bytes);
                        }
                    }
                    System.out.println("Ghi thanh cong.");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (bos != null) {
                        try {
                            bos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fos != null) {
                        try {
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else if (vmb.checkMa2(list.get(j).ma) == true) {
                FileOutputStream fos = null;
                BufferedOutputStream bos = null;
                try {
                    fos = new FileOutputStream("d:/Admin/Java2_advanced/ma2.txt");
                    bos = new BufferedOutputStream(fos);

                    for (int i = 0; i < list.size(); i++) {
                        if (vmb.checkMa2(list.get(i).ma) == true) {
                            String line = list.get(i).getline();
                            byte[] bytes = line.getBytes("UTF-8");
                            bos.write(bytes);
                        }
                    }
                    System.out.println("Ghi thanh cong.");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (bos != null) {
                        try {
                            bos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fos != null) {
                        try {
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                FileOutputStream fos = null;
                BufferedOutputStream bos = null;
                try {
                    fos = new FileOutputStream("d:/Admin/Java2_advanced/ma3.txt");
                    bos = new BufferedOutputStream(fos);

                    for (int i = 0; i < list.size(); i++) {
                        if (vmb.checkMa3(list.get(i).ma) == true) {
                            String line = list.get(i).getline();
                            byte[] bytes = line.getBytes("UTF-8");
                            bos.write(bytes);
                        }
                    }
                    System.out.println("Ghi thanh cong.");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (bos != null) {
                        try {
                            bos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fos != null) {
                        try {
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
