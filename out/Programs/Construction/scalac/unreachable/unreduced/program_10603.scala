package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_B[T_A, Byte], (CC_A,T_A)], b: Byte) extends T_A
case class CC_C[C](a: T_B[Char, C]) extends T_B[Char, C]
case class CC_D[D](a: Char) extends T_B[Char, D]
case class CC_E[E]() extends T_B[Char, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_B(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}