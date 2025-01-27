package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D]) extends T_A[D]
case class CC_B(a: Byte, b: T_A[Int], c: T_A[Int]) extends T_A[Int]
case class CC_C[F, E, G](a: CC_A[G]) extends T_B[F, E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), _) => 0 
  case CC_A(CC_A(_, _), CC_C(_)) => 1 
  case CC_B(0, CC_B(_, _, _), CC_A(_, _)) => 2 
  case CC_B(0, CC_A(_, _), CC_A(_, _)) => 3 
  case CC_B(_, CC_A(_, _), _) => 4 
  case CC_B(_, _, CC_A(_, _)) => 5 
  case CC_B(_, _, CC_B(_, _, _)) => 6 
  case CC_B(0, CC_A(_, _), CC_B(_, _, _)) => 7 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 8 
  case CC_B(_, CC_B(_, _, _), _) => 9 
  case CC_B(0, CC_B(_, _, _), _) => 10 
  case CC_B(_, CC_A(_, _), CC_B(_, _, _)) => 11 
}
}
// This is not matched: (CC_A Int
//      (CC_A Int
//            Wildcard
//            (CC_C Int
//                  Int
//                  (CC_A Boolean Boolean (T_A Boolean) Boolean)
//                  (CC_A (CC_A Boolean Boolean Boolean Boolean)
//                        Wildcard
//                        Wildcard
//                        (T_A (CC_A Boolean Boolean Boolean Boolean)))
//                  (T_B Int Int))
//            (T_A Int))
//      (CC_C Int Int Boolean Wildcard (T_B Int Int))
//      (T_A Int))
// This is not matched: (CC_B (CC_B (CC_B (CC_A T_A) (CC_A T_A) T_A) (CC_A T_A) T_A) Wildcard T_A)