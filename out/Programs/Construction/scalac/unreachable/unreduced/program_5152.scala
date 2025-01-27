package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Boolean,T_A[T_B, Int]), b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_B, b: (T_B,T_B)) extends T_A[T_A[T_B, T_B], T_B]
case class CC_C[D](a: (T_A[CC_B, (Char,Byte)],CC_B)) extends T_A[T_A[D, D], D]
case class CC_D(a: T_A[T_A[Byte, Byte], Byte], b: T_A[T_A[Boolean, Boolean], Boolean]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _)) => 0 
  case CC_D(_, CC_C(_)) => 1 
  case CC_E() => 2 
  case CC_F(CC_D(CC_A(_, _), _)) => 3 
  case CC_F(CC_D(CC_C(_), _)) => 4 
}
}