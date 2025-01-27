package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B[E](a: E) extends T_A[(CC_A[Boolean],(Int,(Byte,Boolean))), E]
case class CC_C[F]() extends T_A[F, CC_A[CC_B[(Byte,Char)]]]
case class CC_D(a: CC_B[T_B[(Int,Int)]], b: T_A[CC_C[Byte], T_B[Byte]]) extends T_B[CC_C[T_A[Int, Boolean]]]
case class CC_E() extends T_B[CC_C[T_A[Int, Boolean]]]
case class CC_F[G](a: G, b: Char) extends T_B[G]

val v_a: T_B[CC_C[T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_), _) => 0 
  case CC_F(_, _) => 1 
}
}
// This is not matched: CC_E()