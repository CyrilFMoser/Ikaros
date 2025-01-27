package Program_14 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B(a: (T_A,Byte), b: T_A, c: T_B) extends T_A
case class CC_C(a: CC_B, b: (Char,T_B), c: CC_B) extends T_A
case class CC_D[A]() extends T_B
case class CC_E(a: ((Boolean,Char),CC_A)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(((_,_),CC_A(_, _))) => 1 
}
}
// This is not matched: (CC_D T_A T_B)
// This is not matched: (CC_B Char Wildcard (CC_C Char Int Char (T_A Char)) (T_A Char))