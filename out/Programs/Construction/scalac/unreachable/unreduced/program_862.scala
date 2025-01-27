package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Boolean, T_B[Char, Char]], b: T_B[T_B[Char, (Int,Byte)], T_A[Boolean, Boolean]]) extends T_A[T_B[(Byte,Int), T_A[(Char,Boolean), Byte]], T_B[T_B[Boolean, Int], T_A[Byte, Byte]]]
case class CC_B(a: T_B[CC_A, T_A[CC_A, CC_A]]) extends T_A[T_B[(Byte,Int), T_A[(Char,Boolean), Byte]], T_B[T_B[Boolean, Int], T_A[Byte, Byte]]]
case class CC_C[E, F]() extends T_B[F, E]
case class CC_D[H, G](a: CC_C[G, H], b: T_B[H, H], c: (T_B[CC_B, Int],T_A[CC_B, Boolean])) extends T_B[H, G]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_C(), (_,_)) => 1 
  case CC_D(_, CC_D(_, _, _), (_,_)) => 2 
}
}