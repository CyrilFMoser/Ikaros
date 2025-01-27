package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: CC_B) extends T_A
case class CC_D[C](a: CC_B, b: CC_C, c: Boolean) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_A(CC_C(_, _), _) => 2 
  case CC_B() => 3 
  case CC_C(CC_A(CC_A(_, _), _), CC_B()) => 4 
  case CC_C(CC_A(CC_B(), _), CC_B()) => 5 
}
}
// This is not matched: CC_C(CC_A(CC_C(_, _), _), CC_B())