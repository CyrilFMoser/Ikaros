package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Byte, T_B[(Boolean,Boolean), Int]], b: T_B[T_B[Char, Byte], T_B[Boolean, Int]], c: T_B[T_B[Int, Char], T_B[Char, Byte]]) extends T_A[T_B[T_A[Boolean], T_B[Int, Int]]]
case class CC_B[D](a: T_A[D], b: D) extends T_A[D]
case class CC_C[E](a: CC_B[T_A[E]], b: T_A[E]) extends T_A[E]
case class CC_D() extends T_B[Char, T_A[Boolean]]

val v_a: T_A[T_B[T_A[Boolean], T_B[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(CC_B(_, _), CC_A(_, _, _)), _) => 3 
  case CC_B(CC_C(CC_B(_, _), CC_B(_, _)), _) => 4 
  case CC_B(CC_C(CC_B(_, _), CC_C(_, _)), _) => 5 
  case CC_C(CC_B(_, _), _) => 6 
}
}