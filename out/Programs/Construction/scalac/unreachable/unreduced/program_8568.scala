package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, T_A[Int, (Boolean,Byte)]], b: T_A[T_A[Int, Boolean], T_A[Int, Int]], c: T_A[T_A[Int, Int], T_A[Boolean, Boolean]]) extends T_A[Char, T_A[T_A[Byte, Byte], (Byte,Char)]]
case class CC_B(a: CC_A) extends T_A[Char, T_A[T_A[Byte, Byte], (Byte,Char)]]

val v_a: T_A[Char, T_A[T_A[Byte, Byte], (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}