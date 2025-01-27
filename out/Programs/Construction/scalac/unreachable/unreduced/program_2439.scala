package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_A[Char]], b: T_A[Boolean]) extends T_A[T_A[T_B[Byte, Int]]]
case class CC_B(a: T_B[T_B[Boolean, Char], CC_A], b: T_B[Byte, CC_A]) extends T_A[T_A[T_B[Byte, Int]]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_A[T_B[Byte, Int]]]
case class CC_D[D](a: CC_B) extends T_B[T_A[CC_B], D]
case class CC_E[E, F](a: Int, b: CC_D[E]) extends T_B[T_A[CC_B], E]

val v_a: T_A[T_A[T_B[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}