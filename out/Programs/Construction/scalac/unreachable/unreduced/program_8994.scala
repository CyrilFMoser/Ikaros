package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Int, C]
case class CC_B(a: T_A[Char, T_A[Int, T_B]], b: T_B, c: Char) extends T_A[Int, CC_A[T_A[T_B, Char]]]
case class CC_C() extends T_A[Byte, T_A[T_B, CC_B]]

val v_a: T_A[Int, CC_A[T_A[T_B, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, 'x') => 1 
  case CC_B(_, _, _) => 2 
}
}