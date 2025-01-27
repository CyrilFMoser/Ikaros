package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(T_A[Char, (Boolean,Int)],T_A[Byte, Char]), E]
case class CC_B(a: T_A[Byte, Char], b: T_B[Char, Boolean]) extends T_A[(T_A[Char, (Boolean,Int)],T_A[Byte, Char]), CC_A[CC_A[Char]]]
case class CC_C[G, F](a: CC_B, b: T_B[G, F]) extends T_B[G, F]
case class CC_D[H, I](a: Byte) extends T_B[I, H]

val v_a: T_A[(T_A[Char, (Boolean,Int)],T_A[Byte, Char]), CC_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_C(CC_B(_, _), CC_C(_, _))) => 1 
  case CC_B(_, CC_C(CC_B(_, _), CC_D(_))) => 2 
  case CC_B(_, CC_D(_)) => 3 
}
}