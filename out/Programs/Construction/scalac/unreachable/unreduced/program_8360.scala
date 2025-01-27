package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: Byte, b: T_B[E, E]) extends T_A[E]
case class CC_C(a: T_A[CC_B[Char]], b: CC_A[T_A[Int]]) extends T_A[T_A[Byte]]
case class CC_D(a: T_A[T_A[CC_C]], b: T_A[T_A[CC_C]]) extends T_B[T_A[T_A[(Byte,Byte)]], CC_A[CC_B[CC_C]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_B(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}