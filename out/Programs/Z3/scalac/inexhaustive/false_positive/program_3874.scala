package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_C[C](a: T_B[Char, C], b: Char) extends T_B[T_B[C, C], C]

val v_a: T_B[T_B[CC_A, CC_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, 'x') => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A (T_A (CC_A Boolean))))