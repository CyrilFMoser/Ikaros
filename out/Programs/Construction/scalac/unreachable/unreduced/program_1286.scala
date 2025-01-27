package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_A[Byte]], b: T_B[T_A[Byte], T_A[Int]]) extends T_A[Byte]
case class CC_B[D, E]() extends T_B[D, E]
case class CC_C[F](a: F, b: CC_A) extends T_B[F, T_B[Char, T_B[CC_A, CC_A]]]
case class CC_D[G, H](a: (T_A[CC_A],T_B[CC_A, CC_A]), b: T_A[H]) extends T_B[H, G]

val v_a: T_B[Boolean, T_B[Char, T_B[CC_A, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_, _)) => 1 
  case CC_D((_,_), _) => 2 
}
}