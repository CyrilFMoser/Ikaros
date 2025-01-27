package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,(Int,Boolean)), b: T_B[T_A, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[(CC_B,T_A), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A((CC_A(_, _),_), _) => 1 
}
}
// This is not matched: (CC_A (Tuple (CC_B T_A) (Tuple Int Boolean)) Wildcard T_A)