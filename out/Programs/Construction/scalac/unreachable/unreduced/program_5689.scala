package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: Int, b: CC_A) extends T_A[T_B]
case class CC_D(a: CC_C, b: Int) extends T_B
case class CC_E(a: CC_A) extends T_B
case class CC_F(a: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, CC_A(_)), _) => 0 
  case CC_E(CC_A(_)) => 1 
  case CC_F(_) => 2 
}
}