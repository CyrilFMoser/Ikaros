package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Char,Int)) extends T_A[T_A[Char, Byte], (Byte,Char)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_D (Tuple (CC_A Boolean Boolean) Int)
//      (T_B (Tuple (CC_A Boolean Boolean) Int)))
// Mutation information: 
// Deleted Pattern CC_C(_, CC_D()) at position 1