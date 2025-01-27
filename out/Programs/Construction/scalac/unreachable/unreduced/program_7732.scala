package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[H, G](a: (T_A[Boolean, Byte],CC_A[(Char,Boolean), Byte]), b: T_B[H, G]) extends T_A[H, G]
case class CC_C[I, J]() extends T_A[I, J]
case class CC_D[K](a: K, b: T_A[Byte, K], c: CC_C[T_A[K, K], K]) extends T_B[K, ((Int,Boolean),CC_B[Char, Byte])]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A()), _) => 1 
  case CC_B((CC_B(_, _),CC_A()), _) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B((CC_C(),CC_A()), _)