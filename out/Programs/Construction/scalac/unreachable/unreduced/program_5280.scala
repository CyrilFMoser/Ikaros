package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Char]]) extends T_A[T_B[T_A[(Char,Int), (Byte,Byte)]], ((Byte,Char),T_B[Int])]
case class CC_B(a: CC_A, b: Int) extends T_A[T_B[T_A[(Char,Int), (Byte,Byte)]], ((Byte,Char),T_B[Int])]
case class CC_C[D](a: T_B[D], b: T_B[D], c: T_A[D, D]) extends T_B[D]
case class CC_D[E](a: T_B[E]) extends T_B[E]

val v_a: T_A[T_B[T_A[(Char,Int), (Byte,Byte)]], ((Byte,Char),T_B[Int])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_C(_, _, _), _)) => 0 
  case CC_A(CC_C(_, CC_D(_), _)) => 1 
  case CC_A(CC_D(CC_C(_, _, _))) => 2 
  case CC_A(CC_D(CC_D(_))) => 3 
  case CC_B(CC_A(CC_C(_, _, _)), _) => 4 
  case CC_B(CC_A(CC_D(_)), _) => 5 
}
}