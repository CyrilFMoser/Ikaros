package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Char, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A) extends T_B[CC_B, (T_A,T_B[CC_B, CC_A])]
case class CC_D() extends T_B[CC_B, (T_A,T_B[CC_B, CC_A])]
case class CC_E(a: Char) extends T_B[CC_B, (T_A,T_B[CC_B, CC_A])]

val v_a: T_B[CC_B, (T_A,T_B[CC_B, CC_A])] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_C(CC_B()) => 1 
  case CC_D() => 2 
  case CC_E(_) => 3 
}
}