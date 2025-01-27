package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Byte], T_A[Int]], b: Char, c: T_A[Boolean]) extends T_A[T_B[T_B[Int, Char], Char]]
case class CC_B(a: T_B[T_A[CC_A], Char]) extends T_A[T_B[T_B[Int, Char], Char]]
case class CC_C[D](a: Char, b: CC_A) extends T_B[(CC_A,CC_A), D]
case class CC_D[E, F]() extends T_B[(CC_A,CC_A), E]

val v_a: T_B[(CC_A,CC_A), CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, 'x', _)) => 0 
  case CC_C(_, CC_A(_, _, _)) => 1 
  case CC_D() => 2 
}
}