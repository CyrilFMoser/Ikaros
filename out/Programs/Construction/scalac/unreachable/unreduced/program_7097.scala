package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[Int, D]
case class CC_B[E]() extends T_A[Int, E]
case class CC_C(a: T_A[CC_A[Int], CC_A[Int]]) extends T_A[Int, T_A[T_A[Int, Boolean], T_A[Int, Char]]]
case class CC_D[F](a: Int, b: F) extends T_B[F]
case class CC_E[G]() extends T_B[G]
case class CC_F(a: T_A[CC_E[Char], T_A[Int, CC_C]], b: T_B[(CC_C,(Boolean,Int))]) extends T_B[T_B[T_B[CC_C]]]

val v_a: T_B[T_B[T_B[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_F(_, _) => 1 
}
}
// This is not matched: CC_D(_, _)