package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]], b: T_B[T_B[(Char,Int)]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: T_A[(CC_A,CC_A)]) extends T_A[T_B[T_A[Byte]]]
case class CC_C[C](a: Int) extends T_A[T_B[T_A[Byte]]]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}