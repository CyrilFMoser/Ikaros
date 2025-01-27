package Program_28 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Int,Byte), b: T_A) extends T_A
case class CC_B[C, D](a: T_A, b: T_B[C, CC_A], c: CC_A) extends T_B[C, T_B[C, C]]

val v_a: T_B[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(CC_A(_, _), _, _) => 2 
}
}
// This is not matched: (CC_B Char T_A Wildcard Wildcard Wildcard (T_B Char (T_B Char Char)))
// This is not matched: Pattern match is empty without constants