package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C[G](a: T_B[G, T_B[Int, G]], b: T_A[G, G]) extends T_B[Int, G]
case class CC_D(a: T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]], b: CC_B[(Char,Int)]) extends T_B[Int, CC_A[T_A[Char, Boolean]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}