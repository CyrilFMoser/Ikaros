package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Boolean, C]
case class CC_B[D]() extends T_A[Boolean, D]
case class CC_C(a: CC_A[Byte], b: T_A[Boolean, Byte]) extends T_A[Boolean, T_A[Boolean, Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_B Byte (T_A Boolean Byte)) (T_A Boolean (T_A Boolean Byte)))