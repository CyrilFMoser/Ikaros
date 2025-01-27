package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[CC_A[T_B], T_B]) extends T_A[T_A[CC_A[T_B], CC_A[T_B]], CC_A[T_B]]
case class CC_C(a: CC_A[(CC_B,T_B)], b: T_A[((Byte,Boolean),Char), Boolean]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_B, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _) => 0 
  case CC_D() => 1 
  case CC_E(CC_B(_), CC_B(_)) => 2 
}
}