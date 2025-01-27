package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: T_A[Byte]) extends T_A[Byte]
case class CC_C[B](a: CC_B, b: T_A[T_B], c: B) extends T_B
case class CC_D(a: CC_C[(Boolean,Int)], b: T_A[Int]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), _, _) => 0 
  case CC_D(_, _) => 1 
  case CC_E() => 2 
}
}