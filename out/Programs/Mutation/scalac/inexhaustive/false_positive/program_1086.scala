package Program_62 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Byte) extends T_A[D, T_B[D]]

val v_a: T_A[Boolean, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_C T_A)
// Mutation information: 
// Deleted Pattern CC_B(CC_A(), CC_C()) at position 1