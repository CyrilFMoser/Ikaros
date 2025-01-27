package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_B[T_A, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C, (T_A,CC_C)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_B(),_), _) => 0 
}
}
// This is not matched: (CC_C Char Wildcard (T_A (Tuple Byte Int) Char))