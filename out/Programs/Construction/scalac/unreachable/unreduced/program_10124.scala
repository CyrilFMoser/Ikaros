package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Char, Char],T_A[Boolean, Int]), c: Byte) extends T_A[T_A[T_A[Boolean, Boolean], T_A[(Boolean,Boolean), (Boolean,Char)]], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: D) extends T_A[T_A[T_A[Boolean, Boolean], T_A[(Boolean,Boolean), (Boolean,Char)]], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[(Boolean,Boolean), (Boolean,Char)]], E]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[(Boolean,Boolean), (Boolean,Char)]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)