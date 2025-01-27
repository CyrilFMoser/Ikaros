package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (T_B[Int, Byte],T_A[Boolean, Int]), b: (T_B[Char, Char],T_B[Boolean, Boolean]), c: (T_A[Int, Char],T_A[Char, Boolean])) extends T_A[E, F]
case class CC_B[G, H](a: G, b: T_A[G, G]) extends T_A[H, G]
case class CC_C[I]() extends T_B[I, CC_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, Boolean]]]
case class CC_D[J](a: T_A[J, J], b: T_A[J, J], c: T_A[J, J]) extends T_B[J, CC_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, Boolean]]]
case class CC_E() extends T_B[Int, CC_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, Boolean]]]

val v_a: T_B[Int, CC_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A((_,_), _, _), _, CC_A((_,_), _, _)) => 1 
  case CC_D(CC_A((_,_), _, _), _, CC_B(_, _)) => 2 
  case CC_D(CC_B(_, _), _, CC_A((_,_), _, _)) => 3 
  case CC_E() => 4 
}
}
// This is not matched: CC_D(CC_B(_, _), _, CC_B(_, _))