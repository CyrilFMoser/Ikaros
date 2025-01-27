package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Byte, c: T_A) extends T_A
case class CC_B(a: Char, b: T_A) extends T_A
case class CC_C(a: T_A, b: Int, c: CC_B) extends T_A
case class CC_D(a: (Byte,T_B[Boolean]), b: CC_B, c: CC_C) extends T_B[Boolean]
case class CC_E(a: T_A, b: T_B[CC_C]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D((_,CC_D(_, _, _)), _, CC_C(CC_B(_, _), _, _)) => 0 
  case CC_D((_,CC_D(_, _, _)), _, CC_C(CC_C(_, _, _), _, _)) => 1 
  case CC_D((_,CC_E(_, _)), _, CC_C(CC_A(_, _, _), _, _)) => 2 
  case CC_D((_,CC_E(_, _)), _, CC_C(CC_B(_, _), _, _)) => 3 
  case CC_D((_,CC_E(_, _)), _, CC_C(CC_C(_, _, _), _, _)) => 4 
  case CC_E(_, _) => 5 
}
}
// This is not matched: CC_D((_,CC_D(_, _, _)), _, CC_C(CC_A(_, _, _), _, _))