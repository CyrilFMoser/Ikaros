package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B() extends T_A[T_B[Boolean]]
case class CC_D(a: T_A[CC_B], b: Byte) extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(_, 0) => 0 
}
}
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Byte))