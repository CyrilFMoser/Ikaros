package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Int,T_B[Boolean]), b: T_A[T_A[T_A[(Char,Int)]]]) extends T_A[C]
case class CC_B[E](a: T_B[E], b: Char) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D(a: T_A[T_B[Boolean]], b: T_A[Char], c: Byte) extends T_B[Char]
case class CC_E(a: CC_C[Int]) extends T_B[Byte]
case class CC_F(a: Int, b: T_A[CC_A[CC_D]], c: CC_C[T_B[CC_D]]) extends T_B[Char]

val v_a: T_A[CC_F] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_A(_, CC_A(_, CC_C())) => 2 
  case CC_A(_, CC_C()) => 3 
  case CC_B(_, _) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_A(_, CC_B(_, _))