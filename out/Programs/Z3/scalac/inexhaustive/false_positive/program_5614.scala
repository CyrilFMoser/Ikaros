package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[Char], b: T_A[D]) extends T_A[D]
case class CC_D() extends T_B[CC_A[Boolean]]

val v_a: CC_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: Pattern match is empty without constants