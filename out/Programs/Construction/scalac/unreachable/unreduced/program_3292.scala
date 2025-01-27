package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: Boolean, b: Boolean, c: Int) extends T_B
case class CC_C(a: T_A[T_A[T_B]], b: CC_B) extends T_B
case class CC_D(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(true, _, 12) => 0 
  case CC_B(false, _, 12) => 1 
  case CC_B(true, _, _) => 2 
  case CC_B(false, _, _) => 3 
  case CC_C(_, _) => 4 
  case CC_D(_) => 5 
}
}