package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, D], b: T_A[C, C], c: D) extends T_A[C, D]

val v_a: CC_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}