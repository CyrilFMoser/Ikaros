package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_B, Char]]
case class CC_B[D](a: T_B, b: T_A[CC_A[D], T_A[T_B, Char]]) extends T_A[Boolean, D]
case class CC_C[E](a: CC_A[E], b: E, c: Byte) extends T_A[Boolean, E]
case class CC_D() extends T_B
case class CC_E(a: CC_B[CC_A[CC_D]], b: T_A[CC_A[(Boolean,Boolean)], Char], c: (CC_B[T_B],CC_D)) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(_, _, _) => 0 
  case CC_F() => 1 
}
}
// This is not matched: CC_D()