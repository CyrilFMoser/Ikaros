package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C](a: T_B[C, C]) extends T_B[CC_A, C]
case class CC_C[D](a: CC_A, b: CC_A, c: T_A) extends T_B[CC_A, D]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, CC_A(_)) => 1 
}
}