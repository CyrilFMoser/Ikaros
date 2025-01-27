package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: T_B[E, E], c: T_B[T_B[E, E], E]) extends T_A[E, T_A[T_B[Char, Int], T_B[(Byte,Boolean), Int]]]
case class CC_B(a: T_A[CC_A[Int], T_B[Byte, Boolean]], b: T_B[CC_A[Byte], Boolean]) extends T_A[T_A[CC_A[Byte], CC_A[Char]], T_A[T_B[Char, Int], T_B[(Byte,Boolean), Int]]]
case class CC_C[G, F]() extends T_A[F, G]
case class CC_D[H](a: CC_C[H, H], b: CC_B) extends T_B[H, T_B[H, H]]

val v_a: T_A[T_A[CC_A[Byte], CC_A[Char]], T_A[T_B[Char, Int], T_B[(Byte,Boolean), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(0, _, _) => 0 
  case CC_B(CC_C(), _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_A(_, _, _)