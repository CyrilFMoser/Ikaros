package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_A[D], D], b: (T_B[Byte, Byte],Char), c: Byte) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C(a: Int, b: T_B[(Byte,Int), CC_B[Int]], c: Byte) extends T_A[CC_B[Boolean]]
case class CC_D[F]() extends T_B[Byte, F]
case class CC_E[G, H](a: T_B[G, H], b: Char, c: H) extends T_B[G, CC_D[((Byte,Byte),CC_C)]]
case class CC_F() extends T_B[Byte, T_A[CC_A[CC_C]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_D(),_), _) => 0 
  case CC_B(_) => 1 
}
}