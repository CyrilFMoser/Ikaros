package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D, c: Boolean) extends T_A[D]
case class CC_B[E](a: E, b: (T_A[Char],T_A[(Byte,Int)]), c: T_B[E, E]) extends T_A[E]
case class CC_C(a: T_A[CC_B[Boolean]]) extends T_B[T_A[T_A[Byte]], T_A[CC_A[Byte]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (CC_A(_, _, _),CC_A(_, _, _)), _) => 1 
  case CC_B(_, (CC_B(_, _, _),CC_A(_, _, _)), _) => 2 
  case CC_B(_, (CC_B(_, _, _),CC_B(_, _, _)), _) => 3 
}
}
// This is not matched: CC_B(_, (CC_A(_, _, _),CC_B(_, _, _)), _)