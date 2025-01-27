package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[T_A[T_A[Char]]], c: (Byte,T_A[Char])) extends T_A[D]
case class CC_B[F](a: (T_A[Char],T_A[Boolean]), b: (CC_A[Boolean],Int), c: T_A[F]) extends T_A[F]
case class CC_C[G](a: CC_A[G], b: T_A[G], c: T_B[G, G]) extends T_A[G]
case class CC_D[H](a: Boolean, b: T_A[H], c: T_A[H]) extends T_B[CC_A[T_A[Char]], H]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), (_,_)) => 0 
  case CC_A(_, CC_B(_, _, _), (_,_)) => 1 
  case CC_A(_, CC_C(_, _, _), (_,_)) => 2 
  case CC_B((_,_), _, CC_A(_, _, _)) => 3 
  case CC_B((_,_), _, CC_B(_, _, _)) => 4 
  case CC_B((_,_), _, CC_C(_, _, _)) => 5 
  case CC_C(CC_A(_, _, _), _, _) => 6 
}
}