package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D], b: T_A[C], c: T_B[C]) extends T_A[C]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: T_A[Byte], b: CC_B[Boolean], c: CC_A[Byte, Byte]) extends T_B[(Int,Int)]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: (CC_C Char (CC_B Char (T_A Char)) Wildcard Wildcard (T_A Char))