package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_B[Byte]) extends T_A[D]
case class CC_C() extends T_B[CC_B[Byte]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_, _), _) => 1 
}
}
// This is not matched: (CC_B Wildcard Wildcard (CC_A T_A) T_A)