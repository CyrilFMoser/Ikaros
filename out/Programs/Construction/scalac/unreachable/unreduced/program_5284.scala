package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[(Int,Int), T_B[(Int,Byte), Boolean]]) extends T_A[T_A[T_B[Byte, Char], Char], T_A[T_B[Boolean, Char], T_B[Int, (Char,Int)]]]
case class CC_B() extends T_A[T_A[T_B[Byte, Char], Char], T_A[T_B[Boolean, Char], T_B[Int, (Char,Int)]]]
case class CC_C() extends T_A[T_A[T_B[Byte, Char], Char], T_A[T_B[Boolean, Char], T_B[Int, (Char,Int)]]]
case class CC_D[E](a: (CC_A,CC_C), b: Boolean) extends T_B[Int, E]
case class CC_E() extends T_B[Int, CC_A]
case class CC_F(a: CC_D[(Char,CC_B)]) extends T_B[Int, CC_A]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_D((CC_A(_),CC_C()), _) => 0 
  case CC_F(CC_D(_, _)) => 1 
}
}
// This is not matched: CC_E()