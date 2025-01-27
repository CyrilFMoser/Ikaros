package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[Char, Boolean], b: T_A[Boolean]) extends T_A[(Byte,Char)]
case class CC_B(a: CC_A) extends T_A[(Byte,Char)]
case class CC_C[E, F]() extends T_B[E, F]
case class CC_D[H, G]() extends T_B[H, G]

val v_a: T_A[(Byte,Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_C(), _)) => 1 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)