package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, (T_A,Char)], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_A, T_A], b: CC_A, c: CC_B) extends T_A
case class CC_D() extends T_B[CC_B, T_A]
case class CC_E(a: CC_C, b: T_A, c: T_B[Char, T_B[Boolean, CC_B]]) extends T_B[CC_B, T_A]
case class CC_F() extends T_B[CC_B, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _, _) => 0 
  case CC_A(CC_C(_, CC_A(_, _, _), CC_B()), _, _) => 1 
  case CC_B() => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_A(CC_A(_, _, _), _, _)