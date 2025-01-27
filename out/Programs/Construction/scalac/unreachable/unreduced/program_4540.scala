package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Boolean) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: Char) extends T_A[T_A[D, D], D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_B(CC_B(CC_A(_, _), _), _) => 1 
  case CC_B(CC_B(CC_B(_, _), _), _) => 2 
}
}