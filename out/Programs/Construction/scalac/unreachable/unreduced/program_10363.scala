package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Boolean) extends T_A[T_B[T_A[Boolean, Byte], T_B[Boolean, Char]], (Char,T_B[Boolean, Boolean])]
case class CC_B(a: T_A[T_B[Int, Int], ((Boolean,Byte),Boolean)], b: T_B[CC_A[(Byte,Int)], CC_A[Byte]]) extends T_A[T_B[T_A[Boolean, Byte], T_B[Boolean, Char]], (Char,T_B[Boolean, Boolean])]
case class CC_C[F]() extends T_A[F, CC_A[F]]
case class CC_D[H, G](a: T_B[G, G], b: H, c: CC_B) extends T_B[G, H]

val v_a: T_A[T_B[T_A[Boolean, Byte], T_B[Boolean, Char]], (Char,T_B[Boolean, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_D(CC_D(_, _, _), CC_A(_, _), CC_B(_, _))) => 1 
}
}