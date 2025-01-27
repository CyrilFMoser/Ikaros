package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[CC_A[Byte]]) extends T_B[T_A[CC_A[Boolean]]]
case class CC_C(a: CC_B, b: T_B[T_B[Char]]) extends T_B[T_A[CC_A[Boolean]]]
case class CC_D(a: CC_B, b: CC_B) extends T_B[T_A[T_B[CC_B]]]

val v_a: T_B[T_A[CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_C(CC_B(CC_A(_, _, _)), _) => 1 
}
}