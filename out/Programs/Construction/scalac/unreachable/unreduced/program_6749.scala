package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[Byte, T_B]
case class CC_B() extends T_A[Byte, T_B]
case class CC_C(a: T_A[T_B, T_A[CC_A, CC_A]], b: CC_B, c: CC_A) extends T_B
case class CC_D(a: CC_A) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_A()) => 1 
  case CC_E(CC_C(_, _, _)) => 2 
  case CC_E(CC_D(CC_A())) => 3 
}
}
// This is not matched: CC_E(CC_E(_))