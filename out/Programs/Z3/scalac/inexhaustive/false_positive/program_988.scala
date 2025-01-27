package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: Byte, c: Byte) extends T_A[B]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 0, 0) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
}
}
// This is not matched: (CC_A Char
//      Char
//      (CC_A Char Boolean Wildcard Wildcard Byte (T_A Char))
//      Wildcard
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_B Byte (CC_A Byte (T_A Byte)) (T_A Byte))