package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: C) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(CC_A()) => 2 
}
}