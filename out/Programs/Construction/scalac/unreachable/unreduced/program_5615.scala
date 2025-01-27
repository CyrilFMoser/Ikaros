package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: C) extends T_A[C, Char]
case class CC_B[D](a: (T_A[(Int,Boolean), Char],T_A[Char, Char]), b: D, c: T_A[D, D]) extends T_A[D, Char]
case class CC_C[E](a: T_A[E, Char], b: CC_B[E], c: CC_A[E]) extends T_A[E, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _)