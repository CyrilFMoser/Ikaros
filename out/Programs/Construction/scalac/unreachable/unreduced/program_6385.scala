package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[T_B]
case class CC_B(a: T_A[CC_A[T_B]]) extends T_A[T_B]
case class CC_C(a: T_A[CC_B], b: CC_A[CC_A[CC_B]], c: Int) extends T_A[T_B]
case class CC_D(a: Char, b: CC_C) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, _, _)) => 0 
  case CC_E(CC_D(_, CC_C(_, _, _))) => 1 
  case CC_E(CC_E(_)) => 2 
}
}