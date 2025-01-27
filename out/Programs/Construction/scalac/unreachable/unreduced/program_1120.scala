package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Char, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_B, b: T_B[T_A, C], c: T_A) extends T_B[T_A, C]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), CC_C(_, _, _), CC_A(_, _)) => 0 
  case CC_C(CC_B(), CC_C(_, _, _), CC_B()) => 1 
}
}