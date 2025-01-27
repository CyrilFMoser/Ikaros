package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C](a: CC_A[C], b: (Int,Byte), c: T_A[C]) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_B Char
//      Wildcard
//      Wildcard
//      (CC_B Char Wildcard Wildcard Wildcard (T_A Char))
//      (T_A Char))