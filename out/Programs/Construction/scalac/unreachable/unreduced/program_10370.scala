package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_B[D]) extends T_A[D, T_A[T_B[Int], T_B[Char]]]
case class CC_B[E](a: T_A[E, E], b: CC_A[E]) extends T_B[E]
case class CC_C(a: Byte, b: (CC_A[Byte],T_B[Boolean])) extends T_B[T_B[CC_B[Byte]]]
case class CC_D() extends T_B[T_B[CC_B[Byte]]]

val v_a: T_B[T_B[CC_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_A(_, _, _),CC_B(_, _))) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _))