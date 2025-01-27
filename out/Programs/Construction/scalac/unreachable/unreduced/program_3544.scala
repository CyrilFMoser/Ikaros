package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_B[T_B[Int, Char], T_B[Char, Char]], c: T_B[(Boolean,Char), (Byte,(Byte,Int))]) extends T_A[T_A[(Byte,Char)]]
case class CC_B(a: T_B[T_A[CC_A], T_A[Int]], b: CC_A) extends T_A[T_A[(Byte,Char)]]
case class CC_C[D](a: T_A[D], b: T_A[D], c: Boolean) extends T_A[T_A[(Byte,Char)]]
case class CC_D[E](a: Int, b: Int, c: Boolean) extends T_B[E, CC_B]
case class CC_E[F](a: (T_B[Byte, CC_B],CC_D[CC_A]), b: CC_B) extends T_B[F, CC_B]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}