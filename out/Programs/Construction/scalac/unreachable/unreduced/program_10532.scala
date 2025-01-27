package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Boolean]
case class CC_B() extends T_B
case class CC_C(a: T_A[Boolean]) extends T_B
case class CC_D(a: Int, b: T_A[T_A[CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A()) => 1 
  case CC_D(12, _) => 2 
  case CC_D(_, _) => 3 
}
}