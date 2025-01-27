package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_A[T_B[Byte, Byte]]]
case class CC_B(a: T_B[(Boolean,Int), CC_A[Char]], b: T_B[Int, T_B[Int, Boolean]], c: T_A[T_B[(Char,Char), Char]]) extends T_A[T_A[T_B[Byte, Byte]]]

val v_a: T_A[T_A[T_B[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}