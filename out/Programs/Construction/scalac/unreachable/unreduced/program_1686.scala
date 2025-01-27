package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[T_B[Byte]]) extends T_A[T_B[T_A[Char]]]
case class CC_B(a: T_A[Byte]) extends T_A[T_B[T_A[Char]]]
case class CC_C(a: Byte, b: Int) extends T_A[T_B[T_A[Char]]]
case class CC_D[C](a: (T_B[CC_B],CC_B), b: CC_A, c: T_B[C]) extends T_B[C]
case class CC_E[D](a: CC_D[T_B[D]]) extends T_B[D]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}