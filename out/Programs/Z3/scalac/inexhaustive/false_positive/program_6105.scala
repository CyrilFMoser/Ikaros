package Program_14 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[Char, (Byte,Int)]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[Char, (Byte,Int)]
case class CC_C[E, F]() extends T_A[E, F]

val v_a: CC_A[T_A[Char, (Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A (T_A Char (Tuple Byte Int))
//      Wildcard
//      (CC_B Boolean Wildcard Wildcard (T_A Char (Tuple Byte Int)))
//      Wildcard
//      (T_A Char (Tuple Byte Int)))
// This is not matched: (CC_A T_A)