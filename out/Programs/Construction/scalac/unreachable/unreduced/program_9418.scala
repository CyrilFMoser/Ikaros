package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Int) extends T_A[C, Byte]
case class CC_B[D](a: Byte, b: Boolean, c: (Char,T_A[T_B, Byte])) extends T_A[D, Byte]
case class CC_C[E, F]() extends T_A[E, Byte]
case class CC_D(a: T_A[CC_A[T_B], Byte], b: CC_A[Boolean], c: (CC_C[T_B, T_B],T_A[T_B, Byte])) extends T_B
case class CC_E(a: T_A[T_A[Char, Byte], Byte]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _)) => 0 
  case CC_E(CC_B(_, _, _)) => 1 
  case CC_E(CC_C()) => 2 
}
}