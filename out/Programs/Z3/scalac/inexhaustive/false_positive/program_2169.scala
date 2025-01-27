package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_B, Char], b: T_B[T_A, CC_B], c: T_A) extends T_B[T_B[T_A, CC_A], CC_B]

val v_a: T_B[T_B[T_A, CC_A], CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A()) => 0 
}
}
// This is not matched: (CC_C (CC_D (Tuple (CC_A T_A) Wildcard) Wildcard T_B) T_B)