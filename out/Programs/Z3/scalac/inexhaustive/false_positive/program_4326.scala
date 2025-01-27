package Program_15 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B, b: T_B, c: T_A) extends T_A
case class CC_B(a: T_B, b: (T_A,T_A), c: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_B(_, _, 0) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Byte
//      Char
//      (CC_B Byte Byte Wildcard (T_A Byte Byte))
//      (CC_D Char
//            Byte
//            Wildcard
//            (CC_B Byte Char Byte (T_A Byte Char))
//            (T_B Byte Char))
//      Wildcard
//      (T_A Byte Char))