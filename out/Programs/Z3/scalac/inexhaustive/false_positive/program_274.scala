package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: Char) extends T_A[(Char,Int)]

val v_a: T_A[(Char,Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants