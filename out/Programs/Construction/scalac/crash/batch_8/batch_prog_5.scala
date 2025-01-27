package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B[B](a: (T_B[Byte],T_B[CC_A]), b: CC_A, c: T_B[B]) extends T_B[B]
case class CC_C() extends T_B[T_A]
case class CC_D(a: CC_C, b: CC_B[T_A]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}