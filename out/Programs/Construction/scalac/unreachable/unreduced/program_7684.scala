package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Boolean)], b: T_A[Int], c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_B, b: CC_A, c: Char) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), CC_A(_, _, _), _) => 2 
}
}