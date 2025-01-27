package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[C], b: T_A[D]) extends T_A[C]
case class CC_B[E](a: T_A[E], b: Byte, c: Byte) extends T_A[E]
case class CC_C(a: T_A[Char], b: Char, c: Byte) extends T_A[CC_A[Byte, T_A[Int]]]
case class CC_D(a: (T_A[CC_C],T_A[CC_C])) extends T_B[T_B[Int]]

val v_a: T_A[CC_A[Byte, T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, 0) => 2 
}
}
// This is not matched: CC_C(_, _, _)