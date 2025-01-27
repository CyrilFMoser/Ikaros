package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(Boolean,T_A[Boolean, Byte]), Char]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}