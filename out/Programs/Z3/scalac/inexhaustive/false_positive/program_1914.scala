package Program_28 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, Byte], c: Boolean) extends T_A[C, Byte]
case class CC_B[D]() extends T_A[D, Byte]
case class CC_C[E, F](a: T_A[E, Byte], b: T_A[F, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _) => 0 
  case CC_C(CC_A(_, _, _), _) => 1 
  case CC_C(_, CC_C(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: (CC_C Int
//      Boolean
//      (CC_A Int
//            Wildcard
//            (CC_A Int Int Wildcard Boolean (T_A Int Byte))
//            Boolean
//            (T_A Int Byte))
//      Wildcard
//      (T_A (T_A Int Int) Int))
// This is not matched: (CC_C T_A)