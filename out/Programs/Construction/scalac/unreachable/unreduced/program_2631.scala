package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[Char]
case class CC_B[C](a: CC_A, b: T_A[Char]) extends T_A[C]
case class CC_C() extends T_A[Char]
case class CC_D(a: Int, b: Char) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]
case class CC_F(a: T_B[CC_A]) extends T_B[CC_A]

val v_a: T_A[CC_F] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
  case CC_B(_, CC_C()) => 2 
}
}