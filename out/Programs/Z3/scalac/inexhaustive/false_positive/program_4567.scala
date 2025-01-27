package Program_13 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_B(a: CC_A, b: (CC_A,CC_A), c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[A]() extends T_B
case class CC_E(a: Byte, b: CC_B, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(0, CC_B(_, _, _), CC_C()) => 1 
  case CC_E(_, CC_B(_, _, _), CC_C()) => 2 
  case CC_E(_, _, CC_C()) => 3 
  case CC_E(0, _, _) => 4 
}
}
// This is not matched: (CC_D T_A T_B)
// This is not matched: (CC_A (CC_D T_B Wildcard T_B)
//      Wildcard
//      (CC_A (CC_D T_B (CC_C Char (CC_D T_B Wildcard T_B) (T_A T_B)) T_B)
//            Wildcard
//            Wildcard
//            (T_A T_B))
//      (T_A T_B))