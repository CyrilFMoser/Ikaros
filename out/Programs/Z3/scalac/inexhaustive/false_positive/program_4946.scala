package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,(Int,Byte)), b: T_A[C, C]) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants