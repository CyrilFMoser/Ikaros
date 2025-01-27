package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[(Char,Boolean)]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_C[C](a: C, b: C, c: T_B[C]) extends T_B[C]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
}
}