package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Int]], b: T_B) extends T_A[T_A[Int]]
case class CC_B(a: T_A[CC_A], b: T_A[T_A[Int]], c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_C(a: CC_B, b: CC_B) extends T_B

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _)) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
}
}
// This is not matched: CC_B(_, _, CC_B(_, _, _))