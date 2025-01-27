package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean]) extends T_A[T_B]
case class CC_B(a: T_A[Byte]) extends T_A[T_A[Char]]
case class CC_C(a: Byte) extends T_B
case class CC_D(a: T_A[T_A[Char]], b: T_A[T_A[Char]], c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_B(_), CC_B(_), CC_A(_)) => 1 
}
}