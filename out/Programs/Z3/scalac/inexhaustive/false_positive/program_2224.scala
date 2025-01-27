package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Int,Char)) extends T_A[C, (Byte,Boolean)]

val v_a: T_A[Int, (Byte,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants