package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_B() extends T_A[T_B[Byte]]
case class CC_C[D]() extends T_A[D]
case class CC_D() extends T_B[T_B[CC_B]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_C Byte (CC_C Byte (CC_C Byte Wildcard (T_A Byte)) (T_A Byte)) (T_A Byte))