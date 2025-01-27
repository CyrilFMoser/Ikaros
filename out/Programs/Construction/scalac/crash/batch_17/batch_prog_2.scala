package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Char]], b: T_B[T_B[Int]], c: T_B[T_A]) extends T_A
case class CC_B(a: Char, b: (CC_A,T_A)) extends T_A
case class CC_C(a: Boolean) extends T_A
case class CC_D[B](a: CC_A, b: T_B[Int], c: Int) extends T_B[B]
case class CC_E[C](a: Byte) extends T_B[C]
case class CC_F(a: T_A, b: T_B[T_B[CC_B]], c: T_B[((Char,Byte),(Byte,Boolean))]) extends T_B[(Char,Int)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (CC_A(_, _, _),CC_A(_, _, _))) => 1 
  case CC_B(_, (CC_A(_, _, _),CC_B(_, _))) => 2 
  case CC_C(true) => 3 
  case CC_C(false) => 4 
}
}
// This is not matched: CC_B(_, (CC_A(_, _, _),CC_C(_)))