package Program_14 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Boolean) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C[E](a: T_B, b: T_B, c: T_A[T_B, Char]) extends T_A[T_B, Char]
case class CC_D(a: T_A[T_B, T_B], b: CC_A[T_B]) extends T_B

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _)) => 0 
  case CC_C(_, _, CC_C(_, _, _)) => 1 
  case CC_C(CC_D(_, _), CC_D(_, _), CC_C(_, _, _)) => 2 
  case CC_C(CC_D(_, _), CC_D(_, _), CC_B()) => 3 
  case CC_C(_, CC_D(_, _), CC_A(_, _)) => 4 
}
}
// This is not matched: (CC_C Byte
//      Wildcard
//      Wildcard
//      (CC_C T_B
//            Wildcard
//            (CC_D (CC_B T_B (T_A T_B T_B))
//                  (CC_A T_B Wildcard Wildcard (T_A T_B T_B))
//                  T_B)
//            (CC_C T_B
//                  (CC_D (CC_A T_B Wildcard Wildcard (T_A T_B T_B))
//                        (CC_A T_B
//                              (CC_B T_B (T_A T_B T_B))
//                              Wildcard
//                              (T_A T_B T_B))
//                        T_B)
//                  (CC_D (CC_B T_B (T_A T_B T_B)) Wildcard T_B)
//                  (CC_A Char Wildcard Wildcard (T_A T_B Char))
//                  (T_A T_B Char))
//            (T_A T_B Char))
//      (T_A T_B Char))
// This is not matched: (CC_B Wildcard
//      (Tuple (CC_A Wildcard T_A) (CC_A Wildcard T_A))
//      (CC_A Wildcard T_A)
//      T_A)