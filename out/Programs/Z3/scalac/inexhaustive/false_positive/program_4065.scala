package Program_13 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: Char, b: T_A[F, E]) extends T_A[E, D]
case class CC_B[G](a: T_B[G], b: Byte) extends T_B[G]
case class CC_C[H](a: CC_A[H, H, H], b: T_B[H]) extends T_B[T_A[(Int,Boolean), Byte]]
case class CC_D(a: T_A[(Char,Boolean), Char], b: T_B[(Byte,Boolean)]) extends T_B[T_A[(Int,Boolean), Byte]]

val v_a: T_B[T_A[(Int,Boolean), Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_B(_, _), 0) => 1 
  case CC_B(CC_D(_, _), 0) => 2 
  case CC_B(CC_C(_, _), 0) => 3 
  case CC_B(CC_D(_, _), _) => 4 
  case CC_B(_, _) => 5 
  case CC_D(_, CC_B(_, _)) => 6 
  case CC_C(CC_A(_, _), CC_C(_, _)) => 7 
  case CC_C(_, CC_D(_, _)) => 8 
  case CC_C(CC_A(_, _), _) => 9 
  case CC_C(CC_A(_, _), CC_B(_, _)) => 10 
  case CC_C(_, _) => 11 
}
}
// This is not matched: (CC_C (CC_B (CC_D Boolean Boolean Boolean) Boolean Boolean Boolean)
//      Wildcard
//      (CC_B (CC_B (CC_D Boolean Boolean (T_A Boolean Boolean))
//                  Boolean
//                  Boolean
//                  Boolean)
//            Wildcard
//            Wildcard
//            (T_B (CC_B (CC_D Boolean Boolean (T_A Boolean Boolean))
//                       Boolean
//                       Boolean
//                       Boolean)))
//      (T_B (T_A (Tuple Int Boolean) Byte)))
// This is not matched: Pattern match is empty without constants