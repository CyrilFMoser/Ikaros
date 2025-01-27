package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_B, b: T_B[CC_B, C]) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}