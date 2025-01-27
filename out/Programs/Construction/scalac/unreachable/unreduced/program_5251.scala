package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[T_A[T_B[Int, Char], T_B[Boolean, Char]], E]
case class CC_B[F](a: Boolean) extends T_A[T_A[T_B[Int, Char], T_B[Boolean, Char]], F]
case class CC_C[G]() extends T_A[T_A[T_B[Int, Char], T_B[Boolean, Char]], G]
case class CC_D[H](a: CC_B[H], b: CC_A[H]) extends T_B[H, CC_B[T_B[Boolean, Int]]]
case class CC_E(a: CC_A[(Char,Byte)], b: Byte) extends T_B[CC_C[CC_D[Byte]], CC_B[T_B[Boolean, Int]]]

val v_a: T_A[T_A[T_B[Int, Char], T_B[Boolean, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_C()