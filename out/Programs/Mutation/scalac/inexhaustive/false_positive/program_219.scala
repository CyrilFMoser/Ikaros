package Program_59 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A Char
//      (CC_D (CC_D Wildcard T_B) T_B)
//      (CC_A Char (CC_E T_B) Wildcard (CC_F T_B) (T_A T_B Char))
//      (CC_F T_B)
//      (T_A T_B Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_D(_)
//  CC_E()
// }
//