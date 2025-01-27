package Program_62 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(Boolean,Char)], b: (Char,Boolean)) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_C T_A)
// Mutation information: 
// Deleted Pattern CC_A(CC_A(CC_C())) at position 1