package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E, b: T_B[T_B[E, E], E]) extends T_A[E, F]
case class CC_B[G]() extends T_B[G, T_B[T_A[Char, Int], CC_A[Char, Char]]]
case class CC_C[H](a: H) extends T_B[H, T_B[T_A[Char, Int], CC_A[Char, Char]]]
case class CC_D(a: CC_A[CC_B[Char], (Int,Int)]) extends T_B[T_A[(Int,(Int,Char)), T_A[Boolean, Int]], T_B[T_A[Char, Int], CC_A[Char, Char]]]

val v_a: T_B[T_A[(Int,(Int,Char)), T_A[Boolean, Int]], T_B[T_A[Char, Int], CC_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(CC_A((_,_), _)) => 1 
}
}
// This is not matched: CC_C(CC_A(_, _))