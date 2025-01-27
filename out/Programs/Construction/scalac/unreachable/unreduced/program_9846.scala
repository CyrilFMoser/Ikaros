package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: Byte, c: Char) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B, b: Char, c: T_B[(CC_B,(Byte,Int))]) extends T_A[T_A[T_A[Char]]]
case class CC_D[C](a: CC_C, b: T_B[C]) extends T_B[C]
case class CC_E() extends T_B[CC_B]
case class CC_F(a: CC_A) extends T_B[CC_B]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_C(_, _, _), CC_D(_, _)), _, _) => 0 
  case CC_C(CC_B(CC_A(_, _, _), _), _, CC_D(_, CC_D(_, _))) => 1 
}
}
// This is not matched: CC_B(_, _)