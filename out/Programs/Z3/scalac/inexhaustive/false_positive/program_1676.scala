package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Byte, T_A]) extends T_A
case class CC_C(a: T_B[CC_B, (Int,Byte)], b: CC_B, c: CC_A) extends T_A
case class CC_D[C](a: T_A) extends T_B[T_A, C]
case class CC_E[D, E, F]() extends T_B[E, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(CC_E(), CC_B(_), CC_A()) => 2 
  case CC_C(CC_E(), _, CC_A()) => 3 
  case CC_C(CC_E(), CC_B(_), _) => 4 
}
}
// This is not matched: (CC_C (CC_E (Tuple Int Byte)
//            (CC_B T_A T_A)
//            T_A
//            (T_B (CC_B T_A T_A) (Tuple Int Byte)))
//      Wildcard
//      Wildcard
//      T_A)
// This is not matched: (CC_C (CC_E (Tuple Int Byte)
//            (CC_B T_A T_A)
//            T_A
//            (T_B (CC_B T_A T_A) (Tuple Int Byte)))
//      Wildcard
//      Wildcard
//      T_A)