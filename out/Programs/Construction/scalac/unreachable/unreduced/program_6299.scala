package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B() extends T_B
case class CC_C(a: CC_A, b: T_A[T_B]) extends T_B
case class CC_D(a: CC_A, b: T_A[CC_A], c: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(), _) => 1 
  case CC_D(_, _, _) => 2 
}
}