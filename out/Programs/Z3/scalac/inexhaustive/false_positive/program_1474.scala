package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: Int) extends T_A
case class CC_C[C]() extends T_B[(CC_A,T_A), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)