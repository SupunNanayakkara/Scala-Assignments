object MoneyTransfer extends App 
{
    var accountList:List[Account] = List()

    def CreateAcc(nic:String, accNo: Int):Unit = 
    {
        val acc = new Account(nic, accNo)
        accountList = accountList ::: acc :: Nil
        
    }

    val FindAcc = (a:Int, b:List[Account]) => b.filter(account => account.accNo.equals(a))
    
    CreateAcc("1234566789V",1)
    CreateAcc("2224136745V",2)
    CreateAcc("1534161325V",3)
    println(accountList) //print created bank accounts with details
    
    FindAcc(1, accountList)(0).deposit(2000)  //deposit money
    println(FindAcc(1, accountList)(0))
  
    FindAcc(2, accountList)(0).deposit(1500)  //deposit money
    println(FindAcc(2, accountList)(0))
  
    FindAcc(2, accountList)(0).withdraw(2000)  //withdraw money
    println(FindAcc(1, accountList)(0))

    FindAcc(1, accountList)(0).transfer(3, 500.0) //transfer money
    println(FindAcc(1, accountList)(0))
    println(FindAcc(3, accountList)(0))
}

class Account(nic:String, val accNo: Int, var balance: Double = 0.0)
{

    def withdraw(amount:Double) : Unit = 
    {
        this.balance = this.balance - amount
        println("Withdraw " + amount + " from " + accNo)
    }

    def deposit(amount:Double) : Unit = 
    {
        this.balance = this.balance + amount
        println("Deposite " + amount + " to " + accNo)
    }

    def transfer(accNum:Int, amount:Double) : Unit = 
    {
        val TransferAcc = MoneyTransfer.FindAcc(accNum, MoneyTransfer.accountList)
        if (balance < amount)
        {
            println("Insufficient Amount")
            println("Balance = " + balance)
        }
        else 
        {
            this.withdraw(amount)
            TransferAcc(0).deposit(amount)
            println("Transfer " + amount + " from " + accNo + " to " + accNum)
        }
    }

    override def toString = "["+nic+":"+accNo +":"+ balance+"]"
}