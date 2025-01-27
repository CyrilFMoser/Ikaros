package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,Boolean), b: T_A[T_B]) extends T_A[T_A[Int]]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_D(),_), _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (CC_B Boolean Boolean (T_A Boolean Boolean))
//      (CC_B Boolean Boolean (T_A Boolean Boolean))
//      Wildcard
//      (T_A (T_A (Tuple Char Int) Byte) Boolean))