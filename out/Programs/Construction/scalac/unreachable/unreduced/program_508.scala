package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Int,Byte), T_A[Byte, (Char,Byte)]], C]
case class CC_B(a: T_A[T_A[Char, Int], T_A[Byte, Char]]) extends T_A[T_A[(Int,Byte), T_A[Byte, (Char,Byte)]], T_A[T_A[Int, Boolean], (Boolean,Byte)]]
case class CC_C() extends T_A[T_A[(Int,Byte), T_A[Byte, (Char,Byte)]], T_A[T_A[Int, Boolean], (Boolean,Byte)]]

val v_a: T_A[T_A[(Int,Byte), T_A[Byte, (Char,Byte)]], T_A[T_A[Int, Boolean], (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}