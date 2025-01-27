package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Byte, b: T_A[T_A[(Byte,Byte)]], c: T_A[Boolean]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}