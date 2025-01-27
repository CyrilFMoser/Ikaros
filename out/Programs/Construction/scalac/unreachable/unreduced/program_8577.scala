package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: D, b: T_B[E], c: T_A[F, F]) extends T_A[E, D]
case class CC_B[G]() extends T_A[G, T_B[G]]
case class CC_C(a: CC_B[Int]) extends T_A[T_A[CC_B[Int], Char], T_B[T_A[CC_B[Int], Char]]]
case class CC_D(a: CC_B[T_A[(Char,Boolean), Int]]) extends T_B[CC_B[CC_B[Int]]]
case class CC_E(a: CC_D, b: ((Int,CC_D),CC_B[CC_C]), c: T_A[T_A[CC_D, CC_D], CC_A[CC_C, CC_C, CC_D]]) extends T_B[CC_B[CC_B[Int]]]

val v_a: T_A[T_A[CC_B[Int], Char], T_B[T_A[CC_B[Int], Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}