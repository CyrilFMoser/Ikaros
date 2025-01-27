package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B(a: T_A[T_A[Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: (T_B[CC_B, Char],(CC_B,CC_B)), b: CC_A[T_A[CC_B]], c: T_B[T_A[CC_B], ((Int,Byte),Byte)]) extends T_A[T_A[T_A[Char]]]
case class CC_D[E]() extends T_B[E, Boolean]
case class CC_E[F](a: CC_A[F], b: (Int,Byte), c: CC_B) extends T_B[F, Boolean]
case class CC_F[G](a: CC_A[G]) extends T_B[G, Boolean]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_A(CC_C(_, _, _)) => 2 
  case CC_B(_) => 3 
  case CC_C(_, CC_A(_), _) => 4 
}
}