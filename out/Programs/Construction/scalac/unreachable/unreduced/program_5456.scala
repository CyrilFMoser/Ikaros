package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[T_A[T_A[Byte, Char], T_A[Boolean, Byte]], C]
case class CC_B[D](a: D, b: Boolean) extends T_A[D, CC_A[D]]
case class CC_C[E](a: CC_B[E], b: Byte, c: T_A[E, CC_A[E]]) extends T_A[T_A[T_A[Byte, Char], T_A[Boolean, Byte]], E]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Boolean, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_B(_, true), _, CC_B(_, _)) => 1 
  case CC_C(CC_B(_, false), _, CC_B(_, _)) => 2 
}
}