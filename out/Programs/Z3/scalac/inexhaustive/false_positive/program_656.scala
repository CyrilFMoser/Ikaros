package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Char)) extends T_A[T_A[Boolean, Char], C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants