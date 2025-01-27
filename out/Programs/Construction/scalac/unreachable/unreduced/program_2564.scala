package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B(a: T_B, b: T_A[T_B, T_A[(Byte,Int), T_B]], c: CC_A[T_A[T_B, T_B]]) extends T_B
case class CC_C[D](a: T_A[D, D], b: D) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A(_, _)), _, CC_A(_, _)) => 0 
  case CC_B(CC_B(CC_C(_, _), _, CC_A(_, _)), _, CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_D(), _, CC_A(_, _)), _, CC_A(_, _)) => 2 
  case CC_B(CC_C(_, _), _, CC_A(_, _)) => 3 
  case CC_B(CC_D(), _, CC_A(_, _)) => 4 
  case CC_C(_, _) => 5 
  case CC_D() => 6 
}
}