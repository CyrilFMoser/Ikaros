package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Int, C], b: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: Char, b: D) extends T_A[Int, D]
case class CC_C[E]() extends T_A[Int, E]
case class CC_D(a: Char, b: Byte, c: T_A[Int, (T_B,T_B)]) extends T_B
case class CC_E(a: (T_B,T_A[T_B, CC_D]), b: (T_A[Int, T_B],CC_D)) extends T_B

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, 0), _) => 1 
  case CC_A(CC_B(_, _), _) => 2 
  case CC_A(CC_C(), _) => 3 
  case CC_B(_, _) => 4 
  case CC_C() => 5 
}
}