package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B[E](a: T_A[T_B[E, E]], b: Boolean) extends T_A[E]
case class CC_C(a: Byte, b: (T_A[Char],T_B[Byte, Char]), c: (T_B[Boolean, Int],T_A[Byte])) extends T_B[T_A[T_A[Boolean]], T_B[Byte, Boolean]]
case class CC_D(a: Boolean, b: CC_A[CC_C], c: CC_B[Boolean]) extends T_B[T_A[T_A[Boolean]], T_B[Byte, Boolean]]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_C(_, _, _)) => 0 
  case CC_A(CC_B(CC_A(_, _), _), CC_C(_, _, _)) => 1 
  case CC_A(CC_B(CC_B(_, _), _), CC_C(_, _, _)) => 2 
  case CC_B(CC_A(CC_A(_, _), _), _) => 3 
  case CC_B(CC_B(CC_A(_, _), _), _) => 4 
  case CC_B(CC_B(CC_B(_, _), _), _) => 5 
}
}
// This is not matched: CC_B(CC_A(CC_B(_, _), _), _)