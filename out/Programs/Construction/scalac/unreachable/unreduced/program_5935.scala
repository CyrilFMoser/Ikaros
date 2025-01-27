package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Char,(Char,Boolean))) extends T_A[D, T_B[T_A[Byte, Char]]]
case class CC_B[E](a: E, b: T_B[E], c: (Char,CC_A[Char])) extends T_A[E, T_B[T_A[Byte, Char]]]
case class CC_C[F](a: T_A[CC_A[CC_B[Char]], CC_B[CC_A[CC_B[Char]]]], b: F) extends T_A[F, CC_B[F]]
case class CC_D(a: CC_B[T_B[Char]], b: T_B[(Boolean,(Byte,Char))], c: CC_A[CC_A[Boolean]]) extends T_B[CC_C[CC_B[Boolean]]]

val v_a: T_A[Boolean, T_B[T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_, _, ('x',CC_A(_))) => 1 
  case CC_B(_, _, (_,CC_A(_))) => 2 
}
}