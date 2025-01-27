package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: Int) extends T_A[T_B, C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_B, D]
case class CC_C[E](a: T_A[T_B, E], b: E) extends T_A[T_B, E]
case class CC_D(a: CC_B[Int]) extends T_B
case class CC_E(a: Byte, b: CC_A[T_A[T_B, T_B]], c: CC_B[Int]) extends T_B
case class CC_F(a: T_A[T_B, T_A[CC_D, Int]], b: (T_A[T_B, CC_E],Int), c: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_)) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(_, (CC_A(_, _),_), _) => 2 
  case CC_F(_, (CC_B(_),_), _) => 3 
  case CC_F(_, (CC_C(_, _),_), _) => 4 
}
}