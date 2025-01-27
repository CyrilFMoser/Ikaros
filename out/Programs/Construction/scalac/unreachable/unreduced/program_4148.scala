package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: Int, b: T_A[T_A[Char]], c: T_B) extends T_A[T_A[Char]]
case class CC_C() extends T_A[T_A[Char]]
case class CC_D(a: Char) extends T_B
case class CC_E(a: T_A[T_A[T_B]], b: T_B, c: T_B) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, CC_D(_)) => 1 
  case CC_E(_, _, CC_E(_, _, CC_D(_))) => 2 
  case CC_E(_, _, CC_E(_, _, CC_E(_, _, _))) => 3 
  case CC_E(_, _, CC_E(_, _, CC_F())) => 4 
  case CC_E(_, _, CC_F()) => 5 
  case CC_F() => 6 
}
}