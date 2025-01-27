package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_C[D]() extends T_A[D]
case class CC_E() extends T_B[Boolean]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(CC_C(), _) => 1 
}
}
// This is not matched: Pattern match is empty without constants