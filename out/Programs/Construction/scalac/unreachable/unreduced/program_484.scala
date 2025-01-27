package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G](a: T_B[G, G], b: T_B[T_B[G, G], G], c: (Int,T_B[Boolean, Int])) extends T_A[G, T_A[G, G]]
case class CC_C[H]() extends T_A[H, T_A[H, H]]
case class CC_D[I]() extends T_B[CC_A[CC_A[Boolean, Byte], CC_A[Boolean, Char]], I]
case class CC_E() extends T_B[CC_A[CC_A[Boolean, Byte], CC_A[Boolean, Char]], T_A[CC_B[Boolean], T_B[Char, Int]]]
case class CC_F[J](a: CC_C[J]) extends T_B[CC_A[CC_A[Boolean, Byte], CC_A[Boolean, Char]], J]

val v_a: T_A[T_B[CC_A[CC_A[Boolean, Byte], CC_A[Boolean, Char]], T_A[CC_B[Boolean], T_B[Char, Int]]], T_A[T_B[CC_A[CC_A[Boolean, Byte], CC_A[Boolean, Char]], T_A[CC_B[Boolean], T_B[Char, Int]]], T_B[CC_A[CC_A[Boolean, Byte], CC_A[Boolean, Char]], T_A[CC_B[Boolean], T_B[Char, Int]]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, (_,_)) => 1 
}
}
// This is not matched: CC_C()