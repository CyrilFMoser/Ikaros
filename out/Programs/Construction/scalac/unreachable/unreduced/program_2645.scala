package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: D) extends T_A[D]
case class CC_B(a: T_A[T_A[Byte]], b: T_A[CC_A[Byte]], c: T_B[CC_A[Int], (Boolean,Int)]) extends T_A[T_A[Byte]]
case class CC_C(a: Byte) extends T_A[T_A[Byte]]
case class CC_D[E]() extends T_B[E, Boolean]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_B(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _), _) => 1 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _), _) => 2 
  case CC_B(CC_B(CC_C(_), CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _), _) => 3 
  case CC_B(CC_C(_), CC_A(_, CC_A(_, _, _), _), _) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_B(CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _), _)