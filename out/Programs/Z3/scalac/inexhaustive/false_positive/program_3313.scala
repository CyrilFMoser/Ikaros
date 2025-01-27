package Program_13 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Byte, C]) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[Byte, D]
case class CC_C[E, F](a: T_A[Byte, E], b: T_B, c: CC_A[F]) extends T_A[Byte, E]
case class CC_D(a: T_A[Byte, Boolean], b: T_A[Byte, T_B], c: Char) extends T_B

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_) => 1 
  case CC_C(CC_C(_, _, _), CC_D(_, _, _), CC_A(_)) => 2 
  case CC_C(_, _, CC_A(_)) => 3 
  case CC_C(CC_A(_), _, CC_A(_)) => 4 
  case CC_C(CC_C(_, _, _), CC_D(_, _, _), _) => 5 
  case CC_C(CC_A(_), CC_D(_, _, _), CC_A(_)) => 6 
  case CC_C(CC_A(_), _, _) => 7 
  case CC_C(_, CC_D(_, _, _), CC_A(_)) => 8 
  case CC_C(CC_B(), _, _) => 9 
  case CC_C(CC_B(), _, CC_A(_)) => 10 
  case CC_C(CC_B(), CC_D(_, _, _), CC_A(_)) => 11 
  case CC_C(CC_B(), CC_D(_, _, _), _) => 12 
}
}
// This is not matched: (CC_C T_B
//      (T_A (CC_D T_B T_B T_B T_B) Boolean)
//      (CC_B T_B (T_A Byte T_B))
//      (CC_D (CC_B Boolean (T_A Byte Boolean))
//            (CC_A T_B Wildcard (T_A Byte T_B))
//            Wildcard
//            T_B)
//      (CC_A (T_A (CC_D T_B T_B (T_A T_B T_B) T_B) Boolean)
//            (CC_C (T_A (CC_D T_B T_B T_B T_B) Boolean)
//                  T_B
//                  (CC_B (T_A (CC_D T_B T_B T_B T_B) Boolean)
//                        (T_A Byte (T_A (CC_D T_B T_B T_B T_B) Boolean)))
//                  Wildcard
//                  Wildcard
//                  (T_A Byte (T_A (CC_D T_B T_B T_B T_B) Boolean)))
//            (T_A Byte (T_A (CC_D T_B T_B (T_A T_B T_B) T_B) Boolean)))
//      (T_A Byte T_B))
// This is not matched: Pattern match is empty without constants