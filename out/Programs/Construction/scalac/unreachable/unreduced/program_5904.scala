package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E], b: E) extends T_A[F, E]
case class CC_B[G](a: CC_A[G, G]) extends T_B[G, Int]
case class CC_C[H]() extends T_B[H, Int]
case class CC_D[I](a: T_B[I, I], b: T_A[I, I], c: T_B[I, Int]) extends T_B[I, Int]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_, CC_A(CC_A(_, _), _), CC_B(CC_A(_, _))) => 2 
  case CC_D(_, CC_A(CC_A(_, _), _), CC_C()) => 3 
  case CC_D(_, CC_A(CC_A(_, _), _), CC_D(_, _, CC_B(_))) => 4 
  case CC_D(_, CC_A(CC_A(_, _), _), CC_D(_, _, CC_D(_, _, _))) => 5 
}
}
// This is not matched: CC_D(_, CC_A(CC_A(_, _), _), CC_D(_, _, CC_C()))