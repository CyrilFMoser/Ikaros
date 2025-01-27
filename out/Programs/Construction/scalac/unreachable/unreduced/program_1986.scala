package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(T_A,Byte), T_B[T_A, T_A]], c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B[C](a: T_B[T_A, C], b: T_B[C, C]) extends T_B[T_A, C]
case class CC_C[D](a: D) extends T_B[T_A, D]
case class CC_D[E](a: Byte, b: E) extends T_B[T_A, E]

val v_a: T_B[T_A, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_), _), _) => 1 
  case CC_B(CC_B(CC_D(_, _), _), _) => 2 
  case CC_B(CC_C(_), _) => 3 
  case CC_B(CC_D(_, _), _) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_D(_, _)