package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[Boolean, Int], T_B[Char]], b: T_B[T_B[Byte]], c: T_A[(Int,Char), Char]) extends T_A[T_A[T_A[Byte, Char], T_B[Boolean]], T_A[T_A[Byte, Boolean], Int]]
case class CC_B(a: T_B[Boolean]) extends T_A[T_A[T_A[Byte, Char], T_B[Boolean]], T_A[T_A[Byte, Boolean], Int]]

val v_a: T_A[T_A[T_A[Byte, Char], T_B[Boolean]], T_A[T_A[Byte, Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}