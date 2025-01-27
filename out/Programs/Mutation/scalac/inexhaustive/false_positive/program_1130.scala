package Program_56 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_B[T_A, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[T_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_B()), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A (Tuple (CC_C Wildcard Wildcard T_A) (CC_A Wildcard T_A)) T_A)
// Mutation information: 
// Deleted Pattern CC_A((CC_C(_, _),CC_C(_, _))) at position 4