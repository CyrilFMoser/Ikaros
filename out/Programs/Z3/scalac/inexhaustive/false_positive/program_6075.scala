package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants