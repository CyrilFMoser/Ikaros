package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, T_A], b: T_B[CC_A, CC_A], c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_B, C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_A T_A) Wildcard) Wildcard T_A)