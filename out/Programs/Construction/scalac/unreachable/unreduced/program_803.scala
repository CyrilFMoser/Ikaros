package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, E], b: E, c: T_A[T_A[F, F], E]) extends T_A[E, F]
case class CC_B[G](a: T_A[G, G], b: T_A[G, G], c: G) extends T_B[T_B[CC_A[Boolean, Int], T_A[(Byte,Boolean), Char]], G]
case class CC_C[H](a: CC_B[H], b: T_B[H, H], c: T_B[H, H]) extends T_B[T_B[CC_A[Boolean, Int], T_A[(Byte,Boolean), Char]], H]
case class CC_D[I](a: (T_B[Boolean, Byte],CC_A[Byte, Boolean]), b: Boolean) extends T_B[T_B[CC_A[Boolean, Int], T_A[(Byte,Boolean), Char]], I]

val v_a: T_B[T_B[CC_A[Boolean, Int], T_A[(Byte,Boolean), Char]], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _, _), CC_A(_, _, _), _)