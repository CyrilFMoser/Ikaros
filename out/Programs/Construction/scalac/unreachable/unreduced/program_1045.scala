package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Boolean,Boolean)], b: (Int,T_A[Char]), c: T_A[Char]) extends T_A[Char]
case class CC_B(a: T_B[T_A[Char]]) extends T_A[Char]
case class CC_C(a: Int, b: T_B[T_A[Char]]) extends T_A[Char]
case class CC_D[C](a: C) extends T_B[C]
case class CC_E[D](a: CC_A, b: D, c: (Boolean,CC_A)) extends T_B[D]
case class CC_F[E](a: T_A[E], b: CC_E[E], c: T_B[E]) extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_A(_, _, _), _, (_,_)) => 1 
}
}
// This is not matched: CC_F(_, _, _)