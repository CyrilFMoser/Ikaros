package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B() extends T_A[T_B[Boolean]]
case class CC_D(a: T_B[Byte], b: T_A[CC_B]) extends T_B[Byte]
case class CC_E[C]() extends T_B[C]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_D(CC_E(), _) => 1 
}
}
// This is not matched: (CC_D (CC_C Wildcard Wildcard (T_B Byte)) Wildcard Wildcard (T_B Byte))