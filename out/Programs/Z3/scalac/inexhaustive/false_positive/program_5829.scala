package Program_14 

object Test {
sealed trait T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_A (CC_A Char Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A (CC_A Char Boolean Boolean Boolean)
//           (T_A (Tuple Char Char) (Tuple Boolean Byte))))