package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(T_A,T_A), T_B[T_A, T_A]]) extends T_A
case class CC_B[C](a: T_A) extends T_A
case class CC_C(a: CC_B[T_A], b: CC_B[T_B[T_A, CC_A]]) extends T_A
case class CC_D[D]() extends T_B[CC_A, D]
case class CC_E(a: T_B[CC_D[CC_C], T_B[(Byte,Char), Int]], b: Int) extends T_B[Int, CC_C]
case class CC_F(a: T_B[Int, CC_C], b: CC_A, c: T_B[Int, CC_C]) extends T_B[CC_A, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _), _), _) => 2 
  case CC_A(CC_B(_), _) => 3 
  case CC_A(CC_C(_, CC_B(_)), _) => 4 
  case CC_B(CC_A(_, _)) => 5 
  case CC_B(CC_B(CC_A(_, _))) => 6 
  case CC_B(CC_B(CC_B(_))) => 7 
  case CC_B(CC_B(CC_C(_, _))) => 8 
  case CC_B(CC_C(_, _)) => 9 
  case CC_C(_, CC_B(_)) => 10 
}
}