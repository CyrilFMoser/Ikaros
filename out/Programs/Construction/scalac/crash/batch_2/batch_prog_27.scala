package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Int,T_B[Int]), b: T_A[C]) extends T_A[C]
case class CC_B[D](a: Byte, b: T_A[D]) extends T_B[D]
case class CC_C[E]() extends T_B[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_B(_, _)), CC_A((_,_), _)) => 0 
  case CC_A((_,CC_C()), CC_A((_,_), _)) => 1 
}
}