package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: Boolean, b: T_A[Boolean]) extends T_A[Boolean]
case class CC_D[D](a: T_A[D]) extends T_B[D, T_A[Char]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(true, CC_A(_, _)) => 0 
  case CC_C(false, CC_A(_, _)) => 1 
  case CC_C(true, CC_B()) => 2 
  case CC_C(false, CC_B()) => 3 
  case CC_C(true, CC_C(_, _)) => 4 
  case CC_C(false, CC_C(_, _)) => 5 
}
}