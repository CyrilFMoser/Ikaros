package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], T_B[(Int,Boolean), T_A]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_B[Boolean, Int]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _), _)) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_B(CC_A(CC_B(_), _))