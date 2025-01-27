package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Boolean,Byte)) extends T_A[C]
case class CC_B[D, E](a: D, b: T_B[E], c: T_A[D]) extends T_B[D]
case class CC_C(a: CC_A[Byte], b: T_A[Int]) extends T_B[Int]
case class CC_D(a: CC_A[(Int,Int)]) extends T_B[Int]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_B(CC_D(_), CC_C(_, _), _) => 1 
  case CC_B(CC_B(_, _, _), CC_D(_), _) => 2 
  case CC_B(CC_C(_, _), CC_B(_, _, _), _) => 3 
  case CC_B(_, _, CC_A(_)) => 4 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A(_)) => 5 
  case CC_B(CC_C(_, _), _, _) => 6 
  case CC_B(CC_D(_), CC_B(_, _, _), CC_A(_)) => 7 
  case CC_B(CC_B(_, _, _), _, _) => 8 
  case CC_B(CC_B(_, _, _), CC_C(_, _), _) => 9 
  case CC_B(CC_D(_), CC_B(_, _, _), _) => 10 
  case CC_B(CC_B(_, _, _), CC_D(_), CC_A(_)) => 11 
  case CC_B(CC_D(_), CC_D(_), CC_A(_)) => 12 
  case CC_B(CC_C(_, _), CC_C(_, _), CC_A(_)) => 13 
  case CC_B(CC_C(_, _), CC_C(_, _), _) => 14 
  case CC_B(CC_D(_), CC_D(_), _) => 15 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 16 
}
}
// This is not matched: (CC_B (T_B Int)
//      (T_A (T_A (CC_C Boolean Boolean (T_A Boolean))))
//      (CC_B Int
//            Boolean
//            Wildcard
//            Wildcard
//            (CC_A Int Wildcard (T_A Int))
//            (T_B Int))
//      (CC_B (T_A (T_A (CC_C Boolean Boolean Boolean)))
//            Boolean
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_B (T_A (T_A (CC_C Boolean Boolean Boolean)))))
//      Wildcard
//      (T_B (T_B Int)))
// This is not matched: (CC_A Char Wildcard (T_A Char))