package Program_57 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B(a: (Byte,Char), b: T_B[Int]) extends T_B[T_A[Char, Byte]]
case class CC_C(a: CC_B) extends T_B[T_A[Char, Byte]]

val v_a: T_B[T_A[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_B((0,_), _)) => 1 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_B (T_A Char Byte)))
// Mutation information: 
// Deleted Pattern CC_C(CC_B((0,'x'), _), CC_B((0,'x'), _)) at position 4