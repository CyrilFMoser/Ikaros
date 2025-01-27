package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E]) extends T_A[E, T_B[T_A[Boolean, Int], (Boolean,Byte)]]
case class CC_B[G, F](a: T_A[G, F], b: (Boolean,T_B[Int, Byte]), c: (Char,T_A[Int, Boolean])) extends T_B[F, G]
case class CC_C() extends T_B[CC_B[CC_A[Byte], T_B[Char, Boolean]], CC_A[T_B[Boolean, Int]]]
case class CC_D(a: Int, b: T_B[CC_A[Byte], (Char,CC_C)]) extends T_B[CC_B[CC_A[Byte], T_B[Char, Boolean]], CC_A[T_B[Boolean, Int]]]

val v_a: T_B[CC_B[CC_A[Byte], T_B[Char, Boolean]], CC_A[T_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, (true,CC_B(_, _, _)), _) => 0 
  case CC_B(_, (false,CC_B(_, _, _)), _) => 1 
  case CC_C() => 2 
  case CC_D(_, CC_B(_, _, _)) => 3 
}
}