package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: T_A[T_B, T_B]) extends T_A[Boolean, Char]
case class CC_B(a: (T_A[CC_A, Byte],T_B), b: CC_A, c: T_A[Boolean, Char]) extends T_A[Boolean, Char]
case class CC_C() extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_B, b: T_A[(CC_B,CC_C), T_A[(Int,Byte), CC_B]], c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(_, _, CC_A(_, _)) => 2 
}
}