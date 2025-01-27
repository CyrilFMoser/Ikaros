package Program_14 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: Byte, c: (T_A,T_A)) extends T_A
case class CC_B[D](a: (Byte,T_A), b: T_B[Boolean, D]) extends T_B[Boolean, D]
case class CC_C[F, E](a: E, b: F) extends T_B[E, F]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, (CC_A(_, _, _),CC_A(_, _, _))) => 0 
}
}
// This is not matched: (CC_A Int
//      (CC_A Wildcard
//            (CC_A T_A Wildcard Wildcard Wildcard T_A)
//            Wildcard
//            Wildcard
//            T_A)
//      Wildcard
//      (Tuple (CC_A T_A Wildcard Wildcard Wildcard T_A)
//             (CC_A T_A Wildcard Wildcard Wildcard T_A))
//      T_A)
// This is not matched: (CC_A T_A)