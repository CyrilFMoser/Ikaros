package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: C, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_B, T_B[Byte, Boolean]], b: T_A, c: CC_B) extends T_A
case class CC_D[D]() extends T_B[D, CC_A[CC_C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B()