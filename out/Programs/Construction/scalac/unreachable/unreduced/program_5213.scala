package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]], b: T_A[Boolean], c: T_B[T_A[Boolean], T_A[Int]]) extends T_A[Boolean]
case class CC_B(a: Byte, b: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}