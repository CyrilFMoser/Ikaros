package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Byte) extends T_A[T_B, T_B]
case class CC_B(a: T_A[T_B, T_B], b: T_A[CC_A, T_A[Int, T_B]], c: (T_A[T_B, T_B],Byte)) extends T_A[T_B, T_B]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, _) => 2 
}
}