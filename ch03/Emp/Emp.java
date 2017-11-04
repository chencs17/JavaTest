class Emp{
	private int empno; //雇员编号
	private String ename; //雇员姓名
	private String job; //雇员职业
	private double sal; //雇员收入
	private double comm; //佣金
	public Emp(){//	明确定义一个无参构造函数
	}

	public Emp(int eno, String ena, String j, double s, double c){//有参构造函数
		empno = eno;
		ename = ena;
		job = j;
		sal = s;
		comm = c;
	}

	public void setEmpno(int eno){
		empno = eno;
	}

	public void setEname(String ena){
		ename = ena;
	}

	public void setJob(String j){
		job = j;
	}

	public void setSal(double s){
		sal = s;
	}

	public void setComm(double c){
		comm = c;
	}

	public int getEmpno(){
		return empno;
	}

	public String getEname(){
		return ename;
	}

	public String getJob(){
		return job;
	}
	
	public double getSal(){
		return sal;
	}

	public double getComm(){
		return comm;
	}

	public String getInfo(){//取得完整信息
		return "雇员编号：" + empno + "\n" + 
			"雇员姓名：" + ename + "\n" +
			"雇员职位：" + job + "\n" +
			"基本工资：" + sal + "\n" +
			"佣    金：" + comm;
	}
}
