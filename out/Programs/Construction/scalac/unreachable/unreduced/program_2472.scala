package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Int], b: T_A[(Boolean,Int)], c: T_A[T_B[Boolean, Boolean]]) extends T_A[T_B[T_B[Boolean, Char], Int]]
case class CC_B() extends T_A[T_B[T_B[Boolean, Char], Int]]
case class CC_C(a: CC_A, b: CC_A) extends T_A[T_B[T_B[Boolean, Char], Int]]

val v_a: T_A[T_B[T_B[Boolean, Char], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, CC_A(_, _, _))