package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G](a: CC_A[G, G], b: Byte) extends T_B[G, T_B[T_B[Char, Boolean], T_B[Byte, Byte]]]
case class CC_C[H](a: CC_B[H]) extends T_B[H, T_B[T_B[Char, Boolean], T_B[Byte, Byte]]]
case class CC_D[I](a: T_B[I, I], b: I) extends T_B[I, T_B[T_B[Char, Boolean], T_B[Byte, Byte]]]

val v_a: T_B[Byte, T_B[T_B[Char, Boolean], T_B[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_C(CC_B(CC_A(), _)) => 1 
  case CC_D(_, _) => 2 
}
}