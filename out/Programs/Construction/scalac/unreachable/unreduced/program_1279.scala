package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: T_A[T_A[C, C], (T_B,T_B)]) extends T_A[C, T_A[T_B, (Boolean,(Int,Byte))]]
case class CC_B() extends T_A[T_B, T_A[T_B, (Boolean,(Int,Byte))]]
case class CC_C[D]() extends T_A[D, T_A[D, D]]
case class CC_D(a: T_A[Byte, T_A[Byte, Byte]], b: CC_A[CC_B]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_E, b: Byte) extends T_B

val v_a: T_A[T_B, T_A[T_B, (Boolean,(Int,Byte))]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), CC_D(_, _), _) => 0 
  case CC_A(CC_E(), CC_D(_, _), _) => 1 
  case CC_A(CC_F(_, _), CC_D(_, _), _) => 2 
  case CC_A(CC_D(_, _), CC_E(), _) => 3 
  case CC_A(CC_E(), CC_E(), _) => 4 
  case CC_A(CC_F(_, _), CC_E(), _) => 5 
  case CC_A(CC_D(_, _), CC_F(_, _), _) => 6 
  case CC_A(CC_E(), CC_F(_, _), _) => 7 
  case CC_A(CC_F(_, _), CC_F(_, _), _) => 8 
  case CC_B() => 9 
}
}