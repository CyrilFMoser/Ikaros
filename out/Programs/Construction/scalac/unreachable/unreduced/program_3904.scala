package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[T_B[D], D]
case class CC_B[F](a: F, b: (T_A[Boolean, Boolean],T_B[Byte])) extends T_B[F]
case class CC_C[G](a: T_B[G]) extends T_B[G]
case class CC_D[H](a: ((Byte,Boolean),T_B[Int]), b: Byte, c: T_B[H]) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,CC_B(_, _))) => 0 
  case CC_B(_, (_,CC_C(_))) => 1 
  case CC_B(_, (_,CC_D(_, _, _))) => 2 
  case CC_C(CC_C(CC_B(_, _))) => 3 
  case CC_C(CC_C(CC_C(_))) => 4 
  case CC_C(CC_C(CC_D(_, _, _))) => 5 
  case CC_C(CC_D(_, _, _)) => 6 
  case CC_D(_, _, _) => 7 
}
}
// This is not matched: CC_C(CC_B(_, (_,_)))