package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[T_A[Char]], c: T_A[T_B[(Int,Char)]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B() extends T_A[T_B[T_B[Byte]]]
case class CC_C(a: CC_A, b: Int) extends T_A[T_B[T_B[Byte]]]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
}
}