package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, (Byte,Boolean)]]
case class CC_B[D]() extends T_A[D, T_A[D, (Byte,Boolean)]]
case class CC_C[E](a: T_A[E, CC_A[E]], b: CC_A[E], c: T_A[E, E]) extends T_A[E, T_A[E, (Byte,Boolean)]]

val v_a: T_A[Boolean, T_A[Boolean, (Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)