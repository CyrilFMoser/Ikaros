package Program_45 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Char,Int), (Char,Boolean)], b: T_A[Char, C]) extends T_A[Char, C]
case class CC_B[D]() extends T_A[Char, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A Boolean
//      Wildcard
//      (CC_A Boolean Wildcard Wildcard Boolean (T_A Char Boolean))
//      Wildcard
//      (T_A Char Boolean))
// Mutation information: 
// Deleted Pattern CC_B(_, CC_A(_, CC_A(_, _, _), _), CC_B(_, _, CC_A(_, _, _))) at position 19