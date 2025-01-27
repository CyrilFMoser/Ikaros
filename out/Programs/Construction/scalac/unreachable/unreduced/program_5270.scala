package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Int]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, C], b: T_A) extends T_B[C, T_B[Byte, T_B[T_A, CC_B]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}