package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[(Int,Byte), T_B], T_A[T_B, T_B]]) extends T_A[T_B, T_B]
case class CC_B() extends T_A[T_B, T_B]
case class CC_C() extends T_B
case class CC_D(a: CC_A, b: T_A[T_B, T_B], c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_), CC_A(_), _) => 1 
  case CC_D(CC_A(_), CC_B(), _) => 2 
}
}