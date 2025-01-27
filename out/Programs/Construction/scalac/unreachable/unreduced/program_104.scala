package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[T_A[T_A[(Int,Boolean), Char], T_A[(Boolean,Char), Byte]], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[T_A[(Int,Boolean), Char], T_A[(Boolean,Char), Byte]], D]
case class CC_C[E](a: CC_A[E], b: T_A[E, Boolean], c: CC_A[E]) extends T_A[T_A[T_A[(Int,Boolean), Char], T_A[(Boolean,Char), Byte]], E]

val v_a: T_A[T_A[T_A[(Int,Boolean), Char], T_A[(Boolean,Char), Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_C(_, _, _) => 2 
}
}