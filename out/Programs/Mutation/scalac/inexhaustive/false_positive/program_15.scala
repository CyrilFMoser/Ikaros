package Program_63 

object Test {
sealed trait T_A[B]
sealed trait T_B[C]
case class CC_A(a: T_A[Boolean], b: T_B[Char]) extends T_A[T_A[Int]]
case class CC_B[D](a: D) extends T_B[D]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B('x')) => 0 
}
}
// This is not matched: (CC_A Byte (Tuple (CC_D Boolean Byte T_B) Wildcard) (T_A Byte))
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 5 to a constant expression:
// {
//  0
// }
//