package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: E) extends T_A[E, T_A[(Boolean,Byte), T_B[Boolean, Int]]]
case class CC_B[F, G](a: T_A[G, F]) extends T_A[F, T_A[(Boolean,Byte), T_B[Boolean, Int]]]
case class CC_C[H](a: H, b: Byte, c: (CC_B[Byte, (Boolean,Byte)],T_A[Char, Char])) extends T_A[H, T_A[(Boolean,Byte), T_B[Boolean, Int]]]
case class CC_D[J, I]() extends T_B[I, J]

val v_a: T_A[Int, T_A[(Boolean,Byte), T_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}