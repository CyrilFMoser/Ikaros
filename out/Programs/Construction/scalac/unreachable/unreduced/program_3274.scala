package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B) extends T_A[C, T_B]
case class CC_B[D](a: D) extends T_A[D, T_B]
case class CC_C() extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_B[CC_C], b: Char, c: T_B) extends T_B

val v_a: T_A[CC_C, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_A(_, CC_D()) => 1 
  case CC_A(_, CC_E(CC_B(_), _, _)) => 2 
  case CC_B(_) => 3 
}
}