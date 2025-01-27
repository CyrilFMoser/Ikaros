package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: T_B[CC_A, (T_A,CC_B)]) extends T_A
case class CC_D[C]() extends T_B[Char, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_)) => 3 
  case CC_A(CC_C(_)) => 4 
  case CC_B(_) => 5 
  case CC_C(_) => 6 
}
}