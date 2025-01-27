package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Char]], b: T_B[T_A], c: T_A) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_A
case class CC_D(a: T_A, b: T_B[(T_A,CC_A)]) extends T_B[(T_B[CC_A],T_A)]
case class CC_E(a: T_A) extends T_B[(T_B[CC_A],T_A)]

val v_a: T_B[(T_B[CC_A],T_A)] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_B(CC_A(_, _, _), _)) => 1 
  case CC_E(CC_C(_, _)) => 2 
}
}
// This is not matched: CC_E(CC_A(_, _, _))