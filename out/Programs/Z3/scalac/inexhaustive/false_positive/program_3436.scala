package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Int]) extends T_A[Int]
case class CC_C[B]() extends T_A[B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B (T_B Char))