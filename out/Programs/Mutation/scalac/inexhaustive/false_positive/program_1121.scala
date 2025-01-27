package Program_61 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: T_A[E, E], b: E) extends T_A[T_A[Int, Byte], E]
case class CC_B[F]() extends T_A[T_A[Int, Byte], F]

val v_a: CC_A[T_A[T_A[Int, Byte], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_A Wildcard Wildcard T_A)
//             (CC_B (CC_A (Tuple Wildcard Wildcard) Wildcard T_A)
//                   (CC_A Wildcard Wildcard T_A)
//                   T_A))
//      Wildcard
//      T_A)
// Mutation information: 
// Deleted Pattern CC_A((CC_B(_, _),CC_B(_, _)), _) at position 0