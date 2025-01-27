package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[D, D]], b: T_A[D, T_A[D, D]], c: T_A[Int, T_A[Int, Int]]) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C(a: Byte, b: T_B[Int], c: T_A[Char, T_A[Char, Char]]) extends T_B[CC_A[CC_B[Char]]]
case class CC_D() extends T_B[CC_A[CC_B[Char]]]

val v_a: T_B[CC_A[CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _, _)) => 0 
  case CC_C(_, _, CC_B()) => 1 
  case CC_D() => 2 
}
}