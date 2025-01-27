package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]], b: T_A[(Byte,Boolean)]) extends T_A[T_A[T_A[(Char,Char)]]]
case class CC_B(a: T_B[Char]) extends T_A[T_A[T_A[(Char,Char)]]]
case class CC_C[C](a: CC_A) extends T_B[C]
case class CC_D[D](a: T_A[D]) extends T_B[D]

val v_a: T_A[T_A[T_A[(Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}