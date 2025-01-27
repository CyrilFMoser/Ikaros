package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_B, b: T_A[CC_A], c: Byte) extends T_A[Boolean]
case class CC_C(a: T_A[CC_A]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_D) extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(true, _)) => 0 
  case CC_A(_, CC_A(false, _)) => 1 
  case CC_A(_, CC_B(CC_C(_), _, _)) => 2 
  case CC_A(_, CC_B(CC_D(), _, _)) => 3 
  case CC_A(_, CC_B(CC_E(_), _, _)) => 4 
  case CC_B(_, _, _) => 5 
}
}