package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[(Int,Byte), C]) extends T_A[T_A[Char, (Boolean,Boolean)], C]
case class CC_B[D, E](a: Char, b: CC_A[E]) extends T_A[T_A[Char, (Boolean,Boolean)], D]

val v_a: T_A[T_A[Char, (Boolean,Boolean)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B('x', _) => 2 
}
}
// This is not matched: (CC_B Char
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_A Char (Tuple Boolean Boolean)) Char))
// This is not matched: (CC_A Char Wildcard Wildcard (T_A (T_A Char (Tuple Boolean Boolean)) Char))