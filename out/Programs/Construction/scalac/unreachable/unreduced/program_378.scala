package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]], b: T_A[(Int,Int)], c: ((Char,Int),T_A[Char])) extends T_A[Char]
case class CC_B[C](a: T_A[C], b: T_A[C]) extends T_A[Char]
case class CC_C(a: CC_B[Char], b: T_A[CC_B[(Char,Boolean)]], c: CC_A) extends T_A[Char]
case class CC_D[D](a: (T_A[CC_C],T_A[CC_C])) extends T_B[D]
case class CC_E[E](a: T_B[E], b: Boolean) extends T_B[E]
case class CC_F(a: CC_B[CC_E[CC_A]], b: T_B[T_B[CC_A]], c: T_A[Char]) extends T_B[CC_A]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}