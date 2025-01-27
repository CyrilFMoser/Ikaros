package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Byte,Byte), T_B[(Boolean,Int), Int]]) extends T_A[T_B[Byte, T_B[Int, Boolean]]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[Byte]) extends T_A[T_B[Byte, T_B[Int, Boolean]]]
case class CC_C(a: CC_A, b: CC_A) extends T_A[T_B[Byte, T_B[Int, Boolean]]]
case class CC_D[E, D](a: (T_B[CC_B, CC_B],CC_A), b: ((CC_A,Boolean),CC_C), c: CC_B) extends T_B[D, E]
case class CC_E[F](a: T_B[F, F], b: (CC_A,T_B[Int, CC_A]), c: (CC_C,T_A[CC_A])) extends T_B[Int, F]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, ((_,_),CC_C(_, _)), CC_B(CC_A(_), CC_A(_), _)) => 0 
  case CC_E(_, _, _) => 1 
}
}