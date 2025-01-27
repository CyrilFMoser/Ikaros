package Program_15 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E], b: D) extends T_A[D]
case class CC_B[F](a: T_A[F], b: Boolean) extends T_B[F, ((Byte,Byte),Byte)]

val v_a: T_B[Char, ((Byte,Byte),Byte)] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_B Char
//      (CC_A Char Boolean Wildcard Char (T_A Char))
//      Wildcard
//      (T_B Char (Tuple (Tuple Byte Byte) Byte)))
// This is not matched: (CC_C Byte Int (T_B Int Byte))