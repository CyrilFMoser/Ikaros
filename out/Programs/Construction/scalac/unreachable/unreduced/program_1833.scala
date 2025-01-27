package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[Int, Int], Char]) extends T_A[T_B[(Int,Boolean)], T_B[T_A[Int, (Int,Boolean)]]]
case class CC_B(a: T_B[T_A[CC_A, (Char,Char)]], b: Char, c: T_B[T_B[CC_A]]) extends T_A[T_B[(Int,Boolean)], T_B[T_A[Int, (Int,Boolean)]]]
case class CC_C[D](a: CC_B) extends T_B[D]
case class CC_D[E](a: E, b: E) extends T_B[E]
case class CC_E[F]() extends T_B[F]

val v_a: T_A[T_B[(Int,Boolean)], T_B[T_A[Int, (Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}