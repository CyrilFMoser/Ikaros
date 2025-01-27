package Program_62 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Char, Byte], b: T_A[Char]) extends T_A[T_A[Boolean]]
case class CC_B[E, D](a: D) extends T_B[E, D]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(0), _) => 0 
}
}
// This is not matched: (CC_A T_A)
// Mutation information: 
// Deleted Pattern CC_B((CC_A(),CC_C(CC_A())), _) at position 0