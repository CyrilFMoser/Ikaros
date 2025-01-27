package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_A[T_B[Int], T_A[Char, (Boolean,Char)]]]
case class CC_B[F, E](a: E, b: T_A[E, E], c: E) extends T_A[F, E]
case class CC_C[G]() extends T_A[G, CC_A[T_A[Int, Int]]]
case class CC_D(a: CC_A[CC_A[Char]]) extends T_B[T_A[T_A[Char, Boolean], CC_A[(Int,Boolean)]]]
case class CC_E(a: CC_C[T_A[(Byte,Boolean), (Int,Int)]], b: T_B[CC_A[CC_D]], c: Char) extends T_B[T_A[T_A[Char, Boolean], CC_A[(Int,Boolean)]]]
case class CC_F(a: CC_A[T_B[CC_E]], b: CC_C[Byte]) extends T_B[T_A[T_A[Char, Boolean], CC_A[(Int,Boolean)]]]

val v_a: T_B[T_A[T_A[Char, Boolean], CC_A[(Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_E(_, _, _) => 0 
  case CC_F(CC_A(_), _) => 1 
}
}
// This is not matched: CC_D(_)