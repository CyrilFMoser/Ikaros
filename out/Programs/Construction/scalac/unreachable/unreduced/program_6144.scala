package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Boolean]) extends T_A[T_A[T_B[Char]]]
case class CC_B(a: Int) extends T_A[T_A[T_B[Char]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_B[Char]]]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}