package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Byte, E]
case class CC_B[F](a: (CC_A[Byte],T_A[Byte, (Byte,Int)]), b: (T_A[Char, Byte],T_A[Byte, Boolean])) extends T_A[Byte, F]
case class CC_C[G](a: T_A[Byte, G]) extends T_A[Byte, G]
case class CC_D[H, I](a: T_A[Byte, I], b: H, c: T_A[Byte, H]) extends T_B[H, I]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), (_,_)) => 1 
  case CC_C(_) => 2 
}
}