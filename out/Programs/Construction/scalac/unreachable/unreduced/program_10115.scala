package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Byte, c: Boolean) extends T_A[T_B]
case class CC_B(a: T_A[CC_A], b: T_A[CC_A]) extends T_A[T_B]
case class CC_C(a: T_B) extends T_B
case class CC_D() extends T_B
case class CC_E(a: Int) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), _, _) => 0 
  case CC_A(CC_D(), _, _) => 1 
  case CC_A(CC_E(12), _, _) => 2 
  case CC_A(CC_E(_), _, _) => 3 
  case CC_B(_, _) => 4 
}
}