package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Char)) extends T_A[T_A[Char, Boolean], C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants