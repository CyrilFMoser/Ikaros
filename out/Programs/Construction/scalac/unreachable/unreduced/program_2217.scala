package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_A[T_B], b: Int) extends T_B
case class CC_C[B](a: T_A[Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A()) => 1 
}
}