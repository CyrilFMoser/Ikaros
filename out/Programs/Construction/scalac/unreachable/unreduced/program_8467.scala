package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Boolean, Boolean],(Boolean,Int)), b: T_B[D], c: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B[E](a: CC_A[CC_A[E]], b: E, c: T_A[Char, E]) extends T_A[CC_A[((Boolean,Char),Char)], E]
case class CC_C[F]() extends T_A[CC_A[((Boolean,Char),Char)], F]
case class CC_D(a: T_A[T_B[(Boolean,Int)], (Boolean,Int)], b: T_B[T_B[Char]]) extends T_B[T_A[T_B[CC_B[Byte]], CC_B[Byte]]]
case class CC_E(a: CC_A[CC_C[CC_D]], b: CC_A[CC_D]) extends T_B[T_A[T_B[CC_B[Byte]], CC_B[Byte]]]
case class CC_F(a: (CC_C[Int],CC_E)) extends T_B[T_A[T_B[CC_B[Byte]], CC_B[Byte]]]

val v_a: T_B[T_A[T_B[CC_B[Byte]], CC_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_F((CC_C(),CC_E(_, _))) => 2 
}
}