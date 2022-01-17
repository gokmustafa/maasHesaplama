public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee (String name, int salary, int workHours,int hireYear ){
        this.name= name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    int toplam=0;
    public void tax(){

        if (this.salary>1000){
             toplam= (int) (this.salary*0.03);
            System.out.println("Vergi: "+toplam);

        }
    }

    int maas=0;
    public void raiseSalary(){
        int year = 2022-hireYear;

        if (year<10){
            maas= (int) (this.salary*0.05);
            System.out.println("Maaş Artışı :" +maas);
        }
        else if(year>=10 && year<=19){
            maas= (int) (this.salary*0.10);
            System.out.println("Maaş Artışı :"+maas);
        }
        else if(year>=20) {
            maas= (int) (this.salary*0.15);
            System.out.println("Maaş Artışı : "+maas);
        }

    }

    int artan=0;
    public void bonus(){
        if (workHours>40){
            int kalan=workHours-40;
             artan= kalan*30;
            System.out.println("Bonus : "+artan);
            int bonusartan=this.salary+artan-toplam;
            System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+bonusartan);
            System.out.println("Toplam Maaş :"+(bonusartan+maas));
        }
    }


    void printInfo(){
        System.out.println("===============");
        System.out.println("İsim : "+ this.name);
        System.out.println("Maaş : "+ this.salary);
        System.out.println("Çalışma Saatleri : "+ this.workHours);
        System.out.println("İşe başlama yılı : "+ this.hireYear);
    }



}
