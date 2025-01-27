package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_A(_)