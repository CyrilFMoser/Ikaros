package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: (T_A[(Byte,Int), T_B],T_B), b: T_A[D, D]) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, Char], b: Byte) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_C(CC_B((_,_), _), _) => 1 
}
}