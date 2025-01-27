package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_A[D]) extends T_A[D]
case class CC_B() extends T_A[(T_A[Int],T_B[Char, Boolean])]
case class CC_C[E](a: (T_B[CC_B, Char],T_A[CC_B]), b: Byte, c: T_A[E]) extends T_A[E]
case class CC_D[F]() extends T_B[F, CC_C[F]]
case class CC_E(a: T_B[(Byte,CC_B), CC_C[(Byte,CC_B)]], b: CC_B, c: (CC_C[CC_B],T_A[CC_B])) extends T_B[T_A[Byte], CC_C[T_A[Byte]]]
case class CC_F[G](a: T_A[G]) extends T_B[CC_E, G]

val v_a: T_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _, CC_A(_, CC_A(_, _))) => 1 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _))) => 2 
  case CC_C(_, _, CC_C((_,_), _, CC_A(_, _))) => 3 
  case CC_C(_, _, CC_C((_,_), _, CC_C(_, _, _))) => 4 
}
}