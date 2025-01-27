package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A[Int]], b: Boolean, c: T_B[CC_A[Byte], T_A[Char]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C[E](a: (T_A[CC_B],T_A[CC_B]), b: CC_A[E]) extends T_B[E, ((CC_B,CC_B),CC_A[CC_B])]
case class CC_D[F](a: F) extends T_B[F, ((CC_B,CC_B),CC_A[CC_B])]
case class CC_E[G](a: T_B[G, G]) extends T_B[G, ((CC_B,CC_B),CC_A[CC_B])]

val v_a: T_B[Char, ((CC_B,CC_B),CC_A[CC_B])] = null
val v_b: Int = v_a match{
  case CC_C((_,_), CC_A(_)) => 0 
  case CC_D(_) => 1 
  case CC_E(_) => 2 
}
}