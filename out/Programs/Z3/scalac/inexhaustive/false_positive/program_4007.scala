package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: T_A[Boolean], c: T_B[Byte]) extends T_A[T_A[Byte]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D]() extends T_B[D]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_A (CC_B Byte Wildcard Wildcard (T_B Byte))
//      Wildcard
//      (CC_B Byte Byte Wildcard (T_B Byte))
//      (T_A (T_A Byte)))