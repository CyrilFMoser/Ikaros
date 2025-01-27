package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[D, D]) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[E](a: E, b: T_A[E, E], c: (CC_A[Int, Byte],CC_A[Byte, Byte])) extends T_A[E, T_A[E, T_A[E, E]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, (CC_A(_, _),CC_A(_, _))) => 1 
}
}