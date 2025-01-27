package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]], b: T_A[T_A[T_B]], c: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_C() extends T_A[T_A[T_B]]
case class CC_D(a: T_A[T_B], b: T_B) extends T_B
case class CC_E(a: Boolean) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, CC_D(_, _))) => 0 
  case CC_D(_, CC_D(_, CC_E(_))) => 1 
  case CC_D(_, CC_D(_, CC_F())) => 2 
  case CC_D(_, CC_E(_)) => 3 
  case CC_D(_, CC_F()) => 4 
  case CC_E(_) => 5 
  case CC_F() => 6 
}
}