package Program_30 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C]) extends T_A[C]
case class CC_B(a: Byte, b: CC_A[Byte, Char], c: T_B[Char]) extends T_B[T_A[Char]]
case class CC_C[E](a: E, b: E, c: T_B[E]) extends T_B[E]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A Byte))
// This is not matched: (CC_A (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Boolean))
//      Byte
//      Wildcard
//      (CC_A (T_A Char (Tuple Boolean Int))
//            (T_A Char Boolean)
//            Byte
//            Wildcard
//            (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Boolean)))
//      (T_A (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Boolean)) Byte))