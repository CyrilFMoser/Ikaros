package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[T_B[Int]]]
case class CC_B() extends T_A[T_A[T_B[Int]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_B[Int]]]

val v_a: T_A[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}