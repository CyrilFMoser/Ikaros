package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: T_B[CC_B], b: CC_A, c: CC_A) extends T_A[Byte]
case class CC_D() extends T_B[T_A[Boolean]]
case class CC_E(a: T_A[(CC_D,(Byte,Boolean))], b: Char) extends T_B[T_A[Boolean]]

val v_a: T_B[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
}
}