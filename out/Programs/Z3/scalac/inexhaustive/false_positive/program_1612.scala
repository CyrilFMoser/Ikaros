package Program_30 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: ((Char,Byte),Int)) extends T_A[C]
case class CC_B[E]() extends T_B[E]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A Byte))
// This is not matched: (CC_B (CC_D Char Wildcard Char Wildcard (T_B Char)) Wildcard T_A)