package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_B), b: T_A[C, C]) extends T_A[T_A[T_B, T_B], C]
case class CC_B() extends T_B
case class CC_C() extends T_B

val v_a: CC_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A((CC_C(),_), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants