package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Byte], T_A[Int, Boolean]]) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Int]], T_A[T_A[Char, Byte], (Char,Char)]]
case class CC_B(a: Int) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Int]], T_A[T_A[Char, Byte], (Char,Char)]]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Byte, Int]], T_A[T_A[Char, Byte], (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}