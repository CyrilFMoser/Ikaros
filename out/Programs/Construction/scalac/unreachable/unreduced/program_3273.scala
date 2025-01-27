package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_A[CC_A], b: T_A[T_B], c: Int) extends T_A[T_B]
case class CC_C(a: T_A[(CC_B,CC_B)]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}