package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[D, D], D], b: T_A[D, D], c: (T_B[Boolean],Boolean)) extends T_A[D, T_A[T_A[Char, Int], T_A[Int, Char]]]
case class CC_B(a: T_B[Char], b: CC_A[T_B[(Byte,Boolean)]], c: T_A[CC_A[(Boolean,Byte)], CC_A[Boolean]]) extends T_A[T_B[Int], T_A[T_A[Char, Int], T_A[Int, Char]]]
case class CC_C[E](a: T_A[E, E], b: E) extends T_B[E]
case class CC_D[F](a: F) extends T_B[F]
case class CC_E[G]() extends T_B[G]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_E()