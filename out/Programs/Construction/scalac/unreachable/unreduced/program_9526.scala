package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B(a: (T_B[Int, Byte],T_A[Char]), b: T_A[T_A[Byte]], c: T_A[CC_A[Boolean]]) extends T_A[T_A[T_B[Byte, Char]]]
case class CC_C(a: T_A[T_A[Char]], b: T_A[T_A[CC_B]], c: T_A[Boolean]) extends T_A[T_A[T_B[Byte, Char]]]
case class CC_D[E]() extends T_B[Boolean, E]

val v_a: T_A[T_A[T_B[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B((_,_), CC_A(_), CC_A(_))) => 3 
  case CC_A(CC_C(_, _, _)) => 4 
  case CC_B(_, _, CC_A(CC_A(_))) => 5 
  case CC_C(CC_A(_), CC_A(CC_A(_)), CC_A(_)) => 6 
}
}