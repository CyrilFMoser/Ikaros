package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Char,Byte), T_A[Boolean, (Int,Byte)]], b: T_A[(Boolean,Boolean), T_A[Int, Int]], c: Char) extends T_A[Int, T_A[T_A[Int, Char], Char]]
case class CC_B(a: Byte) extends T_A[Int, T_A[T_A[Int, Char], Char]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[Int, T_A[T_A[Int, Char], Char]]

val v_a: T_A[Int, T_A[T_A[Int, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}