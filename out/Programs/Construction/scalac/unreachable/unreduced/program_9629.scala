package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D]) extends T_A[D, T_B[T_A[(Int,Byte), Char]]]
case class CC_B[E]() extends T_A[E, T_B[T_A[(Int,Byte), Char]]]

val v_a: T_A[Int, T_B[T_A[(Int,Byte), Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}