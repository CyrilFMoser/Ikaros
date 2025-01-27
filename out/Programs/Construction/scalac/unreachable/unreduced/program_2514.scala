package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C, c: T_B[C]) extends T_A[C]
case class CC_B(a: Int, b: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: T_A[T_A[CC_B]], b: T_A[T_B[CC_B]]) extends T_A[Byte]
case class CC_D[D](a: D) extends T_B[CC_A[T_A[Byte]]]
case class CC_E(a: CC_A[CC_C], b: CC_A[T_A[Char]]) extends T_B[CC_A[T_A[Byte]]]

val v_a: T_B[CC_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_A(CC_A(_, _, _), CC_C(_, _), _), CC_A(_, _, _)) => 1 
}
}