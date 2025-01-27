package Program_28 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: (T_A,T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C[D, C, E](a: T_B[D, D], b: CC_A, c: T_B[CC_A, E]) extends T_B[D, C]
case class CC_D[F, G](a: T_B[G, Int], b: T_A, c: CC_A) extends T_B[F, G]
case class CC_E[H](a: CC_B, b: Boolean) extends T_B[Boolean, H]

val v_a: CC_D[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), CC_A(_, _), CC_A(_, _)) => 0 
  case CC_D(CC_D(_, _, _), CC_A(_, _), _) => 1 
  case CC_D(CC_C(_, _, _), CC_A(_, _), _) => 2 
  case CC_D(CC_D(_, _, _), _, _) => 3 
  case CC_D(CC_C(_, _, _), CC_B(), _) => 4 
  case CC_D(CC_D(_, _, _), CC_B(), _) => 5 
  case CC_D(CC_C(_, _, _), _, _) => 6 
  case CC_D(_, CC_B(), CC_A(_, _)) => 7 
}
}
// This is not matched: (CC_D (CC_B (T_B T_A T_A))
//      Int
//      (CC_C Int
//            Int
//            T_A
//            Wildcard
//            (CC_A Wildcard Wildcard T_A)
//            (CC_C (CC_A Wildcard Wildcard Wildcard)
//                  T_A
//                  T_A
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_B (CC_A Wildcard Wildcard Wildcard) T_A))
//            (T_B Int Int))
//      (CC_A Wildcard Wildcard T_A)
//      Wildcard
//      (T_B (CC_B (T_B T_A T_A)) Int))
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_B Boolean (Tuple Byte Char)))