package Program_60 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Char, CC_A], b: T_A) extends T_A
case class CC_C[C](a: T_A) extends T_B[C, Boolean]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_B(_, _))) => 0 
  case CC_C(CC_A()) => 1 
}
}
// This is not matched: (CC_A Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_B(_) at position 1