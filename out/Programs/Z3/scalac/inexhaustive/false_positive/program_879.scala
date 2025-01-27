package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A
case class CC_B[A]() extends T_A
case class CC_C(a: T_B, b: CC_B[T_B], c: Byte) extends T_A
case class CC_D(a: Boolean, b: CC_C) extends T_B
case class CC_E(a: CC_C) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E(_), CC_E(_)) => 0 
  case CC_A(CC_E(_), CC_D(_, _)) => 1 
  case CC_A(CC_D(_, _), _) => 2 
  case CC_A(_, CC_D(_, _)) => 3 
  case CC_A(CC_D(_, _), CC_E(_)) => 4 
  case CC_A(CC_D(_, _), CC_D(_, _)) => 5 
  case CC_A(CC_E(_), _) => 6 
  case CC_B() => 7 
  case CC_C(CC_D(_, _), _, _) => 8 
  case CC_C(_, _, _) => 9 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_A (CC_E T_B) (T_A T_B))