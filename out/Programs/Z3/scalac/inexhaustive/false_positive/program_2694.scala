package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,(Int,Boolean)), b: T_A[C, C]) extends T_A[C, (Char,Char)]

val v_a: T_A[Int, (Char,Char)] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants