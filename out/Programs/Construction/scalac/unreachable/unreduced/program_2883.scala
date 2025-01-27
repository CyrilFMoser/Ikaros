package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[(Byte,Char), Char], T_A[(Int,Char), Byte]]]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[E, E], b: E, c: CC_A[E]) extends T_A[(CC_B[Boolean],CC_B[Byte]), E]

val v_a: T_A[(CC_B[Boolean],CC_B[Byte]), T_A[T_A[(Byte,Char), Char], T_A[(Int,Char), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A(), _, _) => 1 
}
}