package Program_15 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Char,Char), b: T_B[T_A, T_A], c: Int) extends T_A
case class CC_B[C, D](a: CC_A) extends T_B[T_A, C]
case class CC_C[E](a: T_B[CC_A, E], b: T_B[T_A, E], c: E) extends T_B[T_A, E]

val v_a: T_B[T_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, 0) => 1 
  case CC_C(_, CC_C(_, _, _), 0) => 2 
  case CC_C(_, _, _) => 3 
  case CC_C(_, CC_C(_, _, _), _) => 4 
}
}
// This is not matched: (CC_B Byte T_A Wildcard (T_B T_A Byte))
// This is not matched: Pattern match is empty without constants