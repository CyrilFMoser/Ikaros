package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: T_A[T_A[D, D], D]) extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[CC_A[Char, Byte], CC_A[Boolean, Boolean]], b: CC_A[CC_A[Boolean, Byte], CC_A[Char, Boolean]]) extends T_A[T_A[(CC_A[Byte, Char],Int), (CC_A[Byte, Char],Int)], (CC_A[Byte, Char],Int)]
case class CC_C[E](a: T_A[Char, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[CC_B, CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}