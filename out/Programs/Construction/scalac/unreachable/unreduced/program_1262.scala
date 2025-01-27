package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: CC_A, b: T_A[CC_A]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_A(CC_D()) => 1 
  case CC_B() => 2 
}
}