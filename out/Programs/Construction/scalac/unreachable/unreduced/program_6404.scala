package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[T_A[(Char,Boolean)]]) extends T_A[C]
case class CC_B[E](a: T_A[E], b: T_A[E]) extends T_A[E]
case class CC_C(a: Byte) extends T_A[T_A[T_A[Byte]]]
case class CC_D(a: T_A[T_A[CC_C]], b: T_B[T_B[Char]]) extends T_B[Char]
case class CC_E(a: Int) extends T_B[Char]
case class CC_F(a: T_A[Int], b: T_A[(CC_D,CC_D)]) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), _) => 0 
  case CC_D(CC_A(CC_B(_, _), CC_A(_, _)), _) => 1 
  case CC_D(CC_A(CC_A(_, _), CC_B(_, _)), _) => 2 
  case CC_D(CC_A(CC_B(_, _), CC_B(_, _)), _) => 3 
  case CC_D(CC_B(CC_A(_, _), CC_A(_, _)), _) => 4 
  case CC_D(CC_B(CC_B(_, _), CC_A(_, _)), _) => 5 
  case CC_D(CC_B(CC_A(_, _), CC_B(_, _)), _) => 6 
  case CC_D(CC_B(CC_B(_, _), CC_B(_, _)), _) => 7 
  case CC_E(_) => 8 
  case CC_F(_, CC_A((_,_), CC_A(_, _))) => 9 
  case CC_F(_, CC_A((_,_), CC_B(_, _))) => 10 
  case CC_F(_, CC_B(CC_A(_, _), CC_A(_, _))) => 11 
  case CC_F(_, CC_B(CC_A(_, _), CC_B(_, _))) => 12 
  case CC_F(_, CC_B(CC_B(_, _), CC_A(_, _))) => 13 
  case CC_F(_, CC_B(CC_B(_, _), CC_B(_, _))) => 14 
}
}