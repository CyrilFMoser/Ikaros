package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[T_A[D, D], D]) extends T_A[D, T_B[Byte]]
case class CC_B[E](a: T_B[T_A[T_B[Int], T_B[Int]]], b: E) extends T_B[E]
case class CC_C[G](a: G, b: T_A[G, G]) extends T_B[G]
case class CC_D[H](a: (Int,(Int,Boolean))) extends T_B[T_B[T_A[Byte, Byte]]]

val v_a: T_B[T_B[T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), CC_B(_, _)) => 0 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(_, _)) => 1 
  case CC_B(CC_C(_, _), CC_B(_, _)) => 2 
  case CC_B(CC_B(CC_B(_, _), _), CC_C(_, _)) => 3 
  case CC_B(CC_B(CC_C(_, _), _), CC_C(_, _)) => 4 
  case CC_B(CC_C(_, _), CC_C(_, _)) => 5 
  case CC_C(CC_B(CC_B(_, _), _), _) => 6 
  case CC_C(CC_B(CC_C(_, _), _), _) => 7 
  case CC_C(CC_C(_, _), _) => 8 
  case CC_D(_) => 9 
}
}