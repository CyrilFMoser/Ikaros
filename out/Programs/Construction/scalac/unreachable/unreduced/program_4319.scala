package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: B) extends T_A
case class CC_B(a: T_B[Byte]) extends T_A
case class CC_C(a: CC_B) extends T_B[T_A]
case class CC_D(a: Char) extends T_B[T_A]
case class CC_E(a: CC_D, b: T_B[T_A]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}