package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: (T_A[Byte, Byte],T_B[Boolean]), b: T_B[E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D(a: CC_B[T_B[Char]]) extends T_B[Byte]

val v_a: T_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_B(_, _)), CC_B((_,_), CC_B(_, _))) => 0 
  case CC_B((_,CC_C()), CC_B((_,_), CC_B(_, _))) => 1 
  case CC_B((_,CC_B(_, _)), CC_B((_,_), CC_C())) => 2 
  case CC_B((_,CC_C()), CC_B((_,_), CC_C())) => 3 
  case CC_B((_,CC_B(_, _)), CC_C()) => 4 
  case CC_B((_,CC_C()), CC_C()) => 5 
  case CC_C() => 6 
}
}