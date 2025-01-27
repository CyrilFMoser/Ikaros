package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C, D](a: D, b: D, c: C) extends T_B[CC_A, C]

val v_a: T_B[CC_A, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}
// This is not matched: (CC_B Int T_A Wildcard Wildcard Wildcard (T_B (CC_A T_A) Int))
// This is not matched: (CC_B Byte
//      (T_B (T_A Boolean Int) (CC_B Char Char Boolean Boolean Boolean))
//      Wildcard
//      Wildcard
//      (T_A Byte
//           (T_B (T_A Boolean Int) (CC_B Char Char Boolean Boolean Boolean))))