package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: T_B[T_A]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_B[(T_B[Byte],T_A)]
case class CC_D[B](a: CC_B, b: Int, c: T_B[CC_C]) extends T_B[B]

val v_a: T_B[(T_B[Byte],T_A)] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}