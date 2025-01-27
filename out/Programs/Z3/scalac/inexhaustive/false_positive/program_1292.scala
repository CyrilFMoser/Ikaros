package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B() extends T_A
case class CC_C(a: Int) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A (T_A (Tuple Byte Char) Int)
//      (CC_A Boolean Char Boolean Boolean)
//      Wildcard
//      (T_A (T_A (Tuple Byte Char) Int) (CC_A Boolean Char Boolean Boolean)))