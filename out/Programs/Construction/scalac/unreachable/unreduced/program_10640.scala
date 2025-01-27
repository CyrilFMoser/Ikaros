package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[(Byte,Boolean), T_B[(Boolean,Int), Byte]]) extends T_A[T_A[T_A[Char, Boolean], T_B[Char, Byte]], T_A[(Boolean,Char), T_B[Boolean, Char]]]
case class CC_B[F, E]() extends T_A[E, F]
case class CC_C(a: T_A[T_A[Byte, CC_A], Boolean], b: T_B[T_B[CC_A, Byte], (CC_A,CC_A)]) extends T_A[T_A[T_A[Char, Boolean], T_B[Char, Byte]], T_A[(Boolean,Char), T_B[Boolean, Char]]]
case class CC_D[G](a: T_A[G, G], b: Int, c: (CC_A,CC_A)) extends T_B[G, Boolean]

val v_a: T_A[T_A[T_A[Char, Boolean], T_B[Char, Byte]], T_A[(Boolean,Char), T_B[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)