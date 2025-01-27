package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_D[D](a: (T_A,(Int,Byte)), b: T_B[CC_B, D]) extends T_B[D, T_A]
case class CC_E() extends T_B[T_B[T_A, CC_A], CC_D[T_A]]

val v_a: T_B[CC_E, T_A] = null
val v_b: Int = v_a match{
  case CC_D((CC_B(),_), _) => 0 
}
}
// This is not matched: (CC_C (CC_E T_A) Wildcard (T_B (CC_E T_A) T_A))