package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[(Byte,Char)]
case class CC_B() extends T_A[(Byte,Char)]
case class CC_C(a: CC_B, b: CC_A[CC_B], c: CC_B) extends T_B[T_B[CC_B]]

val v_a: T_A[(Byte,Char)] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_C(_, _, _)) => 1 
}
}
// This is not matched: (CC_A (T_B (CC_B Boolean))
//      (CC_C (CC_B (T_A (Tuple Byte Char)))
//            (CC_A (CC_B Boolean) Wildcard (T_A (Tuple Byte Char)))
//            (CC_B (T_A (Tuple Byte Char)))
//            (T_B (T_B (CC_B Boolean))))
//      (T_A (Tuple Byte Char)))
// This is not matched: (CC_A T_B Int Wildcard Wildcard Wildcard (T_A Int T_B))