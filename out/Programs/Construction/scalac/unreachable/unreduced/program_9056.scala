package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char], b: T_B) extends T_A[(T_A[T_B],T_A[(Int,Byte)])]
case class CC_B(a: Char, b: T_A[Char]) extends T_A[(T_A[T_B],T_A[(Int,Byte)])]
case class CC_C() extends T_B
case class CC_D(a: CC_A, b: Boolean) extends T_B
case class CC_E[B]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, CC_C()), _) => 1 
  case CC_D(CC_A(_, CC_D(_, _)), _) => 2 
  case CC_D(CC_A(_, CC_E()), _) => 3 
  case CC_E() => 4 
}
}