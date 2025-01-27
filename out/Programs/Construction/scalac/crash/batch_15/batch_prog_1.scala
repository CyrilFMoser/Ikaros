package Program_1 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: T_A, b: (Byte,CC_A)) extends T_B
case class CC_D(a: T_B, b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_)), _) => 0 
  case CC_C(CC_A(CC_B(_, _)), _) => 1 
  case CC_C(CC_B(CC_A(_), _), _) => 2 
  case CC_D(_, CC_A(CC_A(_))) => 3 
  case CC_D(_, CC_A(CC_B(_, _))) => 4 
}
}
// This is not matched: CC_C(CC_B(CC_B(_, _), _), _)