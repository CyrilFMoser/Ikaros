package Program_62 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, (Boolean,(Int,Boolean))]
case class CC_B[D, E](a: CC_A[D]) extends T_A[D, (Boolean,(Int,Boolean))]
case class CC_C[F](a: F, b: Int, c: CC_B[F, F]) extends T_A[Byte, F]

val v_a: T_A[Int, (Boolean,(Int,Boolean))] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_B Int Boolean Wildcard (T_A Int (Tuple Boolean (Tuple Int Boolean))))
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 0 to a constant expression:
// {
//  12
// }
//
// This is not matched: (CC_A (T_B T_A T_A) Wildcard T_A)