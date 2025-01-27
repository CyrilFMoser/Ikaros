package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: T_A[T_A[Int]]) extends T_A[CC_A[Int]]
case class CC_C(a: T_A[CC_B], b: (CC_B,Boolean), c: CC_B) extends T_A[CC_A[Int]]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}