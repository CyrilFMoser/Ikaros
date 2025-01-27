package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_B[T_B[Byte]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Boolean) extends T_A
case class CC_D() extends T_B[T_A]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_B(CC_A(CC_B(_), _, _)) => 1 
  case CC_B(CC_A(CC_C(_), _, _)) => 2 
  case CC_B(CC_B(CC_A(_, _, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
  case CC_B(CC_B(CC_C(_))) => 5 
  case CC_B(CC_C(_)) => 6 
}
}