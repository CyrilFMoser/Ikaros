package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_B[T_A[Char], (Int,Byte)], b: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_C[E]() extends T_B[E, CC_B]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}