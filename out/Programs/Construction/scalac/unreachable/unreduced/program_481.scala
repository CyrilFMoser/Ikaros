package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: CC_A, c: CC_A) extends T_A
case class CC_C[C](a: T_B[C, C], b: T_B[CC_B, C], c: T_B[CC_B, C]) extends T_B[CC_B, C]
case class CC_D[D](a: Int, b: T_B[CC_B, D]) extends T_B[CC_B, D]

val v_a: CC_D[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, _, _)) => 0 
  case CC_D(_, CC_D(_, _)) => 1 
}
}