package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[(Int,Int), T_B], T_A[T_B, T_B]], C]
case class CC_B(a: T_B, b: Char) extends T_A[CC_A[T_A[T_B, Boolean]], T_A[T_B, CC_A[T_B]]]
case class CC_C(a: Char, b: CC_A[CC_B]) extends T_B
case class CC_D(a: CC_B, b: Int, c: CC_A[CC_B]) extends T_B
case class CC_E(a: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_D(CC_B(_, _), _, CC_A(_)) => 1 
  case CC_E(_) => 2 
}
}