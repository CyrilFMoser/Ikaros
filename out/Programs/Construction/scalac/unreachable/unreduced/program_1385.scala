package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Byte, Byte],T_A[Int, Char])) extends T_A[C, T_A[T_A[(Boolean,Boolean), (Int,Char)], T_A[Char, Byte]]]
case class CC_B[D](a: CC_A[CC_A[D]], b: T_A[D, D]) extends T_A[D, T_A[T_A[(Boolean,Boolean), (Int,Char)], T_A[Char, Byte]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[(Boolean,Boolean), (Int,Char)], T_A[Char, Byte]]]

val v_a: T_A[Byte, T_A[T_A[(Boolean,Boolean), (Int,Char)], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(0, (_,_)) => 0 
  case CC_A(_, (_,_)) => 1 
  case CC_B(CC_A(_, _), _) => 2 
  case CC_C() => 3 
}
}