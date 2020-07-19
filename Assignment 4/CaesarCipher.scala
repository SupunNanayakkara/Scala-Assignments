object CaesarCipher extends App
{
  val alphabetUpper="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val alphabetLower="abcdefghijklmnopqrstuvwxyz"

  //encryption function
  def Encryption(text:String, key:Int) = text.map
  {
    case c if alphabetUpper.contains(c) => Cipher(alphabetUpper, c, key) //upper case 
    case c if alphabetLower.contains(c) => Cipher(alphabetLower, c, key) //lower case
    case c => c //spaces, numbers and special characters 
  }
  
  //decryption function
  def Decryption(text:String, key:Int) = Encryption(text,-key)
  
  //cipher function
  def Cipher(a:IndexedSeq[Char], c:Char, key:Int)=a((c-a.head + key + a.size) % a.size)
  
  val text="This is Source Code for Caesar Cipher in Scala @1.0"
  val encrypt=Encryption(text, 4) //shift by 4
  
  println("Plain Text     : " + text)
  println("Encrypted Text : " + encrypt)
  println("Decrypted Text : " + Decryption(encrypt, 4))
  
}
