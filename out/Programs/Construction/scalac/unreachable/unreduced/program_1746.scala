package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[Int, Boolean]
case class CC_B(a: T_A[Int, Boolean]) extends T_A[Int, Boolean]
case class CC_C(a: T_A[Int, CC_B], b: T_B[Boolean], c: T_A[Int, Boolean]) extends T_A[Int, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C(_, _, _)) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B(CC_A())