package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[Byte, C], C]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A T_A)
// Mutation information: 
// Deleted Pattern CC_C(_, CC_C(_, _)) at position 3