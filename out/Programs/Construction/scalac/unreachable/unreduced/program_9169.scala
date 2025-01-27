package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[(Char,Int)], Int]) extends T_A[T_B[T_A[Byte], Boolean]]
case class CC_B(a: Char) extends T_A[T_B[T_A[Byte], Boolean]]
case class CC_C(a: T_A[T_B[CC_A, CC_B]]) extends T_A[T_B[T_A[Byte], Boolean]]
case class CC_D() extends T_B[CC_A, CC_B]

val v_a: T_A[T_B[T_A[Byte], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}