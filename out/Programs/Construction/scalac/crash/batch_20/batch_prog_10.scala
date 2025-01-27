package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, (Byte,Char)], T_A[Char, Char]], b: Int, c: T_A[T_A[Boolean, Int], Char]) extends T_A[T_A[T_A[Byte, Byte], T_A[Boolean, Byte]], T_A[T_A[Byte, Int], T_A[Boolean, Char]]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}