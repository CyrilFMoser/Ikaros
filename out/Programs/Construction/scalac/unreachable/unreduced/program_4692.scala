package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[T_A[T_A[Char]]]
case class CC_B[B](a: B, b: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: T_A[Byte]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_B(_, _)) => 1 
}
}