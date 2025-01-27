package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[C, T_A[Char, T_A[Byte, Int]]]
case class CC_B[D](a: D, b: D, c: CC_A[D]) extends T_A[D, T_A[Char, T_A[Byte, Int]]]
case class CC_C[E](a: E) extends T_A[E, T_A[Char, T_A[Byte, Int]]]

val v_a: T_A[Int, T_A[Char, T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_C(_) => 2 
}
}