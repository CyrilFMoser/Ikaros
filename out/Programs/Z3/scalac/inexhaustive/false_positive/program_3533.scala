package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[Int]) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants