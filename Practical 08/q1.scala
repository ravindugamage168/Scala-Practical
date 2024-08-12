import scala.io.StdIn.{readLine, readInt}

object CaesarCipher {
  def encrypt(plaintext: String, shift: Int): String = 
  {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decrypt(ciphertext: String, shift: Int): String = {
    encrypt(ciphertext, 26 - shift)
  }

  def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
  }

  def main(args: Array[String]): Unit = 
  {
    println("Enter the text:")
    val text = readLine()

    println("Enter the shift value:")
    val shift = readInt()

    println("Choose operation (1 for encrypt, 2 for decrypt):")
    val choice = readInt()

    val operation = choice match 
    {
      case 1 => (text: String, shift: Int) => encrypt(text, shift)
      case 2 => (text: String, shift: Int) => decrypt(text, shift)
      case _ => 
        println("Invalid choice. Please choose 1 or 2.")
        return
    }

    val result = cipher(text, shift, operation)
    println(s"Result: $result")
  }
}