package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_A[T_B[Char, Byte]], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_A[(CC_A,CC_A)], b: T_A[Int]) extends T_B[Byte, T_A[Boolean]]
case class CC_C() extends T_B[Byte, T_A[Boolean]]
case class CC_D(a: CC_A) extends T_B[Byte, T_A[Boolean]]

val v_a: T_B[Byte, T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
  case CC_D(_) => 2 
}
}