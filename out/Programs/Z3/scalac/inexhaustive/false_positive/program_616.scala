package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_D(a: Int, b: T_B[Char]) extends T_B[CC_A[Boolean]]

val v_a: T_B[CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_D(12, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants