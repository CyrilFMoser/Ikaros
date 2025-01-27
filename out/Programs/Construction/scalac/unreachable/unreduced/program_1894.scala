package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B(a: T_B[T_A[Byte]], b: T_A[T_A[Boolean]]) extends T_B[CC_A[T_A[Char]]]
case class CC_C(a: T_A[CC_A[Char]], b: CC_B, c: CC_B) extends T_B[CC_A[T_A[Char]]]

val v_a: T_B[CC_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_C(_, _, _) => 1 
}
}