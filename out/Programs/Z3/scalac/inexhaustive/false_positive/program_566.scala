package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: D, b: T_B, c: T_B) extends T_A[D, C]
case class CC_B[E](a: (Byte,T_B), b: Char, c: CC_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: CC_B[F]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_)) => 0 
  case CC_A(12, _, CC_C(_)) => 1 
  case CC_A(_, _, CC_D()) => 2 
  case CC_A(12, CC_D(), _) => 3 
  case CC_A(12, CC_C(_), CC_C(_)) => 4 
  case CC_A(12, CC_D(), CC_C(_)) => 5 
  case CC_A(12, CC_C(_), _) => 6 
}
}
// This is not matched: (CC_A Int
//      Char
//      Wildcard
//      (CC_C T_B Wildcard T_B)
//      (CC_C (CC_D T_B)
//            (CC_B (CC_D (T_A T_B T_B))
//                  Wildcard
//                  Char
//                  (CC_A (CC_D T_B)
//                        (CC_D T_B)
//                        Wildcard
//                        Wildcard
//                        (CC_D T_B)
//                        (T_A (CC_D T_B) (CC_D T_B)))
//                  (T_A (CC_D (T_A T_B T_B))
//                       (T_A (CC_D (T_A T_B T_B)) (CC_D (T_A T_B T_B)))))
//            T_B)
//      (T_A Int Char))
// This is not matched: Pattern match is empty without constants