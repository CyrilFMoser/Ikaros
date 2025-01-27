package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Boolean]]
case class CC_B(a: Byte, b: T_A[CC_A]) extends T_A[T_B[Boolean]]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(0, _) => 1 
}
}
// This is not matched: Pattern match is empty without constants