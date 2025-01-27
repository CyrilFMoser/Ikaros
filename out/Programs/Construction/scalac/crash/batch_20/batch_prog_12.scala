package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: C, c: (Boolean,T_A[Int, Boolean])) extends T_A[D, C]

val v_a: CC_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}