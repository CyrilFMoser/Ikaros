package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Boolean], b: T_A[(Byte,Int)]) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}