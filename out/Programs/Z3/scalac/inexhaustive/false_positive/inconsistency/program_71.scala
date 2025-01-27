package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, C], b: C) extends T_A[T_A[Boolean, Char], C]

val v_a: T_A[T_A[Boolean, Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: Pattern match is empty without constants