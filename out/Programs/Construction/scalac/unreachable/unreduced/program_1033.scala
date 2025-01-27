package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[T_B[T_B[Byte, Boolean], T_A[Boolean, Char]], E]
case class CC_B[F, G](a: T_B[G, F], b: Char, c: T_A[G, G]) extends T_A[G, F]
case class CC_C(a: Boolean) extends T_A[T_B[T_B[Byte, Boolean], T_A[Boolean, Char]], T_A[T_B[Byte, Boolean], Boolean]]
case class CC_D[H](a: T_B[H, Byte], b: Char, c: T_B[H, H]) extends T_B[H, Byte]

val v_a: T_A[T_B[T_B[Byte, Boolean], T_A[Boolean, Char]], T_A[T_B[Byte, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}