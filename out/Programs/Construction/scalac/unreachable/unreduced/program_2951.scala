package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Int, T_A[T_A[Byte, Int], T_A[Byte, Int]]], T_A[T_A[Byte, Int], T_A[Byte, Int]]], b: T_A[C, C]) extends T_A[T_A[Int, C], C]
case class CC_B[E](a: CC_A[E], b: T_A[T_A[Int, E], E]) extends T_A[T_A[Int, E], E]
case class CC_C(a: (CC_A[Char],T_A[Int, Int]), b: Byte) extends T_A[T_A[Int, Int], Int]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), _) => 1 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _)), _) => 2 
  case CC_B(_, CC_A(_, _)) => 3 
  case CC_B(_, CC_B(CC_A(_, _), CC_A(_, _))) => 4 
  case CC_B(_, CC_B(CC_A(_, _), CC_B(_, _))) => 5 
  case CC_B(_, CC_B(CC_A(_, _), CC_C(_, _))) => 6 
  case CC_B(_, CC_C((_,_), _)) => 7 
  case CC_C(_, _) => 8 
}
}