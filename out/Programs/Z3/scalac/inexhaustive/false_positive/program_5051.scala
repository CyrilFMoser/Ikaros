package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[Boolean, C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants