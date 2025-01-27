package Program_14 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D]) extends T_A[C, D]
case class CC_B() extends T_A[T_A[Int, Byte], Boolean]
case class CC_C[F, E, G](a: CC_A[F, F], b: CC_B, c: T_A[G, G]) extends T_A[E, F]

val v_a: T_A[T_A[Int, Byte], Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_C(_, _, _)) => 1 
  case CC_C(_, _, CC_A(_)) => 2 
  case CC_C(CC_A(_), CC_B(), _) => 3 
  case CC_A(CC_B()) => 4 
  case CC_A(_) => 5 
}
}
// This is not matched: (CC_C Boolean
//      (T_A Int Byte)
//      Boolean
//      Wildcard
//      (CC_B (T_A (T_A Int Byte) Boolean))
//      Wildcard
//      (T_A (T_A Int Byte) Boolean))
// This is not matched: Pattern match is empty without constants