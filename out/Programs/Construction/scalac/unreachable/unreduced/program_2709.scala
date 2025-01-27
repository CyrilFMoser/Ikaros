package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[T_A[Char, Int]], D]
case class CC_B[E, F]() extends T_A[T_B[T_A[Char, Int]], E]
case class CC_C[G](a: T_A[T_B[Byte], G], b: (CC_B[Int, Boolean],CC_B[Byte, Boolean])) extends T_B[G]
case class CC_D[H](a: H, b: (Byte,Boolean), c: T_B[H]) extends T_B[H]
case class CC_E[I](a: T_B[I]) extends T_B[I]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, (_,_), CC_C(_, (_,_))) => 1 
  case CC_D(_, (_,_), CC_D(_, (_,_), CC_C(_, _))) => 2 
  case CC_D(_, (_,_), CC_D(_, (_,_), CC_D(_, _, _))) => 3 
  case CC_D(_, (_,_), CC_D(_, (_,_), CC_E(_))) => 4 
  case CC_D(_, (_,_), CC_E(CC_C(_, _))) => 5 
  case CC_D(_, (_,_), CC_E(CC_D(_, _, _))) => 6 
  case CC_D(_, (_,_), CC_E(CC_E(_))) => 7 
  case CC_E(CC_D(_, (_,_), _)) => 8 
  case CC_E(CC_E(CC_C(_, _))) => 9 
  case CC_E(CC_E(CC_D(_, _, _))) => 10 
  case CC_E(CC_E(CC_E(_))) => 11 
}
}
// This is not matched: CC_E(CC_C(_, (_,_)))