package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int) extends T_A[C, (Int,T_A[Byte, Int])]
case class CC_B[D](a: T_B) extends T_A[D, Boolean]
case class CC_C[E](a: T_A[E, E], b: T_A[E, Boolean]) extends T_A[E, Boolean]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_C(_, _)) => 1 
}
}
// This is not matched: CC_C(_, CC_B(_))