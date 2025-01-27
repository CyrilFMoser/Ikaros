package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[Int, T_B]
case class CC_B(a: CC_A, b: T_A[CC_A, T_B]) extends T_A[Int, T_B]

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}