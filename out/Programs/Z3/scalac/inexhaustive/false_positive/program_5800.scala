package Program_14 

object Test {
sealed trait T_A[A]
case class CC_B[D](a: Int) extends T_A[D]

val v_a: CC_B[T_A[T_A[(Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants