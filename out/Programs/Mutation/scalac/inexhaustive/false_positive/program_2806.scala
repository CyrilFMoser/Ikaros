package Program_28 

object Test {
sealed trait T_A[A]
case class CC_B[E](a: ((Char,Char),Byte)) extends T_A[E]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B((_,0)) => 0 
}
}
// This is not matched: (CC_A Char Wildcard (T_A Char))
// Mutation information: 
// Deleted Pattern CC_B(_, CC_A(_), CC_B(_, _, _)) at position 0