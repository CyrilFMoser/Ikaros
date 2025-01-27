package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]]) extends T_A[T_B[T_A[Char]]]
case class CC_B() extends T_A[T_B[T_A[Char]]]
case class CC_C(a: CC_B) extends T_A[T_B[T_A[Char]]]
case class CC_D() extends T_B[T_B[CC_C]]
case class CC_E() extends T_B[T_B[CC_C]]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}