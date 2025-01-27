package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C]) extends T_A[C]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)