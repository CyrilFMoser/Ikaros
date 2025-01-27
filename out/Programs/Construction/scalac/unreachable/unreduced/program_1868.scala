package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_A[T_A[Char, Byte], T_A[(Int,Boolean), Char]]]
case class CC_B[E](a: Char) extends T_A[E, T_A[T_A[Char, Byte], T_A[(Int,Boolean), Char]]]
case class CC_C() extends T_A[CC_A[Boolean], T_A[CC_B[(Int,Int)], CC_A[Int]]]
case class CC_D[F](a: F, b: CC_B[F], c: F) extends T_B[F]
case class CC_E(a: CC_B[Boolean], b: (CC_D[(Byte,Byte)],CC_B[CC_C]), c: Boolean) extends T_B[T_B[CC_B[Boolean]]]

val v_a: T_A[CC_E, T_A[T_A[Char, Byte], T_A[(Int,Boolean), Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}