package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: Char) extends T_A[E]
case class CC_C[F](a: Char, b: T_A[F]) extends T_B[F, Boolean]
case class CC_D[G](a: T_B[G, G], b: Byte, c: CC_A[G]) extends T_B[G, Boolean]
case class CC_E[H](a: (T_B[(Int,Byte), Boolean],Boolean)) extends T_B[H, Boolean]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
  case CC_C(_, CC_B(_)) => 1 
  case CC_D(_, _, CC_A()) => 2 
  case CC_E((CC_C(_, _),_)) => 3 
  case CC_E((CC_D(_, _, _),_)) => 4 
  case CC_E((CC_E(_),_)) => 5 
}
}