package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Byte, c: Int) extends T_A[T_B[T_A[Int, Byte], T_B[Byte, Byte]], E]
case class CC_B[F, G](a: (T_A[Char, Int],T_B[Byte, Boolean])) extends T_B[F, G]
case class CC_C[H, I](a: T_B[H, I], b: Int) extends T_B[H, I]
case class CC_D[K, J]() extends T_B[K, J]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_B(_))) => 0 
  case CC_B((_,CC_C(_, _))) => 1 
  case CC_B((_,CC_D())) => 2 
  case CC_C(CC_B((_,_)), _) => 3 
  case CC_C(CC_C(CC_B(_), _), _) => 4 
  case CC_C(CC_C(CC_C(_, _), _), _) => 5 
  case CC_C(CC_D(), _) => 6 
  case CC_D() => 7 
}
}
// This is not matched: CC_C(CC_C(CC_D(), _), _)