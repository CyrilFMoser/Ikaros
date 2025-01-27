package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]], b: Char, c: Char) extends T_A[T_B[T_A[Char]]]
case class CC_B[C](a: (Int,T_B[CC_A]), b: (T_B[CC_A],Byte)) extends T_B[C]
case class CC_C[D](a: T_B[D], b: D, c: T_B[(CC_A,CC_A)]) extends T_B[D]
case class CC_D[E](a: E, b: E, c: CC_B[E]) extends T_B[E]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B((_,_), (_,_)), _, _) => 0 
  case CC_A(CC_C(_, _, _), _, _) => 1 
  case CC_A(CC_D(_, _, CC_B(_, _)), _, _) => 2 
}
}