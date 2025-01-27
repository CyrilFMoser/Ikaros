package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: CC_A[T_A[(Char,Char)]], b: T_A[T_A[Int]]) extends T_A[T_A[Byte]]
case class CC_C(a: CC_B, b: Char) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B(CC_A(_), _)) => 3 
  case CC_A(CC_C(CC_B(_, _), 'x')) => 4 
  case CC_A(CC_C(CC_B(_, _), _)) => 5 
  case CC_B(_, _) => 6 
  case CC_C(_, _) => 7 
}
}