package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Boolean]]) extends T_A[C, (T_A[Byte, Byte],T_A[Int, Boolean])]
case class CC_B[D](a: CC_A[D], b: Char) extends T_A[D, (T_A[Byte, Byte],T_A[Int, Boolean])]
case class CC_C[E](a: T_A[T_A[E, E], E], b: CC_A[Char]) extends T_A[E, (T_A[Byte, Byte],T_A[Int, Boolean])]

val v_a: T_A[Boolean, (T_A[Byte, Byte],T_A[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_A(_)) => 1 
}
}
// This is not matched: CC_A(_)