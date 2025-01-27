package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Int,Byte)], b: T_A[Char], c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: CC_A, c: T_A[T_A[Char]]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, _, _), _) => 2 
}
}