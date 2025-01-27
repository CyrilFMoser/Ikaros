package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: Char, c: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[CC_A], c: Int) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: Char, b: Int) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}