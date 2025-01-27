package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Char,Char)) extends T_A[(Int,(Boolean,Boolean))]

val v_a: T_A[(Int,(Boolean,Boolean))] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_B (Tuple Byte T_B) T_B (T_A (Tuple Byte T_B)))