package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_B], c: T_B) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[D, T_B]
case class CC_C[E](a: CC_A[E], b: (Boolean,T_B)) extends T_A[E, T_B]

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)