package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: T_A[F, Byte]) extends T_A[F, Byte]
case class CC_C[G]() extends T_A[G, Byte]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_B Int (CC_B Int Wildcard Int (T_A Int Byte)) Wildcard (T_A Int Byte))
// Mutation information: 
// Deleted Pattern CC_B(CC_C(_, _), _) at position 2