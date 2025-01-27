package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: Int, c: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_A[T_A[Char]], b: Int) extends T_A[CC_A[T_B[Char, Int]]]
case class CC_C[E](a: E, b: T_A[E]) extends T_B[(T_A[Boolean],Byte), E]
case class CC_D[F]() extends T_B[(T_A[Boolean],Byte), F]

val v_a: T_B[(T_A[Boolean],Byte), CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _)) => 0 
  case CC_D() => 1 
}
}