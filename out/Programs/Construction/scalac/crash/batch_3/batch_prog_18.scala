package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: Char) extends T_A[D]
case class CC_B[E](a: E, b: T_B[E, E]) extends T_A[E]
case class CC_C(a: T_A[(Boolean,Int)]) extends T_A[CC_B[T_A[Byte]]]

val v_a: CC_B[T_A[CC_B[T_A[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_B(CC_B(_, _), _) => 1 
  case CC_B(CC_C(CC_A(_, _)), _) => 2 
}
}
// This is not matched: CC_B(CC_C(CC_B(_, _)), _)