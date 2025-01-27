package Program_13 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[Char, (Byte,Int)]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[Char, (Byte,Int)]
case class CC_C[E, F]() extends T_A[E, F]

val v_a: CC_A[T_A[Char, (Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), CC_C(), CC_C()) => 0 
  case CC_A(CC_C(), CC_C(), _) => 1 
  case CC_A(_, CC_C(), CC_C()) => 2 
}
}
// This is not matched: (CC_A (T_A Char (Tuple Byte Int))
//      (CC_C (T_A Char (Tuple Byte Int))
//            (T_A Char (Tuple Byte Int))
//            (T_A (T_A Char (Tuple Byte Int)) (T_A Char (Tuple Byte Int))))
//      (CC_B Boolean Wildcard Wildcard (T_A Char (Tuple Byte Int)))
//      Wildcard
//      (T_A Char (Tuple Byte Int)))
// This is not matched: (CC_A T_A)