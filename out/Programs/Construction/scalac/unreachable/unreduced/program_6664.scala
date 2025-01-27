package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: Byte) extends T_A
case class CC_B(a: CC_A[CC_A[T_A]], b: T_A, c: T_B[T_B[(Byte,Byte), T_A], (Int,T_A)]) extends T_A
case class CC_C[D](a: CC_A[D], b: CC_A[D]) extends T_B[D, CC_A[D]]
case class CC_D() extends T_B[T_B[Char, Boolean], CC_A[T_B[Char, Boolean]]]

val v_a: T_B[T_B[Char, Boolean], CC_A[T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_D() => 1 
}
}