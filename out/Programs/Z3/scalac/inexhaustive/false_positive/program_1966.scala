package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Int, b: T_A[E, E], c: T_A[D, D]) extends T_A[E, D]
case class CC_B[G, F, H](a: G, b: T_A[F, H]) extends T_A[G, F]
case class CC_C[I, J](a: CC_A[I, Byte], b: J) extends T_A[J, I]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), 12) => 0 
  case CC_C(_, _) => 1 
  case CC_B(12, CC_C(_, _)) => 2 
  case CC_B(12, CC_B(_, _)) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
  case CC_B(_, CC_C(_, _)) => 5 
  case CC_B(_, CC_A(_, _, _)) => 6 
  case CC_A(12, _, CC_C(_, _)) => 7 
  case CC_A(_, CC_C(_, _), CC_A(_, _, _)) => 8 
  case CC_A(12, CC_C(_, _), CC_A(_, _, _)) => 9 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 10 
  case CC_A(_, _, CC_B(_, _)) => 11 
  case CC_A(12, CC_A(_, _, _), CC_C(_, _)) => 12 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 13 
  case CC_A(12, CC_A(_, _, _), CC_A(_, _, _)) => 14 
  case CC_A(_, _, CC_A(_, _, _)) => 15 
  case CC_A(12, CC_B(_, _), CC_C(_, _)) => 16 
  case CC_A(_, _, _) => 17 
}
}
// This is not matched: (CC_B Int
//      Int
//      Byte
//      Wildcard
//      (CC_C Byte
//            Int
//            (CC_A Byte Byte Wildcard Wildcard Wildcard (T_A Byte Byte))
//            Wildcard
//            (T_A Int Byte))
//      (T_A Int Int))
// This is not matched: (CC_B Int
//      Int
//      Byte
//      Wildcard
//      (CC_C Byte
//            Int
//            (CC_A Byte Byte Wildcard Wildcard Wildcard (T_A Byte Byte))
//            Wildcard
//            (T_A Int Byte))
//      (T_A Int Int))