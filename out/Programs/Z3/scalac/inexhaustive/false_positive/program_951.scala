package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,Int), b: T_B[T_A, T_A]) extends T_A
case class CC_C() extends T_A
case class CC_E() extends T_B[T_B[CC_C, Char], (Byte,Boolean)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_A (Tuple (CC_B T_A) Int) Wildcard T_A)