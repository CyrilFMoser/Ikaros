package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Char],T_A[Byte, Char]), b: T_A[C, ((Int,Boolean),(Byte,Byte))], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: D) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: CC_A[E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(true, _) => 0 
  case CC_B(false, _) => 1 
  case CC_C(CC_A(_, _, _)) => 2 
}
}
// This is not matched: CC_A(_, _, _)