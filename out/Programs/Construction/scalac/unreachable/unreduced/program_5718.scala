package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A) extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C(a: Byte, b: CC_A) extends T_A
case class CC_D(a: (Char,CC_B)) extends T_B[CC_C]
case class CC_E(a: CC_A) extends T_B[CC_C]
case class CC_F(a: CC_E, b: (Int,CC_E)) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _)) => 0 
  case CC_F(CC_E(_), (_,CC_E(_))) => 1 
}
}
// This is not matched: CC_D((_,CC_B(_)))