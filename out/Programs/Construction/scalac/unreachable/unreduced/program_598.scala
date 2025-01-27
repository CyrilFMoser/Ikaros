package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: T_A, b: T_B[Char, Char]) extends T_A
case class CC_C[C](a: T_B[(CC_A,Char), (CC_B,T_A)], b: C) extends T_B[(CC_A,Char), (CC_B,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
}
}
// This is not matched: CC_B(CC_B(_, _), _)