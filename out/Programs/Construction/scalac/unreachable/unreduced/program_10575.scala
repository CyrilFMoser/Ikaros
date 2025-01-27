package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[(Byte,Int), T_A]], c: T_B[Int, Int]) extends T_A
case class CC_B(a: T_B[Boolean, T_A], b: CC_A, c: Byte) extends T_A
case class CC_C(a: T_B[Int, T_B[CC_A, T_A]], b: CC_B, c: CC_B) extends T_A
case class CC_D[C]() extends T_B[C, Char]
case class CC_E[D](a: T_B[D, Char], b: D, c: CC_A) extends T_B[D, Char]
case class CC_F[E](a: T_B[E, Char], b: E) extends T_B[E, Char]

val v_a: T_B[CC_A, Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), _, _) => 1 
  case CC_E(CC_F(CC_D(), CC_A(_, _, _)), _, _) => 2 
  case CC_E(CC_F(CC_E(_, _, _), CC_A(_, _, _)), _, _) => 3 
  case CC_E(CC_F(CC_F(_, _), CC_A(_, _, _)), _, _) => 4 
  case CC_F(_, CC_A(CC_A(_, _, _), _, _)) => 5 
  case CC_F(_, CC_A(CC_B(_, _, _), _, _)) => 6 
  case CC_F(_, CC_A(CC_C(_, _, _), _, _)) => 7 
}
}
// This is not matched: CC_E(CC_E(_, _, _), _, _)