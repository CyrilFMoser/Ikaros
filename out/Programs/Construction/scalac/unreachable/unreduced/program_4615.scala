package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_B, T_B[Byte, CC_B]]) extends T_A
case class CC_D[C](a: CC_A, b: (CC_C,Boolean)) extends T_B[C, T_B[C, C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_C(_), _) => 1 
  case CC_B() => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_A(CC_B(), _)