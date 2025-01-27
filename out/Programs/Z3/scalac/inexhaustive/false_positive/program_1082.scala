package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_C[G](a: G) extends T_A[(Byte,Byte), G]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants