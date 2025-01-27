package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_D() extends T_B[Boolean, T_B[T_A, CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_B Byte Int)))